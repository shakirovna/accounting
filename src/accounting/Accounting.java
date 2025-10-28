/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accounting;

import java.util.Scanner;

/**
 *
 * @author lena
 */
public class Accounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
       
        boolean next=true;
        printMenu();
        while(next) {
         int input=scanner.nextInt();    
            switch (input) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
            
          
        printMenu();  
        }
        
    }
    
    public  static void printMenu(){
        
        System.out.println("1. Считать все месячные отчеты ");
        System.out.println("2. Считать годовой отчет ");   
        System.out.println("3. Сверить отчеты ");
        System.out.println("4. Вывести информацию о всех месячныйх отчетах ");
        System.out.println("5. Вывести информацию о  годовом отчетах ");           
        
    }
    
}
