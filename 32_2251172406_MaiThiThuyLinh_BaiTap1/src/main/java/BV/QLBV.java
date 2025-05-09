/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BV;

/**
 *
 * @author Mai Linh
 */
public class QLBV {
    public static void main(String[] args) {
        BacSi bs1 = new BacSi("Bác sĩ A");
        BacSi bs2 = new BacSi("Bác sĩ B");

        BenhNhan bn1 = new BenhNhan("Bệnh nhân X");
        BenhNhan bn2 = new BenhNhan("Bệnh nhân Y");

        bs1.themBenhNhan(bn1);
        bs1.themBenhNhan(bn2);

        bs2.themBenhNhan(bn1);

        bs1.hienThiDanhSach();
        bs2.hienThiDanhSach();

        bn1.hienThiDanhSachBacSi();
        bn2.hienThiDanhSachBacSi();
    }
}

