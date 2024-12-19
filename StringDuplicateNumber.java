public static boolean isSecondOrderIsogram(String phrase){	//phrase == "mallam"
	Boolean isPhraseWithOddNumberOfCharacters = phrase.length() % 2 != 0;

	String uniqueCharactersofphrase = " ";
	for(int index = 0; index<phrase.length();index++){
		char currentCharacter = phrase.charAT(index);
		boolean isUniqueCharacterOfPhrase = !uniqueCharactersOfPhrase.contains(""+currentCharacter);
		if(isUniqueCharacterOfPhrase) uniqueCharactersOfPhrase += currentCharacter;

		
	}
	int numberOfUniqueCharacters = uniqueCharactersOfPhrase.length();
	int[] tally = new int[numberOfUniqueCharacters];

	for(int index = 0; index < numberOfUniqueCharacters; index++){
		char currentCharacter = uniqueCharactersOfPhrase.charAT(index++)
		
		for(int counter = o;  < numberOfUniques;counter++){
		

}

}
}