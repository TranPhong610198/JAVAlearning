package LearnBasic;
public class learnString {
    public static void main(String[] args){
        String greet = "Hello";
        String txt = "Happy New Year!!!";
        
        // hàm .length() trong String sẽ giúp lấy độ dài của string
        System.out.println("Length of text \"Hello\" is: "+greet.length());
        
        //hàm .indexOf() trogn String sẽ giúp chỉ ra vị trí của từ đầu tiên
        //trong chuỗi tìm kiếm trong string. Vd ở dưới:
        System.out.println("\"New\" start at locate: "+txt.indexOf("New")+ " in " + txt);
        
        //Sau đây là 2 cách để nối 2 string lại ;
        String str1 = "String 1";
        String str2 = " String 2";
        // cách 1 dùng "+"
        String str3 = str1 + str2;
        System.out.println(str3); // output: String 1 String 2.
        // cách 2 dùng hàm .concat()
        String str4 = str1.concat(str2);
        System.out.println(str4); // output: String 1 String 2.
        
        // Phép + giữa string vs string và giữa string vs int 
        // đều ra kết quả là 1 string
        String x = "10", y = "20";
        int z = 20;
        System.out.println(x+y); // output: 1020
        System.out.println(x+z); // output: 1020
    }
}
