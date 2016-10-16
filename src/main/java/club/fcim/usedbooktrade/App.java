package club.fcim.usedbooktrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import club.fcim.usedbooktrade.dbutil.DBAssist;
import club.fcim.usedbooktrade.dbutil.DBUtil.DataSourceEnvironment;

/**
 * 
 * @author cris-li
 *
 */

@SpringBootApplication(scanBasePackages={"club.fcim"})
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
	
	@Bean(name = "usedbook")
	public DBAssist curdAssist4BizzCentre() {
		return new DBAssist(DataSourceEnvironment.usedbook);
	}
}
