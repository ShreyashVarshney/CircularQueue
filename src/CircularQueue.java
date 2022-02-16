import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CircularQueue {
    int ar[];
    int Front, Rear;

    CircularQueue() {
        ar = new int[5];
        Front = -1;
        Rear = -1;
    }

    void insert() {
        if((Front==0&& Rear==ar.length-1)||Rear==Front-1){
            System.out.println("Circular Queue full");
        }
        else{
            System.out.println("Enter any data");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            if(Front==-1){
                Front=0;
            }
            else if(Rear<4){
                Rear=Rear+1;
                ar[Rear]=data;
            }
            else if(Rear==4 && Front!=0){
                Rear = 0;
                ar[Rear]=data;
            }
            else if(Rear<Front) {
                Rear = Rear + 1;
                ar[Rear]=data;
            }
            System.out.println("Data inserted....");

        }

    }

    void delete() {
        if(Front==-1||Rear==-1){
            System.out.println("Circular Queue is empty");
        }
        else{
            System.out.println("deleted..."+ar[Front]);
            if(Front==Rear){
                Front=-1;
                Rear=-1;
            }
            else if(Front<Rear){
                Front=Front+1;
            }
            else if(Front==4&&Rear!=0){
                Front=0;
            }
        }
    }

    void traverse() {
        if (Front == -1 || Rear == -1) {
            System.out.println("Circular queue empty");
        } else {
            System.out.println("");
            if (Front <= Rear) {
                for (int i = Front; i <= Rear; i++) {
                    System.out.println("" + ar[i]);
                }
            } else {
                for (int i = Front; i <= 4; i++) {
                    System.out.println("" + ar[i]);
                }
                for (int i = 0; i <= Rear; i++) {
                    System.out.println("" + ar[i]);
                }
            }
        }

    }


    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue();
        while(true){
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for Exit");
            System.out.println("Enter ur choice");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

}
