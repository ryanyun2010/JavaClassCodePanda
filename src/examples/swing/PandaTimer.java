package examples.swing;//package examples.swing;

import javax.swing.*;
import java.awt.*;

public class PandaTimer {
  public static void main(String[] args) {
    var frame = new JFrame("Countdown Timer");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    var countdownDone=false;
    var panel = new JPanel(new BorderLayout());
    var button = new JButton("Start\r Countdown");
    var timeLeft = new JLabel("");
    long secondsLeft=0;
    String timeText = "";
    timeLeft.setHorizontalAlignment(SwingConstants.CENTER);
    timeLeft.setPreferredSize(new Dimension(300, 30));
    panel.add(timeLeft, BorderLayout.CENTER);
    panel.add(button, BorderLayout.SOUTH);
    button.addActionListener(e -> {
      long startingTime = System.currentTimeMillis();
      long startingMinsLeft = 5L;
      long endingTime = startingTime+startingMinsLeft*60000L;
      long miliLeft=startingMinsLeft*60*1000;
      new Timer(1_000,(actionEvent) -> {
        System.out.println(System.currentTimeMillis());
       // if(System.currentTimeMillis() > endingTime-1) {
         // countdownDone = true;
          //timeLeft.setText("DONE DONE DONE");
        //}else {
      //    miliLeft=System.currentTimeMillis()-startingTime;
        //  secondsLeft=miliLeft/1000;
         // timeLeft.setText(String.valueOf(secondsLeft));

        //}
      }).start();
    });
    frame.setContentPane(panel);
    frame.pack();
    frame.setVisible(true);
  }
}
