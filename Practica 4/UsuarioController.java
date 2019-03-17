package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class UsuarioController {

   @RequestMapping(value = "/usuario", method = RequestMethod.GET)
   public ModelAndView usuaio() {
      return new ModelAndView("usuario", "usuario", new Usuario());
   }
   
   @RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
   public String addUsuario(@ModelAttribute("SpringWeb")Usuario usuario, 
   ModelMap model) {
      model.addAttribute("Correo", usuario.getCorreo());
      model.addAttribute("Contraseña", usuario.getContra());
      model.addAttribute("Telefono", usuario.geTelefono());
      model.addAttribute("Fecha de Nacimeinto", usuario.getFechaNacimiento());
      
      return "result";
   }
}