package com.SpotifyEjemplo.Playlist1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Inicio {
    @GetMapping("/")
    public Respuesta home(){
        return new Respuesta("Hola mundo");
    }


}
class Respuesta{
    private String msg;

    public Respuesta(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
