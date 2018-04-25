package br.com.lab510.manipulator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader  {

	public String file(String filename) {
		StringBuilder emailContent = new StringBuilder();
				
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(filename), "UTF-8"));
			String line = br.readLine();

			while (line != null) {
				emailContent.append(line).append("\n");
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return emailContent.toString();
	}

}
