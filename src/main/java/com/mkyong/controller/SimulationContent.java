package com.mkyong.controller;

import java.util.Date;

public class SimulationContent {
	private String createdBy;
	private String simulationId;
	private Date createdDate;
	private Date startDate;
	private Date endDate;
	private String iStat;
	
//	private CapacitySimulationUI capacitySimulationUI;
	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getSimulationId() {
		return simulationId;
	}

	public void setSimulationId(String simulationId) {
		this.simulationId = simulationId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

//	public CapacitySimulationUI getCapacitySimulationUI() {
//		return capacitySimulationUI;
//	}
//
//	public void setCapacitySimulationUI(CapacitySimulationUI capacitySimulationUI) {
//		this.capacitySimulationUI = capacitySimulationUI;
//	}

	public String getiStat() {
		return iStat;
	}

	public void setiStat(String iStat) {
		this.iStat = iStat;
	} 
}
