/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anh.mathutil.main;

import com.anh.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("This mess comes from main()");
        System.out.println("This jar file is built based ANT co-operating with JUnit");
        System.out.println("This message come from a US-BUILT's JAR FILE");
        tryTDDFirst();
    }
    
    //hàm này thử nghiệm/minh họa cách TDD triển khai ntn
    //Viết code song song với test
    //Test Driven Development
    //Viết code hướng về kiểm thử
    public static void tryTDDFirst() {
        //Test case #1:
        //Input n = 0; ta muốn thử nghiệm 0! coi hàm chạy ra sao.
        //Expected = 1; ta muon 0! ham phai tra ve 1
        //Actual = ? chay thu ham moi biet duoc
        long expected = 1; //Mình muốn 0! phải bằng 1
        long actual = MathUtil.getFactorial(0);
        //kiểm thử pm là so sanhs expectéd và actual để kết luạn đúng sai
        System.out.println("0! | Status | expected: 1"  + " | actual: " + actual);
        
        //Test case #2: Kiem tra ham co chay dung voi 2!, hy vong nhan ve so 2
        //Input n = 2;
        //Goi ham getFactorial(2)
        //Expected phai nhan ve la 2
        //Thuc te la may? chay moi biet
        System.out.println("2! | Status | expected: 2" + " | actual: " + MathUtil.getFactorial(2));
        //Testcase 3: 5!
        System.out.println("5! | Status | expected: 120" + " | actual: " + MathUtil.getFactorial(5));
        //Test case 4:
        //n = -5, -5! hy vong bi dap vao mat cau n k hop le
//        System.out.println("-5! | Status | expected: ngu" + " | actual: "); MathUtil.getFactorial(-5);
    }
    
    /**
     Test case la gi: tinh huong kiem thu la cach ma nhung tinh huong xai app/kiem thu app xem app chay
     co dung hay khong
     * Test case bao gom: 
     * -data dua vao ham, app: VD: 5! dc dua vao goi ham de xu ly data dua vao
     * - Gia tri ki vong Expected = 120
     * - Status: ham chay dung hay sai
     */
    
    
    /**
     1 test case la 1 tinh huong xai app/kiem thu app dung hay sai so voi 
     ki vong khi ta dua data cu the nao do vao app/ham
     alt shift f
     */
    
}
