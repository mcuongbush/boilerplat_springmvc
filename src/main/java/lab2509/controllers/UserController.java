package lab2509.controllers;

import lab2509.models.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.persistence.Entity;

import java.util.List;

@Transactional
@RequestMapping(value = {"/user/"})
@Controller
public class UserController {
    @Autowired
    SessionFactory factory;
    @RequestMapping("index")
    public String cc(ModelMap model) {
        Session session;
        session = factory.getCurrentSession();

        String hql = "FROM User";
        Query query = session.createQuery(hql);
        /*Query<User> theQuery=
                session.createQuery(" from User");*/
        List<User> lst = query.list();
        model.addAttribute("users",lst);
        return "user";
    }
    Session getSession(){
        Session session;
        try {
            session = factory.getCurrentSession();
        } catch (HibernateException e) {
            session = factory.openSession();
        }
        return session;
    }

}
