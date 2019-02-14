package org.sathyatech.raghu.model;

import java.util.Arrays;
import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author RAGHU
 * @version 1.0
 * @category Model class
 */
@ConfigurationProperties("my.data")
@Component
public class Product {

	private int prodId;
	private String  prodCode;
	private Double  prodCost;
	
	private String[] prodModules;
	private Properties prodVersions;
	
	private ModuleInfo modInfo;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	public String[] getProdModules() {
		return prodModules;
	}

	public void setProdModules(String[] prodModules) {
		this.prodModules = prodModules;
	}

	public Properties getProdVersions() {
		return prodVersions;
	}

	public void setProdVersions(Properties prodVersions) {
		this.prodVersions = prodVersions;
	}

	public ModuleInfo getModInfo() {
		return modInfo;
	}

	public void setModInfo(ModuleInfo modInfo) {
		this.modInfo = modInfo;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + ", prodModules="
				+ Arrays.toString(prodModules) + ", prodVersions=" + prodVersions + ", modInfo=" + modInfo + "]";
	}
	
}