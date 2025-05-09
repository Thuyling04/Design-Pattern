/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BV;

/**
 *
 * @author Mai Linh
 */

import java.util.ArrayList;
import java.util.List;

public class BenhNhan {
    private String ten;
    private List<BacSi> danhSachBacSi;

    public BenhNhan(String ten) {
        this.ten = ten;
        this.danhSachBacSi = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public void themBacSi(BacSi bacSi) {
        if (!danhSachBacSi.contains(bacSi)) {
            danhSachBacSi.add(bacSi);
            bacSi.themBenhNhan(this);
        }
    }

    public void hienThiDanhSachBacSi() {
        System.out.println("Bệnh nhân: " + ten + " được điều trị bởi:");
        for (BacSi bacSi : danhSachBacSi) {
            System.out.println("- Bác sĩ: " + bacSi.getTen());
        }
    }
}

