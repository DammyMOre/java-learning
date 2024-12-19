package VotingApp;

public class Candidate {
        private String name;
        private int votes;
        private int id;
        private char gender;
        private int age;


        public Candidate(String name) {
            this.name = name;
            this.votes = 0;
            this.id = id;
            this.gender = gender;
            this.age = 0;

        }

        public String getName() {
            return name;
        }

        public int getVotes() {
            return votes;
        }

        public void incrementVotes() {
            this.votes++;
        }
        public int getId() {
            return id;
        }
        public char getGender() {
            return gender;

        }
        public int getAge() {
            return age;
        }
    }

