package service;

import domain.LoginVO;
import domain.MyModiDTO;
import mapper.MyModiMapper;

public class MyModiServiceImpl implements MyModiService {

	@Override
	public LoginVO read(MyModiDTO dto) {
		return new MyModiMapper().read(dto);
	}

}
