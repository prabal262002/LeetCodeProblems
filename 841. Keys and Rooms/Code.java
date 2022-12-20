class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // HashSet<Integer> s= new HashSet<>();
        // int emptyrooms=0;
        int n = rooms.size();
        boolean[] arr = new boolean[n];
        arr[0]=true;
        int y=0;
        int check = 1,change=0;
        while(check<n){
        y=0;
        change=0;
        for(List<Integer> k:rooms){
          if(arr[y]){
            for(int a:k){
            arr[a] = true;
          }
          change++;
          }
          y++;
        }
        if(change<=check){break;}
        check=change;
        }
        return check==n;
    }
}