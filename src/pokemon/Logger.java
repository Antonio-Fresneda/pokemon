package pokemon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	private static BufferedWriter bufferedWriter;
	private static String logPath = "C:\\Users\\Antonio\\Documents\\GitHub\\pokemon\\resources\\logger\\log.log";

	public static BufferedWriter getOrCreateFileWriter() {
		if (bufferedWriter != null)
			return bufferedWriter;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(logPath, true));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return bufferedWriter;

	}

	public static void write(String line) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String timestamp = dateFormat.format(new Date());
			getOrCreateFileWriter().write(line +" "+ timestamp);
			getOrCreateFileWriter().newLine();
			getOrCreateFileWriter().flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void close() {
		try {
			bufferedWriter.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
