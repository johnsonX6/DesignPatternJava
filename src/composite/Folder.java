package composite;
/**
 * 用于表示层次关系，整体/部分可能是相同结构 如文件夹，树
 * @author qzhen
 *
 */
public class Folder extends Component{

	public Component[] files;
	
	public String folderName;
	
	public Folder(Component[] source){
		this.files=source;
	}
	
	public void scan(){
		for(Component com:files){
			if(com instanceof File){
				System.out.println(" component type: "+",file "+"fileName: "+((File)com).fileName);
			}else if(com instanceof Folder){
				System.out.println("component type:"+",folder"+"folderName: "+((Folder)com).folderName);
				((Folder) com).scan();
			}
		}
	}
}
