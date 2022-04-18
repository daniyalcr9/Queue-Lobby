package dsafriday;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class DSAFriday {
    public DSAFriday(){
        dsafriday.LinkedQueue1 lq=new dsafriday.LinkedQueue1();

        JFrame frame=new JFrame("Demonstration of Queue");
        JPanel panel=new JPanel(null);
        panel.setBounds(0,0,400,600);
        panel.setBackground(Color.white);

        JButton addelement=new JButton("Add Element");
        addelement.setBounds(100,80,180,35);
        addelement.setBackground(Color.black);
        addelement.setForeground(Color.white);
        addelement.setFocusable(false);
        addelement.setBorder(BorderFactory.createLineBorder(Color.black));
        addelement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input= JOptionPane.showInputDialog("Add Element from input:");
                if(input!=null && input!="" && input!=" "){
                    lq.add(input);
                    JOptionPane.showMessageDialog(null,"Added Element: ("+input+") to Queue!");
                }else{
                    JOptionPane.showMessageDialog(null, "No input given");
                }

            }
        });

        JButton firstelement=new JButton("First Element!");
        firstelement.setBounds(100,145,180,35);
        firstelement.setBackground(Color.black);
        firstelement.setForeground(Color.white);
        firstelement.setFocusable(false);
        firstelement.setBorder(BorderFactory.createLineBorder(Color.black));
        firstelement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lq.First()!=null){
                    JOptionPane.showMessageDialog(null, "First Element is: ("+lq.First()+")");
                }
            }
        });


        JButton removetelement=new JButton("Remove Element!");
        removetelement.setBounds(100,210,180,35);
        removetelement.setBackground(Color.black);
        removetelement.setForeground(Color.white);
        removetelement.setFocusable(false);
        removetelement.setBorder(BorderFactory.createLineBorder(Color.black));
        removetelement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lq.remove();
            }
        });


        JButton size=new JButton("Size Queue!");
        size.setBounds(100,275,180,35);
        size.setBackground(Color.black);
        size.setForeground(Color.white);
        size.setFocusable(false);
        size.setBorder(BorderFactory.createLineBorder(Color.black));
        size.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Size of Queue is:"+lq.size());
            }
        });



        JButton showelements=new JButton("show elements!");
        showelements.setBounds(100,340,180,35);
        showelements.setBackground(Color.black);
        showelements.setForeground(Color.white);
        showelements.setFocusable(false);
        showelements.setBorder(BorderFactory.createLineBorder(Color.black));
        showelements.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lq.showall();
            }
        });

        JButton removeall=new JButton("Make Queue Empty!");
        removeall.setBounds(100,405,180,35);
        removeall.setBackground(Color.black);
        removeall.setForeground(Color.white);
        removeall.setFocusable(false);
        removeall.setBorder(BorderFactory.createLineBorder(Color.black));
        removeall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length=lq.size();
                if(length==0){
                    JOptionPane.showMessageDialog(null, "Queue is Already Empty!");
                }else{
                    for(int i=lq.size();i!=0;i--){
                        lq.remove();
                    }
                    JOptionPane.showMessageDialog(null, "Removed all elements!");
                }
            }
        });

        panel.add(removeall);
        panel.add(showelements);
        panel.add(size);
        panel.add(removetelement);
        panel.add(firstelement);
        panel.add(addelement);
        frame.add(panel);
        frame.setLayout(null);
        frame.setSize(400,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new DSAFriday();
    }

}
