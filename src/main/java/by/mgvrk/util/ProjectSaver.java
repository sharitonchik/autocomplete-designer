package by.mgvrk.util;

import java.io.*;

public class ProjectSaver {
    private final String PATH_WIN = "E:"
            + File.separator + "For mgvrk"
            + File.separator + "autocomplete-designer"
            + File.separator + "users";

    public void createUserDir(String userName, String projectName) {
        File rootUsersDir = new File(PATH_WIN);
        File userDir = new File(PATH_WIN, userName);
        boolean success = userDir.mkdir();
        if (success) {
            File projectDir = new File(userDir, projectName);
            boolean projectDirSuccess = projectDir.mkdir();
            createFiles(projectDir);
        }
    }

    public void createFiles(File projectDir) {
        File htmlFile = new File(projectDir, "html.html");
        File cssFile = new File(projectDir, "css.css");
        try {
            boolean htmlSuccess = htmlFile.createNewFile();
            boolean cssSuccess = cssFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFiles(String path, String htmlString, String cssString) {
        File html = new File(PATH_WIN + File.separator + path, "html.html");
        OutputStream output = null;

        if (html.exists()) {
            try {
                output = new FileOutputStream(html);
                for (int i = 1; i < htmlString.length(); i++) {
                    int data = htmlString.charAt(i);
                    output.write(data);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(System.out);
            } catch (IOException e) {
                e.printStackTrace(System.out);
            } finally {
                try {
                    if (output != null) {
                        output.close();
                    }
                } catch (IOException e) {
                    //quietly
                }
            }
        }
    }
}
