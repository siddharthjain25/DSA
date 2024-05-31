class PrintNnumbers
{
    public static void main(String[] args) {
        printNos(10);
    }
  static void printNos(int N)
    {
        //Your code here
        int num = 1;
        print(N, num);
    }
    static void print(int N, int num){
        if(num == N){
            System.out.print(N);
            return;
        }
        System.out.print(num + " ");
        print(N,num + 1);
    }
}