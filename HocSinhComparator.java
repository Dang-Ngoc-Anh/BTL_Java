package BTL;

import java.util.Comparator;

public class HocSinhComparator implements Comparator<HocSinh>{
	@Override
	public int compare (HocSinh o1, HocSinh o2) {
		if(o1.getDiemTB()==o2.getDiemTB()) return 0;
		else if(o1.getDiemTB()>o2.getDiemTB())
			{return 1;}
		else
			{return -1;}
	}
}