package APIfeature.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderWriter {
	public static void main(String[]args) throws IOException
	{
		Path path=Paths.get("./Resources/Sample.txt");
		String filecontent=Files.readString(path);
		System.out.print(filecontent);
		String changes=filecontent.replace("Santhiya", "Santhiya Periyasamy");
		Path path1=Paths.get("./Resources/Sample-1.txt");
		Files.writeString(path1,changes);
	}

}
