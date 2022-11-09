package kr.co.ezenac.utilizeInterface.userInfo.dao.mysql;

import kr.co.ezenac.utilizeInterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utilizeInterface.userInfo.dao.UserInfoDAO;

public class UserInfoMySqlDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySQL DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MySQL DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MySQL DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MySQL DB userid = " + userInfoDTO.getUserId());
		
	}

}
