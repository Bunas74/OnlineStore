package by.epam.online_store.dao.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplianceReader {

	private String sourcePath;

	public ApplianceReader() {

	}

	public ApplianceReader(String sourcePath) {

		this.sourcePath = sourcePath;

	}

	public List<String> take() throws FileNotFoundException, IOException {
		List<String> dataFromSource = new ArrayList<>();
		FileReader reader;
		reader = new FileReader(sourcePath);
		Scanner sc = new Scanner(reader);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			dataFromSource.add(line);
		}
		sc.close();
		reader.close();
		return dataFromSource;
	}

	public List<String> take(String groupSearchName) throws FileNotFoundException, IOException {
		List<String> dataFromSource = new ArrayList<>();
		FileReader reader;
		reader = new FileReader(sourcePath);
		Scanner sc = new Scanner(reader);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line.contains(groupSearchName)) {
				dataFromSource.add(line);
			}

		}
		sc.close();
		reader.close();
		return dataFromSource;
	}
}
