package edu.upc.caminstech.foraDeServei;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OutOfServiceController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @RequestMapping(value = ERROR_PATH)
    @ResponseBody
    public String outOfService() {
        return "<html><head></head><body><h1>Fora de servei</h1>"
                + "<p>Aquesta aplicació està temporalment fora de servei. Preguem disculpeu les molèsties.</p></body></html>";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
