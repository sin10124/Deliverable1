/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Sub_Player extends Player{

    public Sub_Player(String name) {
        super(name);
    }

    @Override
    public void play() {
       
        Scanner in  =new Scanner(System.in);
        Main m = new Main();
        GroupOfCards g = new GroupOfCards(52);
        
        g.showCards();
        g.shuffle();
        
        ArrayList p1=(ArrayList) g.cards.subList(0, 13);
        ArrayList p2=(ArrayList) g.cards.subList(14, 26);
        ArrayList p3=(ArrayList) g.cards.subList(27, 39);
        ArrayList p4=(ArrayList) g.cards.subList(40, 53);
        System.out.println("p1= "+p1);
        System.out.println("p2= "+p2);
        System.out.println("p3= "+p3);
        System.out.println("p4= "+p4);

        
        
        
        
        
        
        
        
        
        
        
        
        /**int cardrem=52; String card1="2 diamonds", card2, card3, card4; String grt=card1;
        while(cardrem!=0)
        {   
            
            System.out.println("its Player 1's turn \n throw a card");
            System.out.println("type the card number follwed by a space and them suit name");
            card1 = in.nextLine();
            
            System.out.println("its Player 2's turn \n throw a card");
            System.out.println("type the card number follwed by a space and them suit name");
            card2 = in.nextLine();
            
            System.out.println("its Player 3's turn \n throw a card");
            System.out.println("type the card number follwed by a space and them suit name");
            card3 = in.nextLine();
            
            System.out.println("its Player 4's turn \n throw a card");
            System.out.println("type the card number follwed by a space and them suit name");
            card4 = in.nextLine();
            
            if(card1.charAt(2)==card2.charAt(2) && card2.charAt(2)==card3.charAt(2)&& card3.charAt(2)==card4.charAt(2) )
            {
                cardrem = cardrem-4;
            }
            
         
            
        }**/
        
        
    }
    
}
