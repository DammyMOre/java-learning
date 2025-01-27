package VotingApp;

public class Candidate {
        private String name;
        private String phoneNumber;
        private int age;


        public Candidate(String name,String phoneNumber,int age) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.age = 0;
        }
        public String getName() {
            return name;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setAge() {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

}

