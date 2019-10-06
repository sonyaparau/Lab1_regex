public class StringFinder {

    public static boolean isComment(String comment){
        if (comment.matches("^(//).*")){
            return true;
        }
        return false;
    }

    public static String findKeyword(String keyword){
        if (keyword.matches("[A-Z]+;*$")){
            //checks if word contains ;
            if(keyword.matches(".*;")) {
                //eliminates ;
                Integer index = keyword.indexOf(";");
                String keywordWithoutComma = keyword.substring(0,index);
                return "Schlüsselwort "+ keywordWithoutComma + "\n" + "Unbekannt " + keyword.substring(index);
            }
            else
                return "Schlüsselwort "+ keyword;
        }
        return null;
    }

    public static String findIdentification(String identificator){
        if (identificator.matches("[a-z]+[0-9]*(;|,)*")){
            if(identificator.matches("[a-z]+[0-9]*(;|,)+")){
                Integer index = identificator.indexOf(";");
                Integer index2 = identificator.indexOf(",");
                String identificatorWithoutComma="";
                String comma="";
                if(index != -1){
                   identificatorWithoutComma = identificator.substring(0,index);
                    comma = identificator.substring(index);
                }
                if(index2 != -1){
                    identificatorWithoutComma = identificator.substring(0,index2);
                    comma = identificator.substring(index2);
                }
                return "Identifikator "+ identificatorWithoutComma + "\n" + "Unbekannt " + comma;
            }
            else
                return "Identifikator "+ identificator;
        }
        return null;
    }

    public static String findFloat(String floatNumber){
        if (floatNumber.matches("[0-9]+\\.[0-9]+;*$")){
            if(floatNumber.matches(".*;")) {
                //eliminates ;
                Integer index = floatNumber.indexOf(";");
                String numberWithoutComma = floatNumber.substring(0,index);
                return "Gleichkommazahl "+ numberWithoutComma + "\n" + "Unbekannt " + floatNumber.substring(index);
            }
            return "Gleitkommazahl "+ floatNumber;
        }
        return null;
    }

    public static String findInteger(String integerNumber){
        if (integerNumber.matches("[0-9]+;*$")){
            if(integerNumber.matches(".*;")) {
                //eliminates ;
                Integer index = integerNumber.indexOf(";");
                String numberWithoutComma = integerNumber.substring(0,index);
                return "Ganze Zahl "+ numberWithoutComma + "\n" + "Unbekannt " + integerNumber.substring(index);
            }
            else
                return "Ganze Zahl "+ integerNumber;
        }
        return null;
    }

    public static String findUnknown(String unknown){
            return "Unbekannt "+ unknown;
    }
}
