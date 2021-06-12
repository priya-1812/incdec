/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incdec;
import java.util.Scanner;
public class Incdec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%4==0)
        {
           n++;
           System.out.println(n);
        }
        else
        {
            n--;
             System.out.println(n);
        }
        
              
    }
    
}
