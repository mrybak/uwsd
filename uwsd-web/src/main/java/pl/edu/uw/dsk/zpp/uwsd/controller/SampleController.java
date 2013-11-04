package pl.edu.uw.dsk.zpp.uwsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.uw.dsk.zpp.uwsd.dao.SampleDao;

@Controller
public class SampleController {

    @Autowired
    SampleDao sampleDao;

    @RequestMapping("/start")
    public String init() {
        return "index";
    }

    @RequestMapping("/test/getEntity")
    public String test(Model model) {
        model.addAttribute("sampleEntity", sampleDao.getSampleEntity());

        return "test";
    }
}
