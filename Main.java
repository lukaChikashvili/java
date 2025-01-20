
public class Main {
    public static void main(String[] args) {
       String name = "luka";
       char target = 'a';
       System.out.println(search(name, target));
       System.out.println(search2(name, target));
    }

    static boolean search2(String str, char target) {
      if(str.length() == 0) {
        return false;
      }

      // for each loop
      for(char ch : str.toCharArray()) {
        if(target == ch) {
          return true;
        }
      }

      return false;
    }


      static boolean search(String str, char target) {
        if(str.length() == 0) {
          return false;
        }

        for(int i = 0; i < str.length(); i++) {
          if(target == str.charAt(i)) {
            return true;
          }
        }

        return false;
      }
}
