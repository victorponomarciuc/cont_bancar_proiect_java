package com.example.bankaccount.Controller;

import com.example.bankaccount.Main.Bank;
import com.example.bankaccount.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BankController {
    @Autowired
    private BankService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Bank> listbank = service.listAll();
        model.addAttribute("listbank", listbank);
        return "bank";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveBank(@ModelAttribute("bank") Bank bank) {
        service.save(bank);
        return "redirect:/";
    }
}
