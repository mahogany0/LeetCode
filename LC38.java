public class LC38 {
    public static void main(String[] args) {
        new LC38().countAndSay(4);
    }
    public String countAndSay(int n) {
        String str="1";
        for(int i=2;i<=n;i++){
            //n=i的初始值
            StringBuilder sb=new StringBuilder();  // 保存当前轮的结果
            int start=0;
            int pos=0;
            while(pos<str.length()){
                while(pos<str.length()&&str.charAt(pos)==str.charAt(start)){
                    pos++;
                }
                //start为字符起始，pos为字符结束位置
                sb.append(Integer.toString(pos - start)).append(str.charAt(start));
                start=pos; //下一个字符起始
            }
            str=sb.toString();  //每一轮的结果传到下一轮
        }
        return str;
    }
}
