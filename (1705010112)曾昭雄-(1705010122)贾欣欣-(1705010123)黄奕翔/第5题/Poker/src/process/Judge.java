package process;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Comparator;

import process.Player;
import process.Card;
import process.Cards;

public class Judge {
    private static Card[] handCards = new Card[3];
   public static void getCards(Player p) {
	   handCards[0]=p.getHandCards().get(0);
	   handCards[1]=p.getHandCards().get(1);
	   handCards[2]=p.getHandCards().get(2);
   }
   public static int getkinds(Player p) {
	   getCards(p);
	   int kinds=0;
	   if(handCards[0].getColor()==handCards[1].getColor() && handCards[0].getColor()==handCards[2].getColor()) {
		   return 5;
	   }
	   else if(handCards[0].getValue()+1==handCards[1].getValue() && handCards[1].getValue()+1==handCards[2].getValue()) {
		   return 4;
	   }
	   else if(handCards[0].getValue()+1==handCards[2].getValue() && handCards[2].getValue()+1==handCards[1].getValue()) {
		   return 4;
	   }
	   else if(handCards[1].getValue()+1==handCards[0].getValue() && handCards[0].getValue()+1==handCards[2].getValue()) {
		   return 4;
	   }

	   else if(handCards[1].getValue()+1==handCards[2].getValue() && handCards[2].getValue()+1==handCards[0].getValue()) {
		   return 4;
	   }
	   
	   else if(handCards[2].getValue()+1==handCards[0].getValue() && handCards[0].getValue()+1==handCards[1].getValue()) {
		   return 4;
	   }
	   else if(handCards[2].getValue()+1==handCards[1].getValue() && handCards[1].getValue()+1==handCards[0].getValue()) {
		   return 4;
	   }
	   else if(handCards[1].getValue()==handCards[2].getValue() && handCards[2].getValue()==handCards[0].getValue()) {
		   return 3;
	   }
	   else if(handCards[1].getValue()==handCards[2].getValue()) {
		   return 2;
	   }
	   else if(handCards[1].getValue()==handCards[0].getValue()) {
		   return 2;
	   }
	   else if(handCards[2].getValue()==handCards[0].getValue()) {
		   return 2;
	   }
	   else return 1;
   }
    public static int getsum(Player p) {
    	getCards(p);
    	return handCards[1].getValue()+handCards[2].getValue()+handCards[0].getValue();
    }	
    public static int compare(Player p,Player r) {
    	int k1=0,k2=0,s1=0,s2=0;
    	k1=getkinds(p);
    	k2=getkinds(r);
    	s1=getsum(p);
    	s1=getsum(r);
    	if(k1==k2&&s1==s2) return 0;
    	if(k1==k2) return s1>s2 ? 1 : -1;
    	return k1>k2 ? 1 : -1;
    }
}