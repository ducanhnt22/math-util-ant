/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anh.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.anh.mathutil.core.MathUtil.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //Chuan bi data - mang 2 chieu vi co data n dua vao va Expected va co nhieu cap nhu the
    // => Mang 2 chieu 
    
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25, 30, 35};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0}, 
                     {1, 1}, 
                     {2, 2}, 
                     {6, 3}, 
                     {24, 4}, 
                     {120, 5}, 
                     {720, 6}};
        
        
        return new Integer[][] {{1, 0}, 
                               {1, 1}, 
                               {2, 2}, 
                               {6, 3}, 
                               {24, 4}, 
                               {120, 5}, 
                               {720, 6}};
    } //Xai Wrapper class neu choi voi so, vi du Integer (int), Long (long)
    
    //Sau khi co bo data qua mang 2 chieu, JUnit se tu lap for
    //De loi ra tung cap data o tren vao trong ham so sanh...
    //Gan value vao bien - Tham so hoa: Parameterized
    //Ta se map/anh xa 2 cot ung voi 2 bien:cot 0 - Expected
    //                                      cot 1 - N dua vao ham getF()
    
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    //Test thoi vi da co cac test case va data
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        Assert.assertEquals(expected, getFactorial(n));
    }
}

/**
 * Class nay se chua code test code chinh o ben class MathUtil
 * Class nay se chua code dung de test ham getF() coi ham chay dung k
 * Code viet ra dung de test code khac (class/ham khac) thi class nay dc goi ten la test script.
 * 
 * Trong cai test script se co nhung tinh huong xai app (dua data cu the vao, cho xem ham xu li ket qua co nhu ki vong hay k
 * test script se chua nhieu test case
 * moi test case ung voi 1 tinh huong xai ham
 * 
 * Phan tich test script cu
 * Trong test script cu xuat hien bad smell - su trung lenh ve cau lenh Assert.assertEquals(24, MathUtil.getFactorial(4));
 * Lenh so sanh gia tri, lenh goi ham dc lap di lap lai voi moi bo test case
 * Cung ham nay, lenh nay, nhung no phai viet lai cho cac bo data sau:
 * 
 * Expected                 n
 * 0                        0
 * 1                        1
 * 2                        2
 * 6                        3
 * 24                       4
 * 
 * Co cach nao thay 2 con so nao trong lenh de so sanh 2 so do bang nhau k?
 * Assert.assertEquals(expected, MathUtil.getFactorial(n));
 * 
 * Neu ta tach dc toan bo data trong cac cau lenh so sanh o tren ra 1 cho rieng biet nhu hang cot o tren, sau do ta
 * chi viec lay data nay nap dan vao cai lenh goi ham thi ta se dat dc 
 * 
 * - Code gon gang hon, k bi trung lap
 * - Nhin tong quan, biet bao nhieu test case va lieu rang chung da du hay chua
 * 
 * Ki thuat viet test script(cau lenh test) ma tach biet data ra khoi lenh so sanh
 * dc goi bang nhung ten sau:
 * - PARAMETERIZED - THAM SO HOA, BIEN DATA RA 1 CHO, DAT CHO CHUNG CAI TEN BIEN, LAT HOI CHO CHUNG VAO LENH SO SANH
 * - DDT - DATA DRIVEN TESTING: VIET CODE KIEM THU THEO STYLE TACH DATA
 * JNIT FRAMEWORK HO TRO TA TACH DATA, DUYET VONG FOR TREN DATA
 * 
 * DE CHOI VOI DDT, TA CAN:
 *      - tach data ra 1 cho - MANG
 *      - Map data vao cac bien tuong ung
 *      - Nhoi cac bien tuong ung vao cac lenh so sanh/hoi ham
 */
