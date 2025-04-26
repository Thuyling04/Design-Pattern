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

public class BacSi {
    private String ten;
    private List<BenhNhan> danhSachBenhNhan;

    public BacSi(String ten) {
        this.ten = ten;
        this.danhSachBenhNhan = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public void themBenhNhan(BenhNhan benhNhan) {
        if (!danhSachBenhNhan.contains(benhNhan)) {
            danhSachBenhNhan.add(benhNhan);
            benhNhan.themBacSi(this);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("Bác sĩ: " + ten + " đang điều trị cho:");
        for (BenhNhan bn : danhSachBenhNhan) {
            System.out.println("- Bệnh nhân: " + bn.getTen());
        }
    }
}

