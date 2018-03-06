package com_Epam_Pre_Training.Task9.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public enum TextParser implements TextParserInterface {
	TEXTPASER;
	public void swapFirstAndLastWords(String fileInPut, String fileOutPut) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileInPut));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutPut));
		String strLine;
		String[] sentences;
		String[] words;
		while ((strLine = br.readLine()) != null) {
			sentences = getSentences(strLine);
			for (int i = 0; i < sentences.length; i++) {
				words = getWords(sentences[i]);
				if (words.length > 1) {
					words = replaceWords(words);
				}
				sentences[i] = "";
				// формируем новое предложение
				for (int j = 0; j < words.length; j++) {
					// вставляем или не вставляем проблемы(не вставляем перед
					// символом заверешающим предложение)
					if (words.length == 1 || j != words.length - 1) {
						sentences[i] += words[j] + spaceCharacter;
					} else {
						if (words.length != 1) {
							sentences[i] += words[j];
						}
					}

				}
				bw.write(sentences[i]);
			}
		}
		bw.close();
		br.close();
	}

	public String[] getUniqueWords(String fileName, String fileOutPut) throws IOException {
		ArrayList<String> uniqueWordsList = new ArrayList<String>();
		String firstSentence = "";
		String[] sentences;
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutPut));
		String strLine;
		while ((strLine = br.readLine()) != null) {
			sentences = getSentencesRemoveSplitters(strLine);
			if (firstSentence.isEmpty()) {
				firstSentence = sentences[0];
				uniqueWordsList = new ArrayList<String>(Arrays.asList(getWords(firstSentence)));
			}
			// если не пустой список удалям из него слова,которые встречаются в
			// след.предложениях
			if (!uniqueWordsList.isEmpty()) {
				for (int i = 0; i < sentences.length; i++) {
					for (int k = 0; k < uniqueWordsList.size(); k++) {
						if (!sentences[i].equals(firstSentence)) {
							if (sentences[i].contains(uniqueWordsList.get(k))) {
								uniqueWordsList.remove(k);
							}
						}
					}

				}
			}

		}

		// если есть уникальные слова записываем в файл
		if (!uniqueWordsList.isEmpty()) {
			for (int i = 0; i < uniqueWordsList.size(); i++) {
				bw.write(uniqueWordsList.get(i) + "\n");
			}
		} else {
			throw new NoUniqueWordsInFirstSentece();
		}
		bw.close();
		br.close();
		return uniqueWordsList.toArray(new String[0]);
	}

	private String[] getWords(String sentence) {

		return sentence.split(wordsRemoveSplitters);

	}

	// получаем предложения БЕЗ разделители
	private String[] getSentencesRemoveSplitters(String text) {
		return text.split(sentencesRemoveSplitters);
	}

	// получаем предложения И разделители
	public String[] getSentences(String text) {
		return text.split(sentencesSaveSplitters);
	}

	private String[] replaceWords(String[] words) {
		String[] result = new String[words.length - 1];
		System.arraycopy(words, 1, result, 0, words.length - 1);
		String first = result[0];

		result[0] = result[result.length - 1];
		result[result.length - 1] = first;

		return result;
	}
}
