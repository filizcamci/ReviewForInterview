package Interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProFile {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\filiz\\Dropbox\\test\\Review\\proFile.txt";
		Path outPath = Paths.get("C:\\Users\\filiz\\Dropbox\\test\\Review\\proFileOut.txt");
		List<String> lines = new ArrayList<>();
		File file = new File(path);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while ((line = br.readLine()) != null) {

			if (!line.contains("without looking")) {
				System.out.println(line);
				lines.add(line);
				Files.write(outPath, lines);
			}
		}
		br.close();
		fr.close();
	}

}
