package org.stathry.jdkdeep.lang.ext;

/**
 * TODO
 * 
 * @author dongdaiming
 * @date 2017年12月29日
 */
public class Father {

	public String name1;
	protected String name2;
	String name3;
	private String name4;
	private String name = "fname";

	public Father() {
	}

	public Father(String name1, String name2, String name3, String name4) {
		super();
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

    public String getName() {
        return name;
    }
}
