public class Main {

    public static void main(String[] args) {
        //*For Loop

        System.out.println("Count in inches!");

        for (int count = 1; count <= 15; count++) {
            System.out.println(count + " in");
        }


        //*Dowhile Loop

        int number = 0;
        do {
            System.out.println(+number);
            number++;
            System.out.println(+number * 25.4 + "mm");
        }while (number<16);



        //*While Loop

        System.out.println("Count in millimeters");

        int Counts = 0;
        while (Counts <= 15) {
            System.out.println(Counts);
            Counts++;
            System.out.println(Counts * 25.4 + "mm");
        }


    }

    }
