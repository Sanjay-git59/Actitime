package basics;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider
	public Object[][] getData() {
		Object[][]data= {{"Admin","admin123"},
				{"Virat","Anushka"},{"Selenium","QTP"},{"Modi","Rahul"}	};
		return data;
	}
}
