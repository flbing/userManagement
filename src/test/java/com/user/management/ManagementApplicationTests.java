package com.user.management;
import com.user.management.com.user.domain.TrxApplyInfo;
import com.user.management.com.user.mapper.TrxApplyInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagementApplicationTests {

	@Autowired
	private TrxApplyInfoMapper trxApplyInfoMapper;


	@Test
	public void testQuery() throws Exception {
		List<TrxApplyInfo> users = trxApplyInfoMapper.getAll();
		System.out.println(users.toString());
	}
	@Test
	public void testInsert() throws Exception {
		for(int i=0;i<100;i++) {
			TrxApplyInfo trxApplyInfo=new TrxApplyInfo();
			trxApplyInfo.setApplyNo(new Long(1000+i));
			trxApplyInfo.setApplyStatus("Y");
			trxApplyInfo.setUserNo(new Long(2000+i));
			trxApplyInfoMapper.insert(trxApplyInfo);
		}

	}

}