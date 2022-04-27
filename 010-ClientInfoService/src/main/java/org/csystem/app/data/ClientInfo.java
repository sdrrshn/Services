package org.csystem.app.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope("prototype")
public class ClientInfo {
    private final HttpServletRequest request;
    private final LocalDateTime now;
    private final DateTimeFormatter formatter;

    public ClientInfo(HttpServletRequest request, LocalDateTime now, DateTimeFormatter formatter) {
        this.request = request;
        this.now = now;
        this.formatter = formatter;
    }





    @Override
    public String toString() {
        var localAddr = request.getLocalAddr();
        var remoutaddr = request.getRemoteAddr();
        var remoutHost = request.getRemoteHost();
        var localPort = request.getLocalPort();
        var remoutPort = request.getRemotePort();

        return  String.format("%s, %s, %s, %d, %d, %s",localAddr,remoutaddr,remoutHost,localPort,remoutPort,formatter.format(now));
    }
}
