package com.nsc.base.util;

public enum  UploadStatus {
	 Create_Directory_Fail,     //Զ�̷�������ӦĿ¼����ʧ��   
	 Create_Directory_Success,   //Զ�̷���������Ŀ¼�ɹ�   
	 Upload_New_File_Success,    //�ϴ����ļ��ɹ�   
	 Upload_New_File_Failed,     //�ϴ����ļ�ʧ��   
	 File_Exits,                 //�ļ��Ѿ�����   
	 Remote_Bigger_Local,        //Զ���ļ����ڱ����ļ�   
	 Upload_From_Break_Success,  //�ϵ������ɹ�   
	 Upload_From_Break_Failed,   //�ϵ�����ʧ��   
	 Delete_Remote_Faild;        //ɾ��Զ���ļ�ʧ��  
}