package ch29.domain.userinfo.dao;

import ch29.domain.userinfo.UserInfo;

public interface UserInfoDao {
    void insertuserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
