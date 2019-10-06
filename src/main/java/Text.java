import java.io.*;

public class Text {
    private String text = "";
    private static final String INPUT_FILENAME = "D:\\Lab1_regex\\src\\main\\java\\text.txt";
    private static final String OUTPUT_FILENAME = "D:\\Lab1_regex\\src\\main\\java\\output.txt";

    public void readText(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    INPUT_FILENAME));
            String line = reader.readLine();
            while (line != null) {
                //take only the source code without comments
                if(!StringFinder.isComment(line)){
                   text = text + line + " ";
                }
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }

    public void writeText(String text){
        String str = text;
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(OUTPUT_FILENAME, true));
            writer.append(str);
            writer.append('\n');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }
}
