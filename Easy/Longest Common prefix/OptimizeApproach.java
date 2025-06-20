public class OptimizeApproach {
    public static void main(String[] args) {
        String[][] testCases = {
            {"flower", "flow", "flight"},  
            {"dog", "racecar", "car"},     
            {"interspecies", "interstellar", "interstate"}, 
            {"a"},                        
            {"ab", "a"},                  
            {"c", "c"},                   
            {"", "b"}                    
        };

        for (int i = 0; i < testCases.length; i++) {
            String[] strs = testCases[i];
            System.out.print("Test case " + (i + 1) + ": ");
            System.out.println(longestCommonPrefix(strs));
        }
    }

    private static String longestCommonPrefix(String[] strs){

        if(strs == null || strs.length == 0){
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}

