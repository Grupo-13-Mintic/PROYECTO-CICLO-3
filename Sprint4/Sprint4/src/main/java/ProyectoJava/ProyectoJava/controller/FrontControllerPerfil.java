package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.Perfil;
import ProyectoJava.ProyectoJava.service.Impl.PerfilService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class FrontControllerPerfil {

    private PerfilService perfilService;
    public FrontControllerPerfil( PerfilService perfilService) {
        this.perfilService = perfilService;
    }


    @GetMapping("/")
    public String iniciar(Model model, @AuthenticationPrincipal OidcUser principal){
        if (principal != null){
            System.out.println(principal.getClaims());
            Perfil perfil = this.perfilService.generateOrCreatePerfil(principal.getClaims());
            model.addAttribute("perfil", perfil);
        }
        return "index";
    }
}
