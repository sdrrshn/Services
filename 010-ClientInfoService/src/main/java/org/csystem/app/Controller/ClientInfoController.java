package org.csystem.app.Controller;

import org.csystem.app.data.ClientInfo;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("api/client")
@Scope("prototype")
public class ClientInfoController {
    private final ClientInfo clientInfo;


    public ClientInfoController(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }



    @GetMapping("info/api")
    public String getClientInfo() {
        return clientInfo.toString();
    }

}
