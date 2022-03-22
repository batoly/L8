import java.util.Scanner;

/**
 * Created by Lenovo on 2/27/2022.
 */
public class TESTDOUBLY {
    public static void main(String[] args) {
        DoublyLinkedList<String>List=new DoublyLinkedList<>();
        Scanner in=new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add first\t2 add last\t3 remove first"+"\t4 remove last\t0 exit");
        while (choice!=0){
            System.out.println("your choice");
            choice=in.nextInt();
            switch (choice)
            {

                case 0:
                    System.exit(0);
               break;
                case 1:
                    System.out.println("input a name");
                    List.addFirst(in.next());
                    break;
            case 2:
                System.out.println("input a name");
                List.addLast(in.next());
                break;
                case 3:
                    System.out.println("removed is :"+List.removeFirst());
                    break;
                case 4:
                    System.out.println("removed is:"+List.removeLast());
                    break;
        }
            System.out.println("first="+List.first()+"\t last ="+List.last()+""+ "size= "+List.size());}
    }
}
