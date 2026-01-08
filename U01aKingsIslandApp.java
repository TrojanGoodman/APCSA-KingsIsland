
import java.util.Scanner;

// A group of people are traveling to King's Island for the day.
// Everyone in the group is car-pooling and has agreed to split the cost evenly.
// Write a program to determine the total cost of the trip and
// the cost per person.
// Assume that each ticket is $32.99

public class U01aKingsIslandApp {

  public static double calculateTotalCost(int num_people, double ticket_cost, double parking_cost, double gas_cost) {
    // TODO calculate the total cost
    return num_people * ticket_cost + parking_cost + gas_cost;
  }

  public static double calculateCostPerPerson(double total_cost, int num_people) {
    // TODO calculate the cost per person
    return total_cost / num_people;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // TODO MUST declare variables for number of people, parking cost, cost of gas,
    // ticket cost, total cost, and cost per person
    int num_people;
    double parking_cost;
    double gas_cost;
    double total_cost;
    double average_cost;
    String formattedTotalCost;
    String formattedAverageCost;
    // TODO Prompt for and collect input for number of people in the group.
    // Hint: use input.nextInt() to collect an integer number
    System.out.print("Enter the number of people: ");
    num_people = input.nextInt();
    // TODO Prompt for and collect input for cost of parking. For example, 5.50
    System.out.print("Enter the cost of parking: ");
    parking_cost = input.nextDouble();

    // TODO Prompt for and collect amount spent on gas. For example, 15.75
    System.out.print("Enter the amount spent on gas: ");
    gas_cost = input.nextDouble();

    // Calculate the total expenses. Each ticket is 32.99.
    // TODO Use the method calculateTotalCost(int num_people, double ticket_cost, double
    // parking_cost, double gas_cost) to get the total cost
    total_cost = calculateTotalCost(num_people, 32.99, parking_cost, gas_cost);
    formattedTotalCost = String.format("%.2f", total_cost);
    // Calculate the average cost per person
    // TODO Use the method calculateCostPerPerson(double total_cost, int num_people)
    average_cost = calculateCostPerPerson(total_cost, num_people);
    // TODO Display the total cost and the cost per person
    formattedAverageCost = String.format("%.2f", average_cost);
    System.out.println("King's Island Cost Report");
    System.out.println("Total Cost = $" + formattedTotalCost);
    System.out.println("Cost Per Person = $" + formattedAverageCost);
  }
}
