package service;

import domain.LoginVO;
import domain.MyModiDTO;

public interface MyModiService {

	public abstract LoginVO read(MyModiDTO dto);
}
