/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dogtester;

/**
 *  Author: Somebody that is me
 *  Date: 11/10/2016
 *  Purpose: To print out data given from the Dog class
 */


public class DogTester {
  public static void main(String[] args) {
    //Instantiates two "Dogs" with the specified info
    Dog dog1 = new Dog("Rover", "Spaniel", 8, 4);
    Dog dog2 = new Dog("Spot", "Border Collie");
    //Instantiates and takes the info from the Dog method that has info pre assigned
    Dog dog3 = new Dog();

    //Print the details of each dog
    System.out.println(dog1.toString());
    System.out.println("--------------------------");

    System.out.println(dog2.toString());
    System.out.println("--------------------------");

    //toString() is called by default, no need to write it!
    System.out.println(dog3);
    System.out.println("--------------------------");

    //dog1 barks friendly, dog2 barks angry
    dog1.barkFriendly();
    dog2.barkAngry();
  }
}

