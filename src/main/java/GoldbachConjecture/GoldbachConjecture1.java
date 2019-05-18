package GoldbachConjecture;

public class GoldbachConjecture1 {

	public static void main(String[] args) {
		GoldbachConjecture(500L);
		 //System.out.println(isPrime(9223372036854775807L));
		//System.out.println(isPrime(101L));
	}

	/**
	 * ��֤��һ����2��ż������д����������֮��
	 * 
	 * @param num
	 */
	public static void GoldbachConjecture(long num) {
		// ���Ƚ�num�ֽ�Ϊ��������֮��
		long num1, num2;
		for (num1 = 1; num1 <= num / 2; num1++) {
			num2 = num - num1;
			// �ֱ��ж���ϵ����������Ƿ��Ϊ����
			if (isPrime(num1) && isPrime(num2)) {
				System.out.println(num + "=" + num1 + "+" + num2);
			}
		}
	}

	/**
	 * ��֤�Ƿ�������
	 * 
	 * @param n Ҫ�жϵ�����
	 * @return true or false
	 */
	private static boolean isPrime(long n) {
//1��2�����жϣ�1�Ѿ�����������2����С����
		if (n == 1) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			for (long i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}

	}

}
