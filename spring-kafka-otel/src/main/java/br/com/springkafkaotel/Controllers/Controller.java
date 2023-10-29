package br.com.springkafkaotel.Controllers;

import br.com.springkafkaotel.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
class Controller {
    private Producer service;

    public Controller(Producer service){
        this.service = service;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        service.sendMessage("Hello " + name);
        return "Ok";
    }
}
