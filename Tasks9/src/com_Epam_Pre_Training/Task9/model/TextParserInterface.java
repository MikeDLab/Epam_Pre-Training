package com_Epam_Pre_Training.Task9.model;

public interface TextParserInterface {
	String sentencesRemoveSplitters = "[.?!]";
	String sentencesSaveSplitters="(?<=\\.|\\?|\\!)|(?=\\.|\\?|\\!)";
	String wordsRemoveSplitters = "(\\s|,|:)";
	String spaceCharacter = " ";
} 
