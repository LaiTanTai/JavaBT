

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

public class JAVA_Core {
    public static String BAI_22_str;
    public static int len;
    public static Scanner scanner = new Scanner(System.in);
    public static double BAI_0() {
//        start Hour
        double strHour;
        double strmin;
        do {
            strHour = scanner.nextDouble();
            strmin = scanner.nextDouble();
        } while ((strHour > 24 && strHour < 9) && (strmin >= 60 && strmin < 0));
//        End hour
        double endHour;
        double endMin;
        do {
            endHour = scanner.nextDouble();
            endMin = scanner.nextDouble();
        } while ((endHour > 24 && endHour < 9 && endHour > strHour) && (endMin >= 60 && endMin < 0));
        double totalHour = (endHour + endMin/60 ) - (strHour + strmin/60);
        System.out.println(totalHour);
        double totalMoney = 0;
        if(totalHour <= 3){
            totalMoney = totalHour * 30000;
        }else{
            int root = (int) ((totalHour-3));
            totalMoney = 3*30000*pow(1+0.3,root);
        }
        if(totalHour >= 9 && totalHour <= 17){
            totalMoney = totalMoney * 0.8;
        }
        System.out.println("Tổng hóa đơn là : " + totalMoney);
        return 0;
    }
    public static void BAI_1(){
        for(int i = 0 ; i < 15 ;i++){
            if(i % 2 == 0 && i <= 9) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("*  ");
                }
                for (int j = 0; j < 25; j++) {
                    System.out.print("=");
                }
            }else if(i % 2 != 0 && i <= 9){
                for(int j = 0 ; j < 5 ;j++){
                    System.out.print(" * ");
                }
                System.out.print("   ");
                for(int j = 0 ; j < 25 ;j++){
                    System.out.print("=");
                }

            }else{
                for( int j = 0 ; j < 43 ;j++){
                    System.out.print("=");
                }
            }
            System.out.println(" ");
        }
    }
    public static void BAI_2(){
//        chuyển đổi số nhị phân

        int dex = scanner.nextInt();
        String bin = "";
        while(dex!=0){
            String modulo = String.valueOf(dex%2);
            dex=dex/2;
            bin += modulo;
        }
        for(int i = bin.length()-1;i >= 0 ;i--){
            System.out.print(bin.charAt(i));
        }
    }
    public static void BAI_3(){
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
    public static void BAI_4(){
        int n = scanner.nextInt();
        int total = 0 ;
        while(n!=0){
            total += n%10;
            n/=10;
        }
        System.out.print("Tổng số tự nhiên là : "+total);
    }
    public static void BAI_5(){
        double x1,x2,y1,y2;
        x1=scanner.nextDouble();
        x2=scanner.nextDouble();
        y1=scanner.nextDouble();
        y2=scanner.nextDouble();
        double distance = sqrt(pow(x2-x1,2) + pow(y2-y1,2));
        System.out.print(distance);
    }
    public static void BAI_6(){
        String str = scanner.nextLine();
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void BAI_7(){
        int n = scanner.nextInt();
        System.out.print("Số ước số : ");
        for( int i = 1 ; i <= n ;i++){
            if(n%i == 0){
                System.out.print(" "+ i);
            }
        }
    }
    public static void BAI_8(){
        String str = scanner.nextLine();
        String capitalizedString = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.print(capitalizedString);
    }
    public static boolean BAI_9(){
        int a,b;
        do{
            a = scanner.nextInt();
            b = scanner.nextInt();
        }while((a>99||a<10) &&(b>99||b<10) );
        int[] arr = new int[4];
        int i = 0;
        while(a!=0 && b!=0){
            arr[i] = a%10;
            a/=10;
            i++;
            arr[i] = b%10;
            b/=10;
            i++;
        }
        for(int j = 0 ; j < arr.length-1;j++){
            for(int k = j+1;j < arr.length ;j++){
                if(arr[j] == arr[k]){
                    System.out.print("true");
                    return true;
                }
            }
        }
        System.out.print("false");
        return false;
    }
    public static void BAI_10(){
        int n = scanner.nextInt();
        int total = 0;
        for( int i = 1 ; i <= n ;i++){
            total +=i;
        }
        System.out.print("Tổng các số từ 1 tới n là : " + total);
    }

    public static void BAI_11(){
        int n = scanner.nextInt();
        System.out.print((int) (log10(n)/log10(2)));
    }
    public static String BAI_12(int i,int n){
//        Truyền tham số i luôn là 1;
        if(i > n) return "";
        for(int j = 1 ; j <= i;j++){
            System.out.print(j);
        }
        System.out.println("");
        return BAI_12(i+1,n);
    }
    public static void BAI_13(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = scanner.nextInt();
        }
//       13a
        int total = 0;
        for(int i = 0 ; i < n;i++) {
            total += arr[i];
        }
        System.out.print("Trung binh : "+ total/n);
//      13b
        int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i < n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.print("Gía trị lớn nhất và giá trị nhỏ nhất lần lượt là : " + max + min );
        int Neg_min = arr[0];
        int Neg_max = arr[0];
        for(int i = 0 ; i < n ;i++){
            if((Neg_max < arr[i] && arr[i] < 0) || (Neg_max >= 0 && arr[i] < 0)){
                Neg_max = arr[i];
            }
            if((Neg_min > arr[i] && arr[i] < 0) || (Neg_max >= 0 && arr[i] < 0)){
                Neg_min = arr[i];
            }
        }
        System.out.print("Gía trị âm lớn nhất và nhỏ nhất lần lượt là : " + Neg_max + Neg_min );
        int Pos_min = arr[0];
        int Pos_max = arr[0];
        for(int i = 0 ; i < n ;i++){
            if((Pos_max < arr[i] && arr[i] > 0) || (Pos_max >= 0 && arr[i] > 0)){
                Pos_max = arr[i];
            }
            if((Pos_min > arr[i] && arr[i] > 0) || (Pos_min >= 0 && arr[i] > 0)){
                Pos_min = arr[i];
            }
        }
        System.out.print("Gía trị dương lớn nhất và nhỏ nhất lần lượt là : " + Pos_max + Pos_min );
        System.out.print("Các Phần tử chẵn là : ");
        for(int i = 0; i < n ;i++) {
            if (arr[i] % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print("Các Phần tử lẻ là : ");
        for(int i = 0; i < n ;i++) {
            if (arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("Nhập vào vị trí cần xóa : ");
        int deletepos = scanner.nextInt();
        for(int i = deletepos;i < n-1 ;i++){
            arr[i] = arr[i+1];
        }
        n--;
        System.out.print("Nhập vào vị trí cần thêm : ");
        int addpos = scanner.nextInt();
        System.out.print("Nhập số cần thêm : ");
        int num = scanner.nextInt();
        n++;
        for(int i = n-1 ; i >= addpos;i--){
            arr[i] = arr[i-1];
        }
        arr[addpos] = num;
    }
    public static void BAI_14(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < n ;i++){
            for( int j = i+1 ; j < n ;j++){
                if(arr[i] == arr[j]){
                    for(int k = j ; k < n-1 ;k++ ){
                        arr[k]=arr[k+1];
                    }
                    n--;
                }
            }
        }
    }
    public static void bai_15(){
        System.out.print("Nhập vào một chuỗi : ");
        String str = scanner.nextLine();
        System.out.print("Độ dài của chuỗi : " + str.length());
        System.out.print("Nhập vào vị trí cảu ký tự : ");
        int index = scanner.nextInt();
        System.out.print(str.charAt(index));
        System.out.print("Chuỗi abcdef có nằm bên trong hay không : "+str.contains("abcdef"));
    }
    public static void BAI_16(){
        System.out.print("Nhập vào năm : ");
        int year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.print("Năm nhuận ");

                }else{
                    System.out.print("Không phải năm nhuận ");
                }
            }
        }
    }
    public static void BAI_17(){
        System.out.print("Nhập một số");
        Random ran = new Random();
        int rannum = ran.nextInt()%1000 + 1;
        int n ;
        do {
            n = scanner.nextInt();
        }while(rannum != n);

    }
    public static void BAI_18(){
        System.out.print("Nhập số tiền gửi ban đàu : ");
        double First_Money = scanner.nextDouble();
        System.out.print("Nhập số tiền muốn nhận : ");
        double Last_Money = scanner.nextDouble();
        System.out.print("Nhập lãi suất hàng năm : ");
        double rate = scanner.nextDouble();
        System.out.print("Só năm cần thiết : " + ((log10(Last_Money/First_Money))/(log10(1+rate))));
    }
    public static double BACNHAT(double a , double b){
        if(a == 0) {
            System.out.print("Math Error ! ");
        }
        return (-b/a);
    }
    public static String BACHAI(double a , double b , double c ){
        if(a == 0) {
            if (b == 0) {
                return "Gía trị x = " + c;
            } else  BACNHAT(b, c);
        }
            double delta = b*b-4*a*c;
            if(delta < 0){
                return "Phongw trình tồn tại nghiệm ảo";
            }else if(delta == 0){
                return "Phương trình có nghệm kép !" + -b/2*a;
            }else{
                double x1 = (-b-sqrt(delta))/(2*a);
                double x2 = (-b+sqrt(delta))/(2*a);
                return "Phương trình có 2 nghiệm thực x1 = " + x1 + "và x2 = " + x2 ;
            }
    }
    public static void BAI_19(){

        System.out.print("Nhấn 1 để giải phuongwn trình bậc 1 và 2 để giải phương trình bậc 2 : ");
        int n = scanner.nextInt();
        if(n == 1){
            System.out.print("Nhập tham số a và b :");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.print("x = " + BACNHAT(a,b));
        }else if(n == 2){
            System.out.print("Nhập tham số a,b và c : ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            System.out.print(BACHAI(a,b,c));
        }
    }
    public static void BAI_20(){
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0 ; i < n ;i++ ){
            arr1[i] = scanner.nextInt();
        }
        ArrayList arr2 = new ArrayList<Integer>();
        ArrayList arr3 = new ArrayList<Integer>();
        for(int i = 0 ;i < n ;i++){
            if(i%2==0){
                arr2.add(arr1[i]);
            }else{
                arr3.add(arr1[i]);
            }
        }
        System.out.print("Mảng chẵn là : ");
        for(int i = 0 ; i < arr2.size() ;i++){
            System.out.print(arr2.get(i));
        }
        System.out.print("Mảng lẻ là : ");
        for(int i = 0 ; i < arr3.size();i++){
            System.out.print(arr3.get(i));
        }
    }
    public static boolean checkintergernumber(double a){
        if(Math.ceil(a) != Math.floor(a)) return false;
        return true;
    }

    public static void BAI_21(){
        int x1,x2,v1,v2;
        do{
            x1 = scanner.nextInt();
            x2 = scanner.nextInt();
            v1 = scanner.nextInt();
            v2 = scanner.nextInt();
        }while((x1+x2>20000) && (x1+x2 < 0) && (v1+v2 < 2) && (v1+v2 > 20000));
        if((x1<x2 && v1<v2) || (x2<x1 && v2 < v1)){
            System.out.print("Không gặp nhau");
        }else{
            if(x1 < x2 && v1 > v2 && checkintergernumber((x2-x1)/(v1-v2))){
                System.out.print("Kangaroo sẽ gặp nhau tại vị trí x = " + (x2+v2*((x2-x1)/(v1-v2))));
            }else if(x1 > x2 && v2 > v1 && checkintergernumber((x1-x2)/(v2-v1))){
                System.out.print("Kangaroo sẽ gặp nhau tại vị trí x = " + (x2+v2*((x1-x2)/(v2-v1))));
            }
        }
    }

    public static void BAI_22(){
        System.out.print("Nhập vào một chuỗi bất kỳ : ");
        String str = scanner.nextLine();
        int n = str.length();
        str = 'x' + str;
        boolean[][] F = new boolean[n+1][n+1];
        for(int i = 0 ; i <= n ;i++){
            for(int j = 0 ; j <= n;j++){
                F[i][j] = false;
            }
        }
        int ans = 1;
        for(int i = 1 ; i <= n ;i++){
            F[i][i] = true ;
        }
        for(int len = 2 ; len <= n ;len++) {
            for (int i = 1; i <= n - len + 1; i++) {
                int j = i + len - 1;
                if (len == 2 && str.charAt(i) == str.charAt(j)) {
                    F[i][j] = true;
                } else {
                    F[i][j] = F[i + 1][j - 1] && (str.charAt(i) == str.charAt(j));
                }
                if (F[i][j]) ans = max(ans, len);
            }
        }
        for(int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <= n ;j++){
                if(F[i][j] == true && j-i+1 == ans && j >= i) System.out.print(str.substring(i,j+1) + " ");
            }
        }
    }
    public static void main(String[] args) {
        BAI_22();
    }
}