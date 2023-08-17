import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
    
        Scanner entry = new Scanner(System.in);
        int num;
        int total = 0;

        System.out.print("Welcome to Peluchi's store "
           +"\n 1.Canys Plush Toys "
           +"\n 2.Toys Stuffed "
           +"\n option : ");
           num = entry.nextInt();

        switch (num) {
            //mandaos a llamar a la funcion y le pasmos los argumentos
            case 1:  
                total = stuffedModels("Candys", "Chocolate", "Cookies", 30, 20);
                System.out.println("-------------------------");
                if(total == 0 ){
                    System.out.println("error");
                }else { 
                    System.out.print("The total amount of your purchase is: " + total);
                }
            break;

            case 2:  
                total = stuffedModels("Toys", "Gog", "Cat", 100, 300); 
                System.out.println("-------------------------");
                if(total == 0 ){
                System.out.println("error");
                }else { 
                    System.out.print("The total amount of your purchase is: " + total);
                }
            break;

            default:
                System.out.println("sorry had a mistake");
            break;
        }
        
   } 

   //creamos la funcion y asignamos los parametros que vamos a recibir
public static int stuffedModels( String title, String optionName1, String optionName2, int optionPrice1, int optionPrice2 ) {
     Scanner entry = new Scanner(System.in);

     System.out.println("-------------------------");

     System.out.print("Stuffeds of " + title 
      +"\n 1. " + optionName1 + " plush  - $" + optionPrice1
      +"\n 2. " + optionName2 + " plush  - $" + optionPrice2
      +"\n option : ");
      int option = entry.nextInt();
 
      if(option == 1){
         return optionPrice1;
      } else if (option == 2){
         return optionPrice2;
      }
 
     return 0;
   }
 




   public static int  anime (){

    Scanner entry = new Scanner(System.in);

    System.out.print("Anime Plush Toys "
     +"\n 1.Miku plush $10000 "
     +"\n 2.Naruto plush toys 2000 "
     +"\n 3.Kobayashi plush 50000 "
     +"\n 4.Gon Plush 70000"
     +"\n 5.Alucar Plush 900000 "
     +"\n option : ");
     int option = entry.nextInt();

     if(option == 1){
        return 10000;
     } else if (option == 2){
        return 2000;
    }else if (option == 3){
        return 50000;
    }else if(option == 4){
        return 70000;
    } else if (option == 5){
        return 90000;
    } 
    
    return 0;
   } 

   public static int  food (){

    Scanner entry = new Scanner(System.in);

    System.out.print("Food Plush Toys "
     +"\n 1.Watermelon plush $6000 "
     +"\n 2.Apple plush toys $400 "
     +"\n 3.Rice plush $9000 "
     +"\n 4.Sushi Plush $30000"
     +"\n 5.Strawberry Plush $7000 "
     +"\n option : ");
     int option = entry.nextInt();
   
     if(option == 1){
        return 6000;
     } else if (option == 2){
        return 400;
    }else if (option == 3){
        return 9000;
    }else if(option == 4){
        return 30000;
    } return 7000;
  }

  public static int animals (){

    Scanner entry = new Scanner(System.in);

    System.out.print("Food Plush Toys "
     +"\n 1.dogs plush $3000 "
     +"\n 2.cats plush toys $90000 "
     +"\n 3.whale plush $6000 "
     +"\n 4.lion Plush $8000"
     +"\n 5.rabbit Plush $5000 "
     +"\n option : ");
     int option = entry.nextInt();

     if(option == 1){
        return 3000;
     } else if (option == 2){
        return 60000;
    }else if (option == 3){
        return 9000;
    }else if(option == 4){
        return 8000;
    } return 5000;
  }

  public static int artists (){

    Scanner entry = new Scanner(System.in);

    System.out.print("Food Plush Toys "
     +"\n 1.Lana del Rey plush $600000 "
     +"\n 2.Leon larregui plush toys $900000 "
     +"\n 3.Enrique bunbury plush $900000 "
     +"\n 4.Cuco Plush $300000"
     +"\n 5.Morrissey Plush $900000 "
     +"\n option : ");
     int option = entry.nextInt();

     if(option == 1){
        return 600000;
     } else if (option == 2){
        return 900000;
    }else if (option == 3){
        return 900000;
    }else if(option == 4){
        return 300000;
    } return 900000;
  }




}

