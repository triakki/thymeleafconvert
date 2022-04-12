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
        
        iStatClass iStat = new iStatClass();
        iStat.setIndex(1);
        
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
//        simulationContent.setCapacitySimulationUI(capacitySimulationUI);
        
        model.addAttribute("SimulationContent", simulationContent);
        
//        model.addAttribute("SimulationUIContent", new ArrayList<CapacitySimulationUI>().add(capacitySimulationUI));
        
        List<CapacitySimulationUI> capacitySimulationUIs = new ArrayList<CapacitySimulationUI>();
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);
        capacitySimulationUIs.add(capacitySimulationUI);

        model.addAttribute("SimulationUIContent", capacitySimulationUIs);
        model.addAttribute("SimulationUIContent2", capacitySimulationUIs);

//        model.addAttribute("nodeId", true);

        return "welcome5"; //view
    }
}