package examples;

public class gettersetter {
	int id;
	String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gettersetter gs=new gettersetter();
		gs.setId(10);
		gs.setName("Ravi");
		//System.out.println(gs.toString());
		System.out.println(gs.getId());
		System.out.println(gs.getName());
		System.out.println(gs);

	}

}
