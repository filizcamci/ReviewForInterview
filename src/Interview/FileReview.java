package Interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileReview {

	public static void main(String[] args) throws Exception {
		System.out.println(wordsInTxtFile("C:\\Users\\filiz\\Dropbox\\test\\Review\\sample.txt"));
		
	}
	
	public static Map<String,Integer> wordsInTxtFile(String path ) throws Exception{
		Map<String, Integer> wordMap = new TreeMap<>();
		List<String> words = new ArrayList<>();
		List<String> lines=new ArrayList<>();
		//String path = "C:\\Users\\filiz\\Dropbox\\test\\Review\\sample.txt";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		Path pathOut=Paths.get("C:\\Users\\filiz\\Dropbox\\test\\Review\\fileout.txt");
		String line = "";
		
		while ((line = br.readLine()) != null) {
			//System.out.println(line);
			
			String[] word = line.split(" ");
			for (int i = 0; i < word.length; i++) {
				words.add(word[i].replaceAll("[\\s().,]", ""));
			}
			lines.add(line);
			Files.write(pathOut, lines);
		}
		//System.out.println(words);
		for (int j = 0; j < words.size(); j++) {
			int count = 1;
			for (int k = 0; k < words.size(); k++) {
				if (j == k)
					continue;
				if (words.get(j).equals(words.get(k))) {
					count++;
					
				}
			}
			wordMap.put(words.get(j), count);
		}

		//System.out.println(wordMap);
		br.close();
		fr.close();
		return wordMap;
		}

}
