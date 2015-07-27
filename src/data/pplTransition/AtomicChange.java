package data.pplTransition;


public class AtomicChange {
	
	private String affectedTable=null;
	private String affectedAttribute=null;
	private String type;
	private String oldSchema;
	private String newSchema;
	
	
	public AtomicChange(String tmpAffectedTable, String tmpAffectedAttribute, String tmpType, String tmpOldSchema, String tmpNewSchema){
		
		affectedTable = tmpAffectedTable;
		affectedAttribute = tmpAffectedAttribute;
		type = tmpType;
		oldSchema = tmpOldSchema;
		newSchema = tmpNewSchema;
		
	}
	
	public String toString(){
		String lala="AtomicChange: Table: "+affectedTable+"\tAttribute: "+affectedAttribute+"\tType: "+type+"\toldSchema: "+ oldSchema +"\tnewSchema: " +newSchema;
		return lala;
		
	}
	
	public String getAffectedTableName(){
		
		return affectedTable;
		
	}
	
	public String getAffectedAttrName(){
		
		return affectedAttribute;
		
	}
	
	
	public String getType(){
		
		return type;
	}
	
	public String[] getOldNewVersions(){
		
		String[] versions=new String[2];
		
		versions[0] = oldSchema;
		versions[1] = newSchema;
		
		return versions;
		
	}

}
