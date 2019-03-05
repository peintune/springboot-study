package spring.study.startup.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController()
@RequestMapping("/test")
public class ControllerTest {

  @GetMapping("/kun")
  public String getConfigs(){
    return "dfdf";
  }
}
