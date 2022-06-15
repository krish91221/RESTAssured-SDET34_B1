package GenericLibraries;

import java.util.Random;

public class JavaLibraries {

	public int getRandomNum()
	{
		Random r=new Random();
		return(r.nextInt(1000));
	}
}
