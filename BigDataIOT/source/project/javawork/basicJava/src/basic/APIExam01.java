// ��Ű���� �ѹ�����ߵ�.
package basic;

import java.io.File;
import java.util.Random;
import java.util.Vector;

// APIExam01Ŭ���� ���ο��� ����ϴ� API�� Ŭ������ java.util ��Ű�������� ã�� �� �ֵ��� ����
// import �� ������ ����� ���ִ�.
/*import java.util.*;
import java.util.Random;
import java.io.File;*/
// ��Ȯ�ϰ� ����ϴ� import�� ����϶�.(�ǰ����)
public class APIExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. "I like java"���ڿ��� �Ʒ� ���ǿ� �°� ó���� �� �յ��� String Ŭ������ ���� �۾��մϴ�.
		
		String str = new String("I like java");
		System.out.println("���ڿ��� ���� : " + str.length());
		
		
		//JVM�� �⺻���� �ν��ϴ� API�� ��ġ�� java/lang��Ű���� ���� �ҽ������� �۾��ϴ� ��ġ(basic)
		new Random();
		new File("");
		new Vector();
	}

}
