
package btl;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class DSGiaoVien implements  Serializable {
     ArrayList<giaoVien> lstGV = new ArrayList<giaoVien>();
     Scanner sc = new Scanner(System.in);
    public  void nhapDSGV()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP SO LUONG GIAO VIEN : ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n; i++)
        {
            giaoVien x = new giaoVien();
            x.nhap_giao_vien();
            lstGV.add(x);
        }
    }
    
    public void xuatDSGV()
            
    {   System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%n","MA","HO TEN", "DATE","GIOI TINH", "DIA CHI", "PHONE","CHUYEN NGANH","HOC HAM","MON GD","LOP DAY");
        for(int i = 0 ; i < lstGV.size(); i++)
        {
            lstGV.get(i).xuat_giao_vien();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public void ghiFile(String fileName)
    {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream Oout = new ObjectOutputStream(fout);
            
            Oout.flush();
            Oout.writeObject(lstGV);
            
            Oout.close();
            fout.close();
            
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void docFile(String fileName)
    {
        try {
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream Objin = new ObjectInputStream(fin);
            
            lstGV = (ArrayList<giaoVien>)Objin.readObject();
            
            Objin.close();
            fin.close();
        } catch(IOException e)
        {
            e.printStackTrace();
        } catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

        
}
