package Easy;

public class FirstBadVersion {


    public int firstBadVersion(int n) {
        int f = 1, l = n;
        while(f<=l){
            int m = f+(l-f)/2;
            if(!isBadVersion(m)){
                f = m+1;
            }else{
                l = m-1;
            }
        }
        return f;

    }


    private boolean isBadVersion(int n) {
        if(n == 1) {
            return false;
        }
        if(n == 2) {
            return false;
        }
        if(n == 3) {
            return false;
        }
        if(n == 4) {
            return true;
        }
        if(n == 5) {
            return true;
        }

        return false;

    }
}
