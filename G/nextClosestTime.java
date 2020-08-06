
class Solution {
    public String nextClosestTime(String time) {
        //corner case
        if(time.equals("00:00")){
            return time;
        }
        // convert the string to minutes
        int minutes = Integer.parseInt(time.substring(0,2)) * 60;
        minutes += Integer.parseInt(time.substring(3));
        
        // create a hashset in order to check digit later
        HashSet<Integer> digits = new HashSet<>();
        for(char c: time.toCharArray()){
            if(c != ':'){
               digits.add(c -'0'); 
            }            
        }
        
        while(true){
            if(minutes == 23 * 60 + 59){
                minutes = 0;
            }
            minutes += 1;
            int[] nextTime = new int[4];
            nextTime[0] = minutes / 60 / 10;
            nextTime[1] = minutes / 60 % 10;
            nextTime[2] = minutes % 60 / 10;
            nextTime[3] = minutes % 60 % 10;
            
            boolean isValid = true;
            for(int digit : nextTime){
                if(!digits.contains(digit)){
                    isValid = false;
                    break;
                }                 
            }
            
            if(isValid){
                return String.format("%02d:%02d", minutes / 60, minutes % 60);
            }
        }
                
    }
}