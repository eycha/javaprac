package ch29.domain.userinfo.dao.mysql;

import ch29.domain.userinfo.UserInfo;
import ch29.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertuserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB UserID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySql DB userID=" + userInfo.getUserId());

    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MySQL DB userID = "+ userInfo.getUserId());

    }
}
