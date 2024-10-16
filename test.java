import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import java.util.Scanner;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


//ListSelectionListener
//valueChanged
//ListSelectionEvent

public class test {
    public static void main(String[] args) {
        String[] dayList = {"Monday", "Tuesday", "Thursday", "Wednesday", "Friday", "Saturday", "Sunday"};
        JList list = new JList(dayList);
        list.setBounds(50, 150, 150, 150);
        
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        JLabel jbl = new JLabel();
        jbl.setBounds(50, 350, 150, 30);
        list.addListSelectionListener(new ListSelectionListener(){
           public void valueChanged(ListSelectionEvent e){
                if(!e.getValueIsAdjusting()){
                    jbl.setText((String) list.getSelectedValue());
                }
           }
        });
        
        frame.add(jbl);
        frame.add(list);
        frame.setLayout(null);
        frame.setLocationRelativeTo(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}