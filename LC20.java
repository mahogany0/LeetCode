class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Map<Character,Character> map=new HashMap<Character,Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        char c=' ';
        Deque<Character>stack=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(map.containsKey(c)){
                if(stack.isEmpty()||stack.pop()!=map.get(c))return false;               
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
