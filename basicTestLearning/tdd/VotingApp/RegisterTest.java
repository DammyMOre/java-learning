package VotingApp;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RegisterTest {

    @Test
    public void testThatCandidateCanRegister() {
        CandidaterRegister register = new CandidaterRegister();
        register.registerCandidate("Dammy", "08012345679",18);
        assertEquals(1,register.getNumberOfCandidate());
    }

    @Test
    public void testThatVoterCanRegister() {
        CandidaterRegister register = new CandidaterRegister();
        register.registerVoter("Dammy", "1234",18);
        assertEquals(1,register.getNumberOfVoter());
    }
    @Test
    public void testThatCandidateCanGenerateId() {
        CandidaterRegister register = new CandidaterRegister();
        register.generateCandidateId();
        assertEquals("NG1",register.generateCandidateId());
    }
    @Test
    public void testThatCandidateCannotRegisterTwice() {
        CandidaterRegister register = new CandidaterRegister();
        register.isCandidateNameExist("Dammy");
        assertFalse(register.isCandidateNameExist("Dammy"));

        }
    @Test
    public void testThatVoterCannotRegisterTwice() {
        CandidaterRegister register = new CandidaterRegister();
        register.isVoterNameExist("Dammy");
        assertFalse(register.isVoterNameExist("Dammy"));

    }

}
