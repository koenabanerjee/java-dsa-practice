package Recursion;

public class RemoveDupliactes {
    public static void removeDupli(String str, int idx, StringBuilder newStr, boolean map[]){
        //BASE CASE
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //WORK
        char currChar = str.charAt(idx);
        if( map[currChar- 'a'] == true){
            removeDupli(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDupli(str, idx + 1, newStr.append(currChar), map);
        }


    }
    


    public static void main(String[] args){
        String str = "appnnacollege";
        removeDupli(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
