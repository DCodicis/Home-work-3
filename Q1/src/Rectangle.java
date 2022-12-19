import java.util.Scanner;

public class Rectangle {
    private int height, width;
    public Rectangle (int h, int w) {
    this.height = h;
    this.width = w;  
    }
    public void drewFild(char a){
        for(int i=1; i<=height; i++){
            for(int j=1; j<=width; j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    public void drewEmpty(){
        for (int i = 0; i < height; i++ ) {
			for (int j = 0 ; j < width; j++ ){
				if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
    public void drewEmpty(char c){
        for (int i = 0; i < height; i++ ) {
			for (int j = 0 ; j < width; j++ ){
				if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
					System.out.print(c);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
	public void readRectFromConsole(){
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter new width: ");
		width = s.nextInt();
		System.out.print("Please enter new height: ");
		height = s.nextInt();
	}
}  

