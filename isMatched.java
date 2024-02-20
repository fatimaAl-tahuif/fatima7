public class isMatched {

         public static boolean isMatched(String expression) {
         final String opening = "({["; // opening delimiters
         final String closing = ")}]"; // respective closing delimiters
         Stack<Character> buffer = new slinkedStak<>( );
         for (char c : expression.toCharArray( )) {
             if (opening.indexOf(c) != -1) // this is a left delimiter
             buffer.push(c);
             else if (closing.indexOf(c) != -1) { // this is a right delimiter
                 if (buffer.isEmpty( )) // nothing to match with
                     return false;
                 if (closing.indexOf(c) != opening.indexOf(buffer.pop( )))
                     return false; // mismatched delimiter
                 }
            }
         return buffer.isEmpty( ); // were all opening delimiters matched?
         }

    public static void main(String[] args) {
        System.out.println(  isMatched("(())"));
    }

}
/*
يحدد هذا الكود ما إذا كانت الأقواس والأقواس والمعقوفات متطابقة بشكل صحيح داخل سلسلة نصية معينة

يتحقق الكود من اقتران الأقواس بشكل صحيح باستخدام مكدس لتخزين الأقواس الافتتاحية ومقارنتها مع الأقواس الختامية.
يُعتبر الاقتران صحيحًا فقط إذا كانت جميع الأقواس الافتتاحية مقفلة بأقواس ختامية من النوع الصحيح وبالترتيب الصحيح.
 */