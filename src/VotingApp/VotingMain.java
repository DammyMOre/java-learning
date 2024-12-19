package VotingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingMain {

    public static void main(String[] args) {
        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Dammy"));
        candidates.add(new Candidate("Tobi"));
        candidates.add(new Candidate("Ibrahim"));

        Voting voting = new Voting(candidates);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--- welcome to the Voting Arena ---");
            voting.displayCandidates();

            System.out.print("Enter the candidate number to vote or 0 to show results: ");
            int myChoice = scanner.nextInt();

            if (myChoice == 0) {
                voting.displayResults();
            } else {
                voting.voteForCandidate(myChoice);
            }

            System.out.print("Do you want to vote again? (yes/no): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }
        voting.displayResults();
        System.out.println("Thank you for voting!");
    }

    }

