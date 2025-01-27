
package VotingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingMain {
    private static CandidaterRegister register = new CandidaterRegister();
    public static void main(String[] args) {
        System.out.println("--- welcome to the Voting Arena ---");

        String menu = """
                1. Register as a Candidate
                2. Register as a voter
                3. Cast your vote
                4. View result
                5. Exit program
                """;
        System.out.println(menu);
        while (true) {
            System.out.println("what will u like to do");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    registerCandidate();
                    break;
                case 2:
                    registerVoter();
                    break;
                case 3:
                    vote();
                    break;
                case 4:
                    viewResult();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
        public static void viewResult() {
        }

        public static void vote() {

    }

    public static void registerVoter() {
        List<Voter> voter = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the voter: ");
        String name = sc.nextLine();
        System.out.println("Please enter your password: ");
        String password = sc.next();
        System.out.println("Please enter the age of the voter: ");
        int age = sc.nextInt();
        voter.add(new Voter(name, password, age));
        System.out.println("you have successfully registered");

    }

    public static void registerCandidate() {
            List<Candidate> candidates = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the candidate: ");
        String name = sc.nextLine();
        System.out.println("Please enter the phoneNumber of the candidate: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Please enter the age of the candidate: ");
        int age = sc.nextInt();
        CandidaterRegister.registerCandidate(name,phoneNumber,age);
        System.out.println("You have successfully registered ");
        candidates.add(new Candidate(name,phoneNumber,age));

        }
    }

