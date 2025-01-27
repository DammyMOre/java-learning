package VotingApp;

import java.util.ArrayList;
import java.util.List;

public class CandidaterRegister {
    private static List<Candidate> candidates;
    private List<Voter> voters;
    private int numberOfVoter;
    private static int numberOfCandidate;

    public CandidaterRegister() {
        this.candidates = new ArrayList<>();
        this.voters = new ArrayList<>();
        this.numberOfVoter = 0;
        this.numberOfCandidate = 0;
    }

    public static void registerCandidate(String name, String phoneNumber, int age) {
        Candidate candidate = new Candidate (name,phoneNumber, age);
        candidates.add(candidate);
        numberOfCandidate ++;
        if(age<18) {
            throw new IllegalArgumentException("Candidate must be at least 18 years old.");
        }

    }
    public boolean isCandidateNameExist(String name) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String systemCanGenerateCandidateId(){
        return "NG"+ (candidates.size()+1);
    }

    public int getNumberOfCandidate() {
        return candidates.size();
    }

    public void registerVoter(String name,String password,int age) {
        Voter voter = new Voter(name,password,age);
        voters.add(voter);
        numberOfVoter ++;
        if(age<18) {
            throw new IllegalArgumentException("Candidate must be at least 18 years old.");
        }
    }

    public int getNumberOfVoter() {
        return voters.size();
    }

    public boolean isVoterNameExist(String name) {
        for (Voter voter : voters) {
            if (voter.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int castVotes(){
        return numberOfVoter;

    }
}
