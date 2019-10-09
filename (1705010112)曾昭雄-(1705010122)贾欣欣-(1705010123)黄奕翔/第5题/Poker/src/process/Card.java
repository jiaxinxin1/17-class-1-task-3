package process;

public class Card{
    public String color;
    public String number;

    public Card(String color, String number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public int getValue() {
    	int res=0;
    	switch(number) {
    	case "A":res=14;break;
    	case "2":res=2;break;
    	case "3":res=3;break;
    	case "4":res=4;break;
    	case "5":res=5;break;
    	case "6":res=6;break;
    	case "7":res=7;break;
    	case "8":res=8;break;
    	case "9":res=9;break;
    	case "10":res=10;break;
    	case "J":res=11;break;
    	case "Q":res=12;break;
    	case "K":res=13;break;
    	}
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Card))
            return false;
        Card other = (Card) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        return true;
    }

}
