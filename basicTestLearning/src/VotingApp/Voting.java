//package VotingApp;
//
//import java.util.List;
//
//public class Voting {
//        private List<Candidate> candidates;
//        private List<Voter> voters;
//        private int votes;
//
//        public Voting(List<Voter> candidates, int votes) {
//            this.candidates = candidates;
//            this.votes = 0;
//        }
//        public Voting(List<Voter>voters,int votes) {
//        this.voters = voters;
//        this.votes = 0;
//      }
//
//        public void displayCandidates() {
//            System.out.println("Candidates:");
//            for (int count = 0; count < candidates.size(); count++) {
//                System.out.println((count + 1) + ". " + candidates.get(count).getName());
//            }
//        }
//
//    public void setVotes() {
//        this.votes++;
//    }
//    public int getVotes() {
//        return votes;
//    }
//    public void incrementVotes() {
//        this.votes++;
//    }
//
//        public void voteForCandidate(int candidateCount) {
//            if (candidateCount >= 1 && candidateCount <= candidates.size()) {
//               // candidates.get(candidateCount - 1).incrementVotes();
//                System.out.println("Voted for: " + candidates.get(candidateCount - 1).getName());
//            }
//            else {
//                System.out.println("Invalid candidate selection.");
//            }
//        }
//
//        public void displayResults() {
//            System.out.println("Voting Results:");
//            for (Candidate candidate : candidates) {
//               // System.out.println(candidate.getName() + ": " + candidate.getVotes() + " votes");
//            }
//        }
//    }
//
