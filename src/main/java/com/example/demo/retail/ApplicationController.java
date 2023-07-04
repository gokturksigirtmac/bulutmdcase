package com.example.demo.retail;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/")
    public String retailApplicationFormView(){
        return "RetailApplicationForm";
    }

    @PostMapping("/submitRetailApplicationForm")
    public String submitRetailApplicationForm(@Valid @ModelAttribute ApplicationRequest request, BindingResult bindingResult, RedirectAttributes redirectAttributes){

        if (bindingResult.hasErrors()) {
            return "redirect:/errorRetailApplication";
        }

        ApplicationModel success = applicationService.createRetailApplication(request);
        System.out.println("Success: " + success.getName());
        redirectAttributes.addFlashAttribute("user", (success.getName() + " " + success.getSurname()));
        return "redirect:/successRetailApplication";
    }

    @GetMapping("/successRetailApplication")
    public String successRetailApplicationView(Model model){
        String user = (String) model.getAttribute("user");
        // Or you can directly access the attribute using the method parameter

        // Process the passed data
        model.addAttribute("user", user);
        return "SuccessRetailApplication";
    }

    @GetMapping("/errorRetailApplication")
    public String errorRetailApplicationView(){
        return "ErrorRetailApplication";
    }


}
