//I am a huge noob at creating and writing to files so this is probably really bad but it works for me so YOLO.
//In cause you are wondering, this class makes it super easy to create a file and append text to the file. :)

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilesUtil
{
  //Change this variable in another class to change the text that gets appended to the file
    public static String text = "";

    public static void FileUtil() throws IOException
    {
        BufferedWriter bw = null;
        try
        {
        //change "data.txt" to whatever you want to call your file
            bw = new BufferedWriter(new FileWriter("data.txt", true));
            bw.write(text);
            bw.newLine();
            bw.flush();
        } catch (
                IOException ioe)

        {
            ioe.printStackTrace();
        } finally

        {
            if (bw != null) try
            {
                bw.close();
            } catch (IOException ioe2)
            {
                ioe2.printStackTrace();
            }
        }
    }
}
