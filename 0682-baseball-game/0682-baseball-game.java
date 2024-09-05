class Solution {
    public int calPoints(String[] operations) {

        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(String op:operations){
                      
             if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(st.peek()*2);
            }
            
            else if(op.equals("+")){
                int last=st.pop();
                int second=st.peek();
                st.push(last);
                st.push(last+second);
            }
                else{
                    st.push(Integer.parseInt(op)); 
                }
            
        }
        for(int n:st){
            sum+=n;
        }
        return sum;
        
    }
}