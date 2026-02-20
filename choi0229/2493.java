import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++){
            int height = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()){
                if(stack.peek()[1] >= height){
                    sb.append(stack.peek()[0]).append(" ");
                    break;
                }
                stack.pop();
            }

            if(stack.isEmpty()){
                sb.append("0 ");
            }
            stack.push(new int[]{i, height});
        }
        System.out.println(sb);
    }
}