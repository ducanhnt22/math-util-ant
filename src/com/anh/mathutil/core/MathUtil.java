/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anh.mathutil.core;

//Ta se mo phong/clone cai class Math cua JDK
//Class cua ta viet se cung cap cac ham/method tien ich
//dung chung cho nhieu noi khac nhau
//thường cái gì là tool dùng cho các nơi thì đc thiết kế static
public class MathUtil {

    public static final double PI = 3.141592653589793;

    //hàm tiện ích dùng chung tính giai thừa
    //quy ước n! = 1*2*3*...*n
    //Không tính giai thừa số âm
    //0! = 1! = 1
    //21! cực kì to, vượt 18 số 0, tràn kiểu long 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. N must be between 0..20");
        }
        if (n == 0 && n == 1) {
            return 1;
        }
        long product = 1; //Khoi dau cua giai thua la 1
        //Bien tich luy
        //acc - accumulation
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

//KĨ THUẬT TDD = TEST DRIVEN DEVELOPMENT - AGILE - Dành cho Dev 
//Là kĩ thuật lập trình/phong cách lập trình mà khi viết code phải viết luôn các bộ kiểm thử
//Test case để kiểm tra ngay code của mình đungs hay sai
//Là kĩ thuật lập trình viết code song song với viết test case
//Kỹ thuật này giúp code liên tục kiểm tra xem chạy đúng như kỳ vọng hay k
//Nếu ta sài TDD, nó sẽ giúp ta đi vào quy trình CI - CONTINUOUS INTEGRATION

/*
1. Viết phắc thảo Prototype của hàm/method
2. Viết các bộ kiểm thử/testcase là các đoạn code bổ sung thêm nhưng là code để xài cái hàm
vừa viết, để check xem hàm vừa viết ổn k
3. Chạy thử hàm vừa viết với test case vừa tạo. xem tình hình hàm đúng sai ra sao.
Sai => Refactor, sửa code
Đúng => hoàn thiện code khác
Lien tuc lien tuc nhu vay
 */
