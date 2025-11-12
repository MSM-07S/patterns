//alex wang
//this program _______
import java.util.Scanner;
public class patterngen{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("what pattern type: ");
        String patternType = input.nextLine().toLowerCase().trim();
        System.out.println("what integer: ");
        int integerInput = Integer.parseInt(input.nextLine().trim());
        input.close();

        if (patternType.equals("stars") || patternType.equals("star")){
            stars(integerInput);
        }
        else if (patternType.equals("triangle") || patternType.equals("triangles")){
            triangle(integerInput);
        }
        else if (patternType.equals("odds")){
            odds(integerInput);
        }
        else if (patternType.equals("eo")){
            eo(integerInput);
        }
        else if (patternType.equals("pyramid") || patternType.equals("pyramids")){
            pyramid(integerInput);
        }

    }

    public static void stars(int rows){
        //precon: the user will input an integer 
        //postcon: the program will print out stars starting at 1...
        //...and then increasing by 2 for each row up to the inputted amount of rows
        System.out.println("stars runs");
        String star = "*";
            while (rows > 0){
                    System.out.print(star);
                    star += "**";
                rows--;
            System.out.println();
            }
    }

    public static void triangle(int rows){
        //precon: takes an integer input
        //postcon: prints out numbers starting from 1 - # of rows. each row will have one more number than the last
        System.out.println("triangle runs");
        int rowNumber = 1;
        
        while(rowNumber <= rows){        //for(int rowNumber = 1; rowNumber<=rows; rowNumber++)
            int number = rowNumber;
            while (number > 0){
            System.out.print(rowNumber + "");
                    number --;
            }
            System.out.println();
            rowNumber++;
        }

    }

    public static void odds(int start){
        //precon: takes an ODD integer input
        //postcon: prints out numbers starting at the inputted amount and subtracting 2 from that number each time. each row will have 2 less numbers than the last
    
        System.out.println("odds runs");
        for(int i = start; i > 0; i-=2){
              //System.out.println("in outer loops");
            int number = start;
            for (int j = 0; j < start; j++){
                  //System.out.println("inner loops");
                    System.out.print(number +"");
                    
            }
            number-=2;
            start-=2;
            System.out.println();
            
        }


    }

    public static void eo(int maxE){
        //precon: a maximum value for E is put in (integer)
        //postcon: the program will print E and O's alternating. Each new line has one more letter as it alternates. 
        //once the length of maxE is hit, the program will do the same but each new line will have one less letter.
        System.out.println("eo runs");
        
        String letter = "O";
        
            
            for (int i = 1; i <= maxE; i++){

                    if(i %2 == 0){
                    letter= "E";
                    }else if (i % 2 != 0){
                        letter = "O";
                    }
                   for(int j =0; j <i; j++){
                        System.out.print(letter);
                   }
                   System.out.println();
                    
            }
            
            //System.out.print("bottom start next:");
            for (int i = maxE-1; i > 0; i--){

                    if(i %2 == 0){
                    letter= "O";
                    }else if (i % 2 != 0){
                        letter = "E";
                    }
                   for(int j =0; j <i; j++){
                        System.out.print(letter);
                   }
                   System.out.println();
                    
            }
            


    }

    public static void pyramid(int rows){
        //precon: input an integer
        //postcon: will print [rows] amount of rows. each row has rows*2 - 1 numbers starting from 1 up to rows. each following row has 2 less numbers and has spacings to make it
        //look like a pyramid pointing downwards.

        //when pyramid(5) is called:

        //111111111 - 9 numbers, 0 spaces before
        // 2222222  - 7 numbers, 1 space before
        //  33333   - 5 numbers, 2 spaces before
        //   444    - 3 numbers, 3 spaces before
        //    5     - 1 number, 4 spaces before

        System.out.println("pyramid runs");
        int number = 1;
        int start = rows*2 -1;
        //System.out.println("start is: " + start);
        String spaces = "";
        for (int i = 0; i < rows; i++){ // runs 5 times for 5 rows of numbers.
            
            System.out.print(spaces);
            for (int j = start; j > 0; j--){ //this is what makes the numbers x numbers long.
                
                System.out.print(number + "");
                //System.out.print("j = " + j);
            }
            
            System.out.println();
            number++;
            spaces+= " ";
            start-=2;
            

        }
        

    }


}

//for last problem, take input value*2 and subtract 1.