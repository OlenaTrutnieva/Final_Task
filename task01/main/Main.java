package by.tc.task01.main;

import by.tc.task01.dao.DAOException;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws ServiceException, DAOException {
		List<Appliance> appliances;
		
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService serv = factory.getApplianceService();
		
		Criteria laptopCriteria = new Criteria(Laptop.class.getSimpleName());
		laptopCriteria.add(Laptop.SYSTEM_MEMORY.toString(), 1000);
		laptopCriteria.add(Laptop.OS.toString(), "Windows");
		
		appliances = serv.find(laptopCriteria);
		PrintApplianceInfo.print(appliances);


	}

}
