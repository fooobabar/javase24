package cn.edu360.javase24.day07.construct;

/*
 * new һ�������ִ��˳��
 * 1. ��̬����飬������̬��Ա��������������˳��ִ��
 * 2. ��ͨ��ʼ������飬������������˳��ִ��
 * 3. ���췽��
 */
public class OrderDatabase {
	
	public static String orderVersion = "500";
	//��ʼ����
	{
		System.out.println("��ʼ����������....");
		System.out.println("��ʼ��������֮ǰ��orderVersion"+orderVersion);
		orderVersion="1500";
		System.out.println("��ʼ��������֮ǰ��orderVersion"+orderVersion);
		
	}
	//��̬�����
	static{
		System.out.println("��̬�����������....");
		System.out.println("��̬���������֮ǰ��orderVersion"+orderVersion);
		orderVersion="1000";
		System.out.println("��̬���������֮ǰ��orderVersion"+orderVersion);
	}
	//�޲�������
	public OrderDatabase(){
		System.out.println("�ղι��캯��������....");

		System.out.println("�ղι��캯������֮ǰ��orderVersion"+orderVersion);
		orderVersion="2000";
		System.out.println("�ղι��캯������֮ǰ��orderVersion"+orderVersion);
	}
}
