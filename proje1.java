import java.util.Scanner;

public class proje1 {
public static void main (String[] args){

    int mat,physic,history,turkish,music,chemistry;
    
    Scanner input = new Scanner(System.in);

    System.out.print("Mat Note :");
    mat = input.nextInt();

    System.out.print("Physic Note :");
    physic = input.nextInt();

    System.out.print("History Note :");
    history = input.nextInt();

    System.out.print("Turkish Note :");
    turkish = input.nextInt();

    System.out.print("Music Note :");
    music = input.nextInt();

    System.out.print("Chemistry Note :");
    chemistry = input.nextInt();

    double outcome = (mat + physic + history + turkish + music + chemistry) / 6.0;
    System.out.println("Note Avarage :" + outcome);

/*if(sonuc > 60){
    System.out.println("You Passed The Class");
    
}
   
        else{
            System.out.println("You  Failed The Class");
        }

        
    }*/

    String outcome1 =(outcome > 60) ? " You Passed The Class" : "You Failed The Class";

    System.out.println(outcome1);
}

}
