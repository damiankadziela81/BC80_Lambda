import javax.swing.*;

public class MyFrame extends JFrame {
    JButton button = new JButton("PRESS ME");
    JButton button2 = new JButton("PRESS ME TOO");

    MyFrame(){

        button.setBounds(150,100,200,50);
        button2.setBounds(150,300,200,50);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("You clicked a button");
//            }
//        });

        button.addActionListener(e -> System.out.println("You clicked a button"));
        button2.addActionListener(e -> System.out.println("You clicked this button too"));

        this.add(button);
        this.add(button2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);


    }
}
