package com.mkyong.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	private SimulationContent simulationContent;
	private CapacitySimulationUI capacitySimulationUI;

	@GetMapping("/")
    public String main(Model model) {
        
        //////////////////////////////////////////////////////////////////
        //Capacity
        //////////////////////////////////////////////////////////////////
        List<CapacityWeekData> nodeCapacitySettings = new ArrayList<CapacityWeekData>();
        CapacityWeekData capacityWeekData1 = new CapacityWeekData();
		capacityWeekData1.setCapacity("000");
		capacityWeekData1.setCapacityWeek("Monday");
        CapacityWeekData capacityWeekData2 = new CapacityWeekData();
		capacityWeekData2.setCapacity("000");
		capacityWeekData2.setCapacityWeek("Tuesday");
        CapacityWeekData capacityWeekData3 = new CapacityWeekData();
        capacityWeekData3.setCapacity("000");
        capacityWeekData3.setCapacityWeek("Wednesday");
        CapacityWeekData capacityWeekData4 = new CapacityWeekData();
        capacityWeekData4.setCapacity("000");
        capacityWeekData4.setCapacityWeek("Tuesday");
        CapacityWeekData capacityWeekData5 = new CapacityWeekData();
        capacityWeekData5.setCapacity("000");
        capacityWeekData5.setCapacityWeek("Tuesday");
        CapacityWeekData capacityWeekData6 = new CapacityWeekData();
        capacityWeekData6.setCapacity("000");
        capacityWeekData6.setCapacityWeek("Tuesday");
        CapacityWeekData capacityWeekData7 = new CapacityWeekData();
        capacityWeekData7.setCapacity("000");
        capacityWeekData7.setCapacityWeek("Tuesday");

		capacitySimulationUI = new CapacitySimulationUI();
        capacitySimulationUI.setNodeId("1234");
		capacitySimulationUI.setNodeCapacitySettings(nodeCapacitySettings);
        nodeCapacitySettings.add(capacityWeekData1);
        nodeCapacitySettings.add(capacityWeekData2);
        nodeCapacitySettings.add(capacityWeekData3);
        nodeCapacitySettings.add(capacityWeekData4);
        nodeCapacitySettings.add(capacityWeekData5);
        nodeCapacitySettings.add(capacityWeekData6);
        nodeCapacitySettings.add(capacityWeekData7);

        simulationContent = new SimulationContent();
        simulationContent.setCreatedBy("Lavanya Shivkumar");
        simulationContent.setSimulationId("0000000001");
        simulationContent.setCreatedDate(new Date());
        simulationContent.setStartDate(new Date());
        simulationContent.setEndDate(new Date());
        
        List<CapacitySimulationUI> capacitySimulationUIs = new ArrayList<CapacitySimulationUI>();
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);

        model.addAttribute("SimulationContent", simulationContent);
        model.addAttribute("SimulationUIContent", capacitySimulationUIs);
        model.addAttribute("SimulationUIContent2", capacitySimulationUIs);
        
        
        //////////////////////////////////////////////////////////////////
        //Lead Time
        //////////////////////////////////////////////////////////////////
        List<CapacityWeekData> nodeCapacitySettings2 = new ArrayList<CapacityWeekData>();
        CapacityWeekData capacityWeekData1_2 = new CapacityWeekData();
		capacityWeekData1_2.setCapacity("000");
		capacityWeekData1_2.setCapacityWeek("Order Processing Time");
        CapacityWeekData capacityWeekData2_2 = new CapacityWeekData();
		capacityWeekData2_2.setCapacity("000");
		capacityWeekData2_2.setCapacityWeek("Order Cutoff Time");
        CapacityWeekData capacityWeekData3_2 = new CapacityWeekData();
        capacityWeekData3_2.setCapacity("000");
        capacityWeekData3_2.setCapacityWeek("Node Buffer");

		capacitySimulationUI = new CapacitySimulationUI();
        capacitySimulationUI.setNodeId("1234");
		capacitySimulationUI.setNodeCapacitySettings(nodeCapacitySettings2);
		nodeCapacitySettings2.add(capacityWeekData1_2);
        nodeCapacitySettings2.add(capacityWeekData2_2);
        nodeCapacitySettings2.add(capacityWeekData3_2);

        simulationContent = new SimulationContent();
        simulationContent.setCreatedBy("Lavanya Shivkumar");
        simulationContent.setSimulationId("0000000001");
        simulationContent.setCreatedDate(new Date());
        simulationContent.setStartDate(new Date());
        simulationContent.setEndDate(new Date());
        
        List<CapacitySimulationUI> capacitySimulationUIs2 = new ArrayList<CapacitySimulationUI>();
        capacitySimulationUIs2.add(capacitySimulationUI);
        capacitySimulationUIs2.add(capacitySimulationUI);
        capacitySimulationUIs2.add(capacitySimulationUI);
        capacitySimulationUIs2.add(capacitySimulationUI);
        capacitySimulationUIs2.add(capacitySimulationUI);
        capacitySimulationUIs2.add(capacitySimulationUI);
        capacitySimulationUIs2.add(capacitySimulationUI);
        model.addAttribute("SimulationContentLT", simulationContent);
        model.addAttribute("SimulationUIContentLT", capacitySimulationUIs2);
        model.addAttribute("SimulationUIContent2LT", capacitySimulationUIs2);
        
        //////////////////////////////////////////////////////////////////
        //Cost
        //////////////////////////////////////////////////////////////////
        List<CapacityWeekData> nodeCapacitySettingsCOST = new ArrayList<CapacityWeekData>();
        CapacityWeekData capacityWeekData1COST = new CapacityWeekData();
		capacityWeekData1COST.setCapacity("000");
		capacityWeekData1COST.setCapacityWeek("Node Cost");
        CapacityWeekData capacityWeekData2COST = new CapacityWeekData();
		capacityWeekData2COST.setCapacity("000");
		capacityWeekData2COST.setCapacityWeek("Node Weight");
        CapacityWeekData capacityWeekData3COST = new CapacityWeekData();
        capacityWeekData3COST.setCapacity("000");
        capacityWeekData3COST.setCapacityWeek("Transportation Weight");

		capacitySimulationUI = new CapacitySimulationUI();
        capacitySimulationUI.setNodeId("1234");
		capacitySimulationUI.setNodeCapacitySettings(nodeCapacitySettingsCOST);
		nodeCapacitySettingsCOST.add(capacityWeekData1COST);
		nodeCapacitySettingsCOST.add(capacityWeekData2COST);
		nodeCapacitySettingsCOST.add(capacityWeekData3COST);

        simulationContent = new SimulationContent();
        simulationContent.setCreatedBy("Lavanya Shivkumar");
        simulationContent.setSimulationId("0000000001");
        simulationContent.setCreatedDate(new Date());
        simulationContent.setStartDate(new Date());
        simulationContent.setEndDate(new Date());
        
        List<CapacitySimulationUI> capacitySimulationUIsCOST = new ArrayList<CapacitySimulationUI>();
        capacitySimulationUIsCOST.add(capacitySimulationUI);
        capacitySimulationUIsCOST.add(capacitySimulationUI);
        capacitySimulationUIsCOST.add(capacitySimulationUI);
        capacitySimulationUIsCOST.add(capacitySimulationUI);
        capacitySimulationUIsCOST.add(capacitySimulationUI);
        capacitySimulationUIsCOST.add(capacitySimulationUI);
        capacitySimulationUIsCOST.add(capacitySimulationUI);
        model.addAttribute("SimulationContentCOST", simulationContent);
        model.addAttribute("SimulationUIContentCOST", capacitySimulationUIsCOST);
        model.addAttribute("SimulationUIContent2COST", capacitySimulationUIsCOST);


        return "welcome5";
    }
}