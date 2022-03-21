//非同步栈
class MinStack {
    
    // 数据栈
    private Stack<Integer> data;
    // 辅助栈
    private Stack<Integer> helper;

    public MinStack() {
        data=new Stack<>();
        helper=new Stack<>();
    }
    
    public void push(int val) {
        data.add(val);
        if(helper.isEmpty()||val<=helper.peek()) helper.add(val);    //注意这里要有等于，不然可能出现多个最小值存入，弹出栈时报错
    }
    
    public void pop() {
        if(!data.isEmpty()){
        if(data.peek().equals(helper.peek())) {helper.pop();}
        data.pop();
        }
    }
    
    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        } throw new RuntimeException("栈中元素为空，此操作非法");     
    }
    
    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        } 
        throw new RuntimeException("栈中元素为空，此操作非法");     
    }
}
