
package btl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;



public class Main { 

     public static void main(String[] args) throws ClassNotFoundException, IOException  {
         DSBangDiem x = new DSBangDiem();
         
         while (true) {
             int chon ; 
             System.out.println("                               =============================================================");
             System.out.println("                                                   1.Nhap So luong bang diem");
             System.out.println("                                                   2.Xuat bang diem ");
             System.out.println("                                                   3.Ghi file ( bangdiem.dat ) ");
             System.out.println("                                                   4.Doc file ( bang diem.dat ) ");
             System.out.println("                                                   5.Sap xep theo ten ");
             System.out.println("                                                   6.Tinh diem trung binh theo lop ");
             System.out.println("                                                   7.Xoa theo ma hoc sinh ");
             System.out.println("                                                   8.Tim hoc sinh co diem ( MIN_MAX ) ");
             System.out.println("                                                   9.Sap xep theo diem trung binh ");
             System.out.println("                                                   10.Dung chuong trinh ");
             System.out.println("                               ==============================================================");
             Scanner sc = new Scanner(System.in);
             System.out.print("                                                     Moi ban chon : ");
             chon = (new Scanner(System.in)).nextInt();
             
             switch (chon) {
                 case 1:
                     x.nhapDSBD();
                     break;
                 case 2 : 
                     x.xuatDSBD();
                     break;
                 case 3:
                     x.ghiFileBD();
                     break;
                 case 4:
                     x.docFileBD();
                     x.xuatDSBD();
                     break;
                 case 5:
                     x.SXTenHS();
                     break;
                 case 6:
                     x.TinhDiemTBTheoLop();
                     
                     break;
                 case 7:
                     x.xoaTheoMa();
                     break;
                 case 8:
                     x.TKHSDiemMin_Max();
                     break;
                 case 9:
                     x.SXDiemTB();
                     break;
                 case 10:
                     System.exit(0);
                     break;
                     
             }
         }

     }
}

     
