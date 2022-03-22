class Solution {
    public int countPrimes(int n) {
        int data[]=new int[n+1];
        //置1
        Arrays.fill(data,1);
        int count=0;
        if(n<=2)return 0;    //这里可以改为n<=1的情况

        for(int i=2;i<n;i++){    
            if(data[i]==1){
                count++;
                if ((long) i * i < n) {   //避免溢出
                    for (int j = i * i; j < n; j += i) {
                        data[j] = 0;
                    }
                }
            }
        }
        return count;
    }
}
