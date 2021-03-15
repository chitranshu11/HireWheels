package com.chitranshu.hirewheels.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chitranshu.hirewheels.dao.CityDAO;
import com.chitranshu.hirewheels.dao.FuelTypeDAO;
import com.chitranshu.hirewheels.dao.LocationDAO;
import com.chitranshu.hirewheels.dao.UserDAO;
import com.chitranshu.hirewheels.dao.UserRoleDAO;
import com.chitranshu.hirewheels.dao.VehicleCategoryDAO;
import com.chitranshu.hirewheels.dao.VehicleSubCategoryDAO;
import com.chitranshu.hirewheels.entities.City;
import com.chitranshu.hirewheels.entities.FuelType;
import com.chitranshu.hirewheels.entities.Location;
import com.chitranshu.hirewheels.entities.User;
import com.chitranshu.hirewheels.entities.UserRole;
import com.chitranshu.hirewheels.entities.VehicleCategory;
import com.chitranshu.hirewheels.entities.VehicleSubCategory;
import com.chitranshu.hirewheels.services.InitService;

@Service
public class InitServiceImpl implements InitService {

   @Autowired
   UserRoleDAO userRoleDAO;

   @Autowired
   UserDAO userDAO;

   @Autowired
   VehicleCategoryDAO vehicleCategoryDAO;

   @Autowired
   VehicleSubCategoryDAO vehicleSubCategoryDAO;

   @Autowired
   CityDAO cityDAO;

   @Autowired
   FuelTypeDAO fuelTypeDAO;

   @Autowired
   LocationDAO locationDAO;
//
//   @Autowired
//   DTOEntityConverter dtoEntityConverter;

   public void start() {
       addUserRole();
       addUsers();
       addVehicleCategory();
       addVehicleSubCategory();
       addCity();
       addFuelType();
       addLocation();
   }

   public void addLocation() {
       Location location = new Location();
       location.setLocationName("Worli");
       location.setAddress("Dr E Moses Rd, Worli Naka, Upper Worli");
       location.setPincode("400018");
       location.setCity(cityDAO.findByCityName("Mumbai"));
       locationDAO.save(location);
     
       location.setLocationName("Chembur");
       location.setAddress("Optic Complex");
       location.setPincode("400019");
       location.setCity(cityDAO.findByCityName("Mumbai"));
       locationDAO.save(location);
    
   }

   public void addFuelType() {
       
       FuelType f1 = new FuelType();
       f1.setFuelType("Petrol");
       f1.setFuelTypeId(1l);
       
       fuelTypeDAO.save(f1);
       
       f1.setFuelType("Diesel");
       f1.setFuelTypeId(2l);
       fuelTypeDAO.save(f1);

  
   }

   public void addCity() {
	   City city = new City();
	   city.setCityId(1l);
	   city.setCityName("Mumbai");
       cityDAO.save(city);
   }

   public void addVehicleCategory() {
       
       VehicleCategory vc = new VehicleCategory();
       vc.setVehicleCategoryId(10l);
       vc.setVehicleCategoryName("CAR");
       
       vehicleCategoryDAO.save(vc);
       vc.setVehicleCategoryId(11l);
       vc.setVehicleCategoryName("BIKE");
       
       vehicleCategoryDAO.save(vc);
   }

   public void addVehicleSubCategory() {
       List<VehicleSubCategory> vehicleSubCategories = new ArrayList<VehicleSubCategory>();

       vehicleSubCategories.add(new VehicleSubCategory(1, "SUV",
               300,vehicleCategoryDAO.findByVehicleCategoryId(10l) ));

       vehicleSubCategories.add(new VehicleSubCategory(2, "SEDAN",
               350,vehicleCategoryDAO.findByVehicleCategoryId(10) ));

       vehicleSubCategories.add(new VehicleSubCategory(3, "HATCHBACK",
               250,vehicleCategoryDAO.findByVehicleCategoryId(10) ));

       vehicleSubCategories.add(new VehicleSubCategory(4, "CRUISER",
               200,vehicleCategoryDAO.findByVehicleCategoryId(11) ));

       vehicleSubCategories.add(new VehicleSubCategory(5, "DIRT BIKE",
               200,vehicleCategoryDAO.findByVehicleCategoryId(11) ));

       vehicleSubCategories.add(new VehicleSubCategory(6, "SPORTS BIKE",
               150,vehicleCategoryDAO.findByVehicleCategoryId(11) ));

       vehicleSubCategoryDAO.saveAll(vehicleSubCategories);
   }

   public void addUserRole() {
	   UserRole role = new UserRole();
	   role.setRoleId(1l);
	   role.setRoleName("User");
	   
	   userRoleDAO.save(role);
	   
	   role.setRoleId(2l);
	   role.setRoleName("Admin");
	   
	   userRoleDAO.save(role);
   }


   public void addUsers() {
       User adminUser = new User();
       adminUser.setEmail("admin@123");
       adminUser.setFirstName("Chitranshu");
       adminUser.setLastName("Gour");
       adminUser.setMobileNo("7894561264");
       adminUser.setPassword("password");
       adminUser.setWalletMoney(10000);
       adminUser.setUserRole(userRoleDAO.findById(1l));
       
       userDAO.save(adminUser);
   }

}