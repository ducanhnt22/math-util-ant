/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anh.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {

    /**
     * Kiem thu data ca chon thi nhan cu tat ve Exception ham getF dc thiet ke
     * de: - neu dua n 0..20 => ra n! dung - neu dua n < 0 || n > 20 chui/nem ra
     * Exception dua -5 vao ham, tui phai nhan ve ngoai le Thay ngoai le nhu kyh
     * vong o -5! => viet code dung roi => Mau xanh hy vong
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //Testcase 7:
        //n = -5, hy vong bi va vao mat cai Exception, con chay dc hay k thi chay ham da
        //k xai assertEquals() vi no dung cho cac gia tri cu the
        //con ngoai le la 1 thu do luong = cach may co xuat hien hay k
        //k co gia tri kieu 5 10 15 20
        MathUtil.getFactorial(-5); //ngoai le chac chan, nhung phai xem co xuat hien k
        
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        //Testcase 4:
        //n = 3, hi vong tra ve 6
        //       thuc te la may?
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        //Testcase 5:
        //n = 4, hi vong tra ve 24
        //       thuc te la may?
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        //Testcase 6:
        //n = 5, hi vong tra ve 120
        //       thuc te la may?
        Assert.assertEquals(120, MathUtil.getFactorial(5));

    }

    @Test
    public void tryAssertion() {
        Assert.assertEquals(100, 100);
    }

    @Test //Quy tac dat ten ham phai mang y nghia cua cac test case minh muon test - Coding Convention
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Testcase 1: Tinh huong kiem thu xai ham getF() dau tien
        //n = 0, 0! hy vong  Expected = 1; actual thuc te la may? chay ham moi biet dc, neu expected == actual => xanh
        //                                                                                  expected != actual => do
        long expected = 1;
        long actial = MathUtil.getFactorial(0);
        //phai so sanh 2 gia tri nay. Dung framework, k xai sout nhu cu nua
        Assert.assertEquals(expected, actial);
        //xem xem 0! co tra ve 1 hay k

        //Testcase 2:
        //n = 1, hi vong tra ve 1
        //       thuc te la may?
        expected = 1;
        actial = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actial);

        //Testcase 3:
        //n = 2, hi vong tra ve 2
        //       thuc te la may?
        expected = 2;
        actial = MathUtil.getFactorial(2);
        Assert.assertEquals(expected, actial);
    }
}

/**
 * Class n??y ch???a c??c ??o???n code d??ng ????? test code ch??nh ??? b??n th?? m???c source
 * package C??c ??o???n code ??? ????y s??? d??ng ????? test h??m getFactorial ????? xem ch???y c??
 * ????ng k Vi???t code ????? test code nh???ng ??o???n code trong n??y do dev vi???t ra d??ng
 * ????? test ch??nh c??i code b??n trong th?? m???c source ????? ?????m b???o r???ng h??m vi???t ra
 * ph???i ch???y ????ng ??o???n code ????ng ????? test code ??c g???i l?? test script
 *
 * c??c test script n??y s??? c?? c??c l???nh c?? b???n: so s??nh expected va actual nh?? h??m
 * main ???? almf th???
 *
 * nh???ng ??o???n code n??y k d??ng l???nh sout m?? d??ng nh???ng th?? vi???n ?????c bi???t ????? Khi
 * h??m sai, n??m ra ma?? ????? Khi h??m ????ng, n??m ra m??u xanh C??c th?? vi???n gi??p th???y
 * ra m??u xanh ????? t??? so s??nh gi??m expected and actual ????? k???t lu???n ????ng sai m???t
 * l??c n??y ch??? c???n nh??n 2 d??ng xanh ?????, k c???n xem chi ti???t c??c d??ng so s??nh b??n
 * main() b??? th?? vi???n n??y c??n ??c g???i l?? test framework m???i ng??n ng??? l???p tr??nh
 * ?????u c?? v??i b??? th?? vi???n th???y ra m??u xanh ????? gi??p c??c dev test c??c h??m c???a m??nh
 * VD: Java: JUnit, TestNG C# : xUnit, NUnit, MSTest PHP: phpUnit JS: bla bla
 * Python: bla bla Google: Unit test framework for...
 */
/**
 * @Test duoc goi la 1 flag/co danh dau - Annotation bao hieu cho thu vien JUnit
 * biet can Generate ham di kem @Test Bien ham nay thanh ham main() va gui
 * main() nay cho JVM - Java Virtual Machine biet de chay, khi chay so sanh 2
 * dua : Expect = Actual => xanh Expect != Actual => do k co @Test, cha co ham
 * Main() nao dc Generate => No runnable test Viec xai thu vien ma bi ep phai
 * lam gi do, dc goi la Framework
 */


/**
 * N???U VI???C CH???Y B??? TEST CASE RA MAU XANH, KHI TAT CA DEU XANH
 * XANH: KHI TAT CA CAC TEST CASE CUNG XANH
 * XANH: KHI TAT CA CAC VIEC SO SAN HEXPECTED  DEU == ACTUAL
 * 
 * DO: CHI CAN 1 THANG TRONG DAM TEST CASE MAU DO, TAT CA MAU DO
 * DO: CHI CAN 1 VIEC SO SANH EXPECTED != ACTUAL XUAT HIEN,TAT CA MAU DO
 * 
 * LOGIC: HAM NEU DA DUNG THI PHAI DUNG VOI TAT CA CAC CASE DC DUA RA
 * HAM NGON VOI CAC CASE DA TEST
 * CO GANG LIET KE DC DU CASE LA TOT NHAT
 * NGUYEN LY SO 2!!!
 * 
 * 
 * KHI RA MAU XANH TONG, HAM ON VOI TONG CAC TEST CASE
 * KHI RA MAU DO, NGHIA LA IT NHAT 1 VIEC SO SANH EXPECTED != ACTUAL
 * MAU DO VI LY DO GI PHIA SAU
 * - DO ACTUAL TRA VE K DUNG KY VONG
 * - DO EXPECTED TINH TOAN K DUNG => QC BI NGU
 */
