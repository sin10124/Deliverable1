/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;

/**
 *
 * @author akash
 */
import java.util.*;
public class Main {
    
    public static void main(String args[])
    {
        Scanner in  =new Scanner(System.in);
        
        System.out.print("Player 1 name: ");
        String n1 = in.nextLine();
        System.out.print("Player 1 ID: ");
        String id1 = in.nextLine();
        
        
        
        System.out.print("Player 2 name: ");
        String n2 = in.nextLine();
        System.out.print("Player 2 ID: ");
        String id2 = in.nextLine();
        
        
        System.out.print("Player 3 name: ");
        String n3 = in.nextLine();
        System.out.print("Player 3 ID: ");
        String id3 = in.nextLine();
        
        
        
        System.out.print("Player 4 name: ");
        String n4 = in.nextLine();
        System.out.print("Player 4ID: ");
        String id4= in.nextLine();
        
       GroupOfCards g = new GroupOfCards(52);
       g.showCards();
       g.shuffle();
       
       
       
        
        
    }
    
}
