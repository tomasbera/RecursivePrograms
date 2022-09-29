public class Recursion
{
    public static void main(String[] args) {
        int n = 2;
        int x = 4;

        Recursion recursion = new Recursion();

        if(n < 0 || x < 0) System.exit(-1);
        System.out.println("\n"+x+"^"+n +" = "+ recursion.recursiveAlg(x, n)+"\n");
        System.out.println(x+"^"+n +" = "+ recursion.recursiveAlgTwo(x, n));
    }

    public double recursiveAlg(int x, int n){
        if(n == 0) return 1;
        return x * recursiveAlg(x, n - 1);
    }

    public double recursiveAlgTwo(int x, int n){
        if(n == 0) return 1;
        if(n % 2 != 0) return x * recursiveAlgTwo(x * x, (n - 1)/2);
        else return recursiveAlgTwo(x * x, (n/2));
    }
}