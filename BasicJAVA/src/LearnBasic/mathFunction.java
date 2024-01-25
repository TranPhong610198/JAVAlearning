package LearnBasic;

public class mathFunction {
    public static void main(String[] args){
        
        // hàm Math.max() trả về số lớn nhất trong 2 số
        int fmax = Math.max(5, 10);
        System.out.println(fmax);
        
        // hàm Math.min() trả về số nhỏ nhất trong 2 số
        int fmin = Math.min(5, 10);
        System.out.println(fmin);
        
        // hàm Math.sqrt() trả về căn bậc 2 của số đó
        // mặc định kiểu dữ liệu của nó là double
        float x = (float) Math.sqrt(68);
        System.out.println(x);
        
        // hàm Math.abs() trả về trị tuyệt đối của 1 số
        // mặc định kiểu dữ liệu của nó là double
        float y = (float) Math.abs(-4.7);
        System.out.println(y);
        
        // hàm Math.random() trả về số ngẫu nhiên từ 0.0 đến 1.0
        // mặc định kiểu dữ liệu của nó là double
        int z = (int) (Math.random()*10);
        System.out.println(z);
    }
}
