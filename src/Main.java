import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter How Many Object You Want Enter:");
        int n=s.nextInt();
        Product arr[]=new Product[n];
        for(int i=0;i<n;i++){
            Product product=new Product();
            System.out.println("Please Enter Product Name:");
            product.productName=s.next();
            System.out.println("Please Enter Product Price ");
            product.productPrice=s.nextDouble();
            arr[i]=product;
        }
        Set<Product> productSet=new TreeSet<>();
        for(int i=0;i<n;i++){
            productSet.add(arr[i]);
        }
        System.out.println(productSet);
    }
}

 class Product implements Comparable<Product> {

    String productName;
    double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if(this.productPrice==o.productPrice){
            return 0;
        }
        if(this.productPrice>o.productPrice){
            return 1;
        }else{
            return -1;
        }
    }
}
