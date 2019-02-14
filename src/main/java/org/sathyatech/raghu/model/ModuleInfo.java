package org.sathyatech.raghu.model;

/**
 * 
 * @author RAGHU
 *
 */
public class ModuleInfo {

	private String moduleCode;
	private int moduleVer;
	
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public int getModuleVer() {
		return moduleVer;
	}
	public void setModuleVer(int moduleVer) {
		this.moduleVer = moduleVer;
	}
	@Override
	public String toString() {
		return "ModuleInfo [moduleCode=" + moduleCode + ", moduleVer=" + moduleVer + "]";
	}
	
	
}
