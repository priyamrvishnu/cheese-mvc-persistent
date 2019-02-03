package org.launchcode.controllers;


import org.launchcode.models.Category;
import org.launchcode.models.data.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping(value=" ")
    public String index (Model model){
        model.addAttribute("category", categoryDao.findAll());
        model.addAttribute("title", "My Categories");
        return "index";

    }

    @RequestMapping (value="add", method = RequestMethod.GET)
    public String add(Model model){

        model.addAttribute(new Category());

        return"category/add";
    }


}
