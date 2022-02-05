package controlador;

import modelo.Conexion;
import modelo.usuario;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.dao.DataAccessException;

@Controller
public class Controlador {

    Conexion conexion = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(conexion.Conectar());
    ModelAndView mv = new ModelAndView();

    @RequestMapping(value = "index.htm", method = RequestMethod.GET)
    public ModelAndView login() {
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "registro.htm", method = RequestMethod.GET)
    public ModelAndView registro() {
        mv.addObject(new usuario());
        mv.setViewName("registro");
        return mv;
    }

    @RequestMapping(value = "hello.htm", method = RequestMethod.GET)
    public ModelAndView hello() {
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping(value = "registro.htm", method = RequestMethod.POST)
    public ModelAndView registro(usuario u) {
        String sql = "insert into usuario(usuario,email,password)values(?,?,?)";
        try {
            this.jdbcTemplate.update(sql, u.getUsuario(), u.getEmail(), u.getPassword());
            return new ModelAndView("redirect:/index.htm");
        } catch (DataAccessException e) {
            e.getMessage();
        }
        return mv;
    }

    @RequestMapping(value = "index.htm", method = RequestMethod.POST)
    public ModelAndView login(usuario u) {
        String sql = "select usuario from usuario where usuario = ? and password = ?";
        try {
            String usuario = this.jdbcTemplate.queryForObject(sql, new Object[]{u.getUsuario(), u.getPassword()}, String.class);
            return new ModelAndView("redirect:/hello.htm");

        } catch (DataAccessException e) {
            e.getMessage();
        }
        return mv;
    }
}
