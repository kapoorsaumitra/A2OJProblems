package lessthan1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob80A {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static boolean isPrime(int n){
        if (n==1)
            return false;
        for (int i =2;i*i<=n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int a = s.nextInt();
        int b = s.nextInt();
        int c =0;
        for (int k =a+1;k<=b;k++){
            if (!isPrime(b)){
                System.out.println("NO");
                break;
            }
            if (isPrime(k))
                c++;
            if(k==b){
                if (c==1)
                    System.out.println("YES");
                else
                    System.out.println("NO");

            }
        }


    }


}
