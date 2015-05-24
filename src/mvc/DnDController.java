///**
// * 
// */
//package mvc;
//
//
//
//import javax.inject.Inject;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
///**
// * @author bombus
// *
// */
//
//
//@Controller
//@RequestMapping ("/weapon")
//public class DnDController {
//	
////	private WeaponService weaponService
//	
////	@Inject
////	public DnDController(WeaponService weaponService) {
////		this.weaponService = weaponService;
////	}
//	
//
//	@RequestMapping (value="/weapon", method=RequestMethod.GET)
//	public String getWeapon(@PathVariable("weapon") String weapon, Model model) {
//		
//		model.addAttribute(weaponService.getWeaponByName(weapon));
//	}
//}
