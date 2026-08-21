class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int result =0;
        
            for(int j =0;j<students.length;j++){
                result += Math.abs(students[j] - seats[j]);
            }
      
   return result; }
}