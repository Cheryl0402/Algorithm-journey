class Solution {
    public int numUniqueEmails(String[] emails) {
        // Solution 1:
        HashSet<String> uniqueEmails = new HashSet<>();        
        for(String email : emails){
            String[] names = email.split("@");   // for each email, splite it at @ sign            
            String localName = names[0].split("\\+")[0];    // split + and remove other chars
            localName = localName.replace(".","");         // remove "."
            String name = localName + "@" + names[1];     //                                 
            uniqueEmails.add(name);
        }        
        return uniqueEmails.size();

        // Solution 2:
//         Set<String> set = new HashSet<>();        
//         for(String email : emails){
//             String[] names = email.split("@");
//             String local = names[0];            
//             StringBuilder localName = new StringBuilder();
//             for(int i = 0; i < local.length(); i++){
//                 char c = local.charAt(i);                
//                 if(c == '.'){
//                     continue;
//                 }else if(c == '+'){
//                     break;
//                 }else{
//                     localName.append(c);
//                 }               
//             }
//              set.add(localName.toString() + "@" + names[1]);
//         }
//         return set.size();
        
        
        // 1, Check uniqueness or duplicate, we can always think about set. 
        // 2, string methods. split(); lastIndexOf(); replace(); length(); toCharArray(); charAt();
        // 3, String operations: stringBuilder, toCharArray(); string concantation
    }
}

