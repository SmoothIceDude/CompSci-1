	import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Birthday {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

String nameOfChild, chooseToy, cardWithGift = "Yes", ballonWithGift = "Yes", anotherToy;
int childAge;
double average = 0;
Toy toy = new Toy();

System.out.println("BIRTHDAY GIFTS");
System.out.println();

JOptionPane.showMessageDialog(null, "Welcome to the Toy Company \n " + "to choose gifts for young children");

do {
nameOfChild = JOptionPane.showInputDialog(null, "Enter the name of the child");

childAge = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is the child?"));

chooseToy = JOptionPane.showInputDialog(null, "Choose a toy: a plushie, blocks, or a book");

cardWithGift = JOptionPane.showInputDialog(null, "Do you want a card with the gift? Yes or No");

ballonWithGift = JOptionPane.showInputDialog(null, "Do you want a balloon with the gift? " + "Yes or No");

anotherToy = JOptionPane.showInputDialog(null, "Do you want another toy? Yes or No");

toy.setAge(childAge);
toy.setToy(chooseToy);
toy.setCost(chooseToy);

if (cardWithGift.equals("Yes") || cardWithGift.equals("yes")) {
toy.addCard(cardWithGift);
}

if (ballonWithGift.equals("Yes") || ballonWithGift.equals("yes")) {
toy.addBalloon(ballonWithGift);
}

average += toy.getCost();

System.out.println("The gift for " + nameOfChild + toy.toString());

} while (anotherToy.equals("Yes") || anotherToy.equals("yes"));

Random number = new Random();
int output = number.nextInt(100000);
String format = String.format("%05d", output);

System.out.println("The total cost of your order is $" + average + "0 Order number is \n" + format);

System.out.println("Programmer: Malcolm Albright");

}
}

