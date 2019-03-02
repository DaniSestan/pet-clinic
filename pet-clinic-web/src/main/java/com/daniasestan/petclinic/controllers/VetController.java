package com.daniasestan.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){
        return "/vets/index";
    }
}

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class VetController {
//
////    private final VetService vetService;
////
////    public VetController(VetService vetService) {
////        this.vetService = vetService;
////    }
//
//    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
//    public String listVets(Model model){
//
////        model.addAttribute("vets", vetService.findAll());
//
//        return "vets/index";
//    }
//
////    @GetMapping("/api/vets")
////    public @ResponseBody Set<Vet> getVetsJson(){
////
////        return vetService.findAll();
////    }
//}