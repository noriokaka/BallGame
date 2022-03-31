import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		int[] balls = new int[100];
		for(int i=0;i<balls.length;i++){
			balls[i]=i+1;
		}
		for(int i=0;i<balls.length-1;i++){
			int index = new Random().nextInt(balls.length-i)+i;
			int tmp = balls[index];
			balls[index] = balls[i];
			balls[i] = tmp;
		}
		for(int i=0;i<5;i++){
		System.out.println((i+1)+"回戦");
		System.out.printf("A:%d,B:%d...",balls[2*i],balls[2*i+1]);
		System.out.print(balls[2*i]>balls[2*i+1]?"A":"B");
		System.out.println("の勝ち");
		}
	}
}
