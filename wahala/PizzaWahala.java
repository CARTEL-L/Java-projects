import java.util.Scanner;
public class PizzaWahala{
public static void main(String[] args){
 Scanner inputCollector = new Scanner(System.in);

                
    System.out.print("=======================\n   Iya Aramide Pizza\n=======================");

System.out.println("\n Menu 😋️");
    System.out.println("1: Sapa size");
    System.out.println("2: Small money");
    System.out.println("3: Big boys");
    System.out.println("4: Odogwu");

    System.out.print("\n What would you care for: ");
     int order = inputCollector.nextInt();

 int sapaSize = 2500;
 int smallMoney = 2900;
 int bigBoys = 4000;
 int odogwu = 5200;

if(order == 1){
System.out.println(sapaSize - 2500 + 4 + " Slices per box");
}else if(order == 2){
System.out.println(smallMoney - 2900 + 6 + " Slices per box");
}else if(order == 3){
System.out.println(bigBoys - 4000 + 8 + " Slices per box");
}else if(order == 4){
System.out.println(odogwu - 5200 + 12 + " Slices per box");
}


System.out.print("\nNumber of guest: ");
    int guest = inputCollector.nextInt();

   
//System.out.println()

     System.out.print("\n How many boxes whould you like: ");
    int boxes = inputCollector.nextInt();

//int 


if(order == 1){
 System.out.println("The total is $" + sapaSize * boxes);
}else if(order == 2){
 System.out.println("The total is $" + smallMoney * boxes);
}else if(order == 3){
 System.out.println("The total is $" + bigBoys * boxes);
}else if(order == 4){
 System.out.println("The total is $" + odogwu * boxes);
}

     int leftOver1 = order + boxes * 4 - guest - 1;
     int leftOver2 = order + boxes * 6 - guest - 2;
     int leftOver3 = order + boxes * 8 - guest - 3;
     int leftOver4 = order + boxes * 12 - guest - 4;

if(order == 1){
System.out.println("And a leftover of " + leftOver1 + " slices");
}else if(order == 2){
System.out.println("And a leftover of " + leftOver2 + " slices");
}else if(order == 3){
System.out.println("And a leftover of " + leftOver3 + " slices");
}else if(order == 4){
System.out.println("And a leftover of " + leftOver4 + " slices");
}





    }
}

