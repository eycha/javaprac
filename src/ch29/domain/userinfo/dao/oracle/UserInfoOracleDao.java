package ch29.domain.userinfo.dao.oracle;

import ch29.domain.userinfo.UserInfo;
import ch29.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertuserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB UserID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle DB userID=" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from Oracle DB userID = "+ userInfo.getUserId());
    }
}
