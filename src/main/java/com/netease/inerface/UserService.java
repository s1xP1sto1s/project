package com.netease.inerface;

public interface UserService {
    /**
     * ����һ���û�
     * @param name
     * @param age
     */
    void create(String name, Integer age);
    /**
     * ����nameɾ��һ���û���
     * @param name
     */
    void deleteByName(String name);
    /**
     * ��ȡ�û�����
     */
    Integer getAllUsers();
    /**
     * ɾ�������û�
     */
    void deleteAllUsers();
}
