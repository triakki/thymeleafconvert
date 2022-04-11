package com.mkyong.controller;

import java.util.List;

public class CapacitySimulationUI {
	private String nodeId;
//	private iStatClass iStat;

	private List<CapacityWeekData> nodeCapacitySettings;

	public List<CapacityWeekData> getNodeCapacitySettings() {
		return nodeCapacitySettings;
	}

	public void setNodeCapacitySettings(List<CapacityWeekData> nodeCapacitySettings) {
		this.nodeCapacitySettings = nodeCapacitySettings;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

//	public iStatClass getiStat() {
//		return iStat;
//	}
//
//	public void setiStat(iStatClass iStat) {
//		this.iStat = iStat;
//	}
}
