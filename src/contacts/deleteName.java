package contacts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class deleteName {
    public static void whatIsThis() throws IOException {
        // PrintWriter object for output.txt
        PrintWriter pw = new PrintWriter("output.txt");

        // BufferedReader object for input.txt
        BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));

        String line1 = br1.readLine();

        // loop for each line of input.txt
        while (line1 != null) {
            boolean flag = false;

            // BufferedReader object for delete.txt
            BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));

            String line2 = br2.readLine();

            // loop for each line of delete.txt
            while (line2 != null) {
                if (line1.equals(line2)) {
                    flag = true;
                    break;
                }

                line2 = br2.readLine();
            }

            // if flag = false
            // write line of input.txt to output.txt
            if (!flag)
                pw.println(line1);

            line1 = br1.readLine();

        }

        pw.flush();

        // closing resources
        br1.close();
        pw.close();

        System.out.println("File operation performed successfully");
    }
}

