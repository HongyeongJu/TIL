package api.lang;

public class Owner {
	private String name;
	private String cellPhone;
	
	public Owner(String name, String cellPhone) {
		this.name = name;
		this.cellPhone = cellPhone;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Owner && (((Owner)obj).getName()).equals(name)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "�̸��� " + name +"�̰�, �ڵ��� ��ȣ��" + cellPhone + "�Դϴ�.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
}
