package SkillBuilders;

import java.io.Serializable;

public class StuName  implements Serializable
{
	private String firstName, lastName;
	
	public StuName(String fName, String lName)
	{
		fName = firstName;
		lName = lastName;
	}
	
	public String toString()
	{
		String stuNameString;
		
		stuNameString = firstName + " "
						+ lastName;
		
		return stuNameString;
	}

}