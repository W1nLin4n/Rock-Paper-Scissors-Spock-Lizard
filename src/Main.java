public class Main {


    public static void main(String[] args) {
        int choice =9;
        while(choice !=0){
            choice = DataInput.getInt("your chose?\n" +
                    "1)Rock \n" +
                    "2)Paper \n" +
                    "3)Scissors \n" +
                    "4)Spock\n" +
                    "5)lizard \n" +
                    "0)close program");
            int bot = (int)Math.floor(Math.random()*5) + 1;
            if(choice==0){

            }else{
                if(bot ==1 ){
                    System.out.println("bot got ROCK");
                }else if(bot==2){
                    System.out.println("bot got PAPER");
                }else if(bot==3){
                    System.out.println("bot got Scissors");
                }else if(bot==4){
                    System.out.println("bot got Spock");
                }else if(bot==5){
                    System.out.println("bot got lizard");
                }

                if((choice == 1 && (bot == 4 || bot == 2))||
                        (choice == 2 && (bot ==5 || bot == 3))||
                        (choice == 3 && (bot == 1 || bot ==4))||
                        (choice == 4 && (bot == 5 || bot == 2))||
                        (choice == 5 && (bot == 1 || bot == 3))
                ){
                    System.out.println("you lost");
                }else if(choice==bot){
                    System.out.println("DRAW");
                }else {
                    System.out.println("YOU WON!!!");
                }
            }

        }

    }
}