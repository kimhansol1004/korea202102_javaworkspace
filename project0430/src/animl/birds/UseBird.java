package animal.birds;

/*
��ӿ��� ��ġ�� ���ƾ� �� ���� ����
1) �ڵ��� ����
2) ��ü�� ����ȯ ( ���� �ܰ� �޴�)
*/
class UseBird{
	public static void main(String[] stgs){
		//[ �⺻ �ڷ����� ����ȯ�� ��]
		int x=7; //4 byte ū �ڷ���
		byte b=3; //1 byte ���� �ڷ���
		//x=b; //������ �ڵ�
		b=(byte)x; //�ս��� �߻��ϹǷ�, �Ұ����ϴ� ������ �����ڰ� �ս��� �����ؼ��� ������ ����ȯ��
			   //�����ϸ� �������ش� (�Ұ�ȣ)�� ������ ĳ��Ʈ �����ڶ� �Ѵ�

		//��ü�ڷ����� ����ȯ�� ��
		Bird bird = new Bird("red");
		Duck d = new Duck("white");
		bird=d; //O �⺻�ڷ����� ���߾�, �뷮�� ������ �����ϸ� �ȵ�
		//��ü�� ����ȯ�� ���� �� ������ ��ü�� ����ų �� �ִ���? �����ڷ����̴� ū �ڷ����̴�
		bird.fly();

		//bird.canSwim(); //bird������ �ڷ����� Bird�̱� ������ �翬�� BirdŬ��������
							   //canSwim() �޼��尡 ���� ���� �����Ͽ���!

		Duck duck=(Duck)bird; //��ü���� �� ��ȭ�� �����ϴ� �̶� �ڽ� �ڷ��������� ����ȯ��
										 //������ downCasting�̶� �Ѵ�
		duck.canSwim();
	}
}