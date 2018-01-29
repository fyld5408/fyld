package designModule;

public class HumanFactory extends AbstractHumanFactory{

	public <T extends Human> T createHuman(Class<T> c){
		Human human=null;
		try {
			human=(T)Class.forName(c.getName()).newInstance();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (T)human;
	}

}
