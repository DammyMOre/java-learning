package bankingapplication;

import java.util.HashMap;
import java.util.Map;

public class CentralBank {
    private HashMap<String, String> banks;

    public CentralBank() {
        this.banks = new HashMap<>();
    }

    public void addNewBank(String bankName, String bankCode) {
        this.banks.put(bankName, bankCode);
    }

    public String getBankCode(String bankName) {
        CentralBank centralBank = new CentralBank();
        centralBank.addNewBank("wema", "035");
        centralBank.addNewBank("Zenith", "057");
        return this.banks.get(bankName);
    }







    public static void main(String[] args) {
        CentralBank centralBank = new CentralBank();

        centralBank.addNewBank("wema", "035");
        centralBank.addNewBank("Zenith", "057");
        System.out.println(centralBank.getBankCode("Zenith"));


    }
}



    //    public static void bankList() {
//        banks.put("Access Bank","044");
//        banks.put("Afri Bank","014");
//        banks.put("Citi Bank","023");
//        banks.put("Diamond Bank","063");
//        banks.put("Eco Bank","050");
//        banks.put("Equitorial Trust Bank","040");
//        banks.put("First Bank","011");
//        banks.put("FCMB","214");
//        banks.put("Fidelity Bank","070");
//        banks.put("Fin Bank", "085");
//        banks.put("Guaranty Trust Bank","058");
//        banks.put("Intercontinental Bank","069");
//        banks.put("Oceanic Bank","056");
//        banks.put("BankPhb","082");
//        banks.put("Skye Bank","076");
//        banks.put("Spring Bank","084");
//        banks.put("StanbicIBTC","221");
//        banks.put("Standard Chartered bank","068");
//        banks.put("Sterling Bank","232");
//        banks.put("United Bank for Africa","033");
//        banks.put("Union Bank","032");
//        banks.put("Wema Bank","035");
//        banks.put("Zenith Bank","057");
//        banks.put("Unity Bank","215");
//    }


