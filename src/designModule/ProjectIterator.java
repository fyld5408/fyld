package designModule;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator{
	private ArrayList<IProject> projectList=new ArrayList<IProject>();
    private int currentItem=0;
    
    public ProjectIterator(ArrayList<IProject> projectList){
    	this.projectList=projectList;
    }
    
	@Override
	public boolean hasNext() {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public Object next() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public void remove() {
		// TODO �Զ����ɵķ������
		
	}
      
}
