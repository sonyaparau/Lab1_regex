public class StringReplacer {

    public static void main(String[] args) {
        Text text = new Text();
        text.readText();
        String sourceCode = text.getText();
        String[] words = sourceCode.split(" ");
        String output;
        for(String word: words){
            Integer counter = 0;
            output = StringFinder.findKeyword(word);
            if(output!= null){
                text.writeText(output);
                counter ++;
            }
            output = StringFinder.findIdentification(word);
            if(output!= null) {
                text.writeText(output);
                counter ++;
            }
            output = StringFinder.findFloat(word);
            if(output!= null){
                text.writeText(output);
                counter ++;
            }
            output = StringFinder.findInteger(word);
            if(output!= null){
                text.writeText(output);
                counter ++;
            }

            if(counter == 0){
                text.writeText(StringFinder.findUnknown(word));
            }
        }
    }
}