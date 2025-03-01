import java.util.Scanner;
class Pattern {

    public static void main(String[] args){
        Scanner S = new Scanner(System.in);

        int Num, i, j, k;
        System.out.println("Enter the required count");
        Num = S.nextInt();
        for(i=0;i<(2*Num);i++){
            if(i<Num){
             for(j=Num-i;j>=1;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
        else {
            for(j=i-Num;j>=0;j--){
                System.out.print(" ");
        }
        for(k=i-Num;k<Num;k++){
            System.out.print("* ");
        }

        System.out.println();
        } 
    }
    


        
    }
}