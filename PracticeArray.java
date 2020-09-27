package practice;

public class PracticeArray {
		public void main(String[] args) {
			PracticeArray x=new PracticeArray();
			x.countDimples(new int[] {1,1,2,2,3});
			x.countDimples(new int[] {1});
			x.countDimples(new int[] {1,0,1,0,1});
			x.countDimples(new int[] {0,1,0,1,0});
			x.countDimples(new int[] {-1,-18736,123817});
		
			
		}
		int countDimples(int[] n) {
			int l=n.length,t=0;
			for(int i=0;i<l-2;i++) {
				if(n[i+1]<n[i]&&(n[i+1]<n[i+2])) {
					t++;
				}
			}
			return t;
		}
}
