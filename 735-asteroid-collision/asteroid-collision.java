class Solution {

static int add(int a , int b){
    return a+b;
}


    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++)
         {
            //collison occur condition//
            while(st.size()>0 && st.peek()>0 && asteroids[i]<0){
                int sum = add(st.peek(),asteroids[i]);
                    if(sum<0){
                        st.pop();
                    }
                    else if(sum>0){
                        asteroids[i]=0;
                        //or //
                        //break can also be written//
                    }
                    else{
                        st.pop();
                   asteroids[i]=0;//or // asteroids[i]=0
                    }
                
                
            }
            if(asteroids[i]!=0){
                    st.push(asteroids[i]);
                }
         }

int size = st.size();
int result[] = new int[size];
for(int i=0;i<size;i++){
  result[i]=st.pop();
}
int start =0;
int end = result.length-1;
while(start<end){
    int temp = result[start];
    result[start] = result[end];
    result [end] = temp;
    start ++;
    end --;
}
  return result ;  }
}