package process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cards {
    private List<Card> list = new ArrayList<Card>();

    //����һ���˿���
    public Cards(){
        System.out.println("-----------------�����˿���------------------");
        String[] color = {"����", "����", "÷��", "����"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q","K", "A"};
        for(int i=0;i<color.length;i++)
            for(int j=0;j<number.length;j++){
                list.add(new Card(color[i], number[j]));
            }   
        System.out.println("----------------�˿��ƴ����ɹ���---------------");
    }

    //��ȡһ���˿���
    public List<Card> getList() {
        return list;
    }

    //ϴ�ƣ����ң�
    public void shufCards(){
        System.out.println("----------------��ʼϴ��------------------------");
        Collections.shuffle(list);
        System.out.println("----------------ϴ�ƽ���------------------------");
    }

    //չʾһ���˿���
    public void showCards(){
        System.out.print("��ǰ���˿���Ϊ��");
        System.out.print("[ ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i).getColor() + list.get(i).getNumber()+ " ");
        }
        System.out.println(" ]");
    }

}