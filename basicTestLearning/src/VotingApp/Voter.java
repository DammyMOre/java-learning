package VotingApp;

public class Voter {
    private String name;
    //private int vote;
    private String password;
    private int age;



    public Voter(String name, String password, int age) {
        this.name = name;
        //this.vote = vote;
        this.password = password;
        this.age = age;

    }
    public void setName(){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPassword(){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setAge(){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    //public void incrementVotes() {
       // this.vote++;
    //}
}



