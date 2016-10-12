/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartphone;

import javax.swing.*;

/**
 *  Author: Somebody that isn't me
 *  Date: 11/10/2016
 */

public class SmartPhoneDriver {
  public static void main(String[] args) {
    SmartPhone sp;

    //Ask for random phone
    String choice = JOptionPane.showInputDialog(
      "Creating SmartPhone object:\n"
      + "1 - Enter the type of smartphone you own\n"
      + "2 - Generate a random smartphone");

    if(choice.equals("2")){
      //Use the default constructor
      sp = new SmartPhone();
    } else if(choice.equals("1")) {
      //Ask user phone type
      String phoneType = JOptionPane.showInputDialog(
        "What type of phone do you own?\nFor example: iPhone");
      sp = new SmartPhone(phoneType);
    } else {
      System.out.println("Invalid selection! Generating random"
        + " smartphone.");
      sp = new SmartPhone();
    }

    //Menu to add apps
    boolean done = false;
    String myApp;
    while(!done) {
      myApp = JOptionPane.showInputDialog(
        "Please type the name of an app to add to your phone.\n"
        + "Type DONE when finished");
      if(myApp.equalsIgnoreCase("done")){
        done = true;
      } else {
        sp.addApp(myApp);
      }
    }

    //Display phone with app list
    JOptionPane.showMessageDialog(null, sp);
  }
}
