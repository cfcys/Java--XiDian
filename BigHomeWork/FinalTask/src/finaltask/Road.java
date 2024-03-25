package finaltask;

public class Road{
		int length;
		int num;
		String Start;
		String End;

		Road(Station S1,Station S2){
			Start = S1.Name;
			End = S2.Name;
			num = S2.Num;
			length = S2.NumFromLast;
		}

		public Road() {
		}
}
