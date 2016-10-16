package club.fcim.usedbooktrade.interf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import club.fcim.usedbooktrade.App;
import club.fcim.usedbooktrade.innerlogic.BookDetail;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
//@WebIntegrationTest("server.port:0")
public class RequestInterfTest {

	@Test
	public void testAdd() throws Exception {
		BookDetail bookdetail = new BookDetail();
		bookdetail.setSchool("A");
		bookdetail.setContact("188");
		bookdetail.setName("A");
		bookdetail.setGrade("1");
		bookdetail.setType("A");
		RequestInterf reqInf = new RequestInterf();
		reqInf.add(bookdetail);
		
	}

}
