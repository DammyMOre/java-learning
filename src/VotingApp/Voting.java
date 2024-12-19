package VotingApp;

import java.util.List;

public class Voting {
        private List<Candidate> candidates;

        public Voting(List<Candidate> candidates) {
            this.candidates = candidates;
        }

        public void displayCandidates() {
            System.out.println("Candidates:");
            for (int count = 0; count < candidates.size(); count++) {
                System.out.println((count + 1) + ". " + candidates.get(count).getName());
            }
        }

        public void voteForCandidate(int candidateCount) {
            if (candidateCount >= 1 && candidateCount <= candidates.size()) {
                candidates.get(candidateCount - 1).incrementVotes();
                System.out.println("Voted for: " + candidates.get(candidateCount - 1).getName());
            }
            else {
                System.out.println("Invalid candidate selection.");
            }
        }

        public void displayResults() {
            System.out.println("Voting Results:");
            for (Candidate candidate : candidates) {
                System.out.println(candidate.getName() + ": " + candidate.getVotes() + " votes");
            }
        }
    }

