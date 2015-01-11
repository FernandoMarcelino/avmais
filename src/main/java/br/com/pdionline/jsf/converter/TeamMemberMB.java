package br.com.pdionline.jsf.converter;

import br.com.pdionline.ejb.UserService;
import br.com.pdionline.entity.User;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gui on 28/12/14.
 */
@ManagedBean
public class TeamMemberMB {

    @Inject
    private UserService userService;
    
    private User user = new User();
    
    private List<User> userList = new ArrayList<>();

    /**
     * Lista de usuarios que podem ser inseridos na lista de avaliados ou avaliadores 
     */
    private List<User> autoCompleteUsers;

    /**
     * Lista de avaliadores selecionados 
     */
    private List<User> evaluators;

    /**
     * Lista de avaliados selecionados 
     */
    private List<User> evaluateds;
    
    
    @PostConstruct
    public void init(){

        userList = userService.findAll();
        
    }
    

    public  String  save(){
        
        user.setEvaluator(evaluators);
        user.setEvaluated(evaluateds);

        String errors = userService.create(user);
        if (errors != null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(errors));
            return null;
        }

        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário adicionado com sucesso."));
        return null;

    }
    
    public void edit(Long id){
        
        user = userService.getById(id);
        user.getEvaluated().size();
        user.getEvaluator().size();

        
    }

    public void delete(Long id){

        userService.delete(id);


    }



    public List<User> completMethodUser(String query){

        return userService.buscaPorNome(query);
        
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getAutoCompleteUsers() {
        return autoCompleteUsers;
    }

    public void setAutoCompleteUsers(List<User> autoCompleteUsers) {
        this.autoCompleteUsers = autoCompleteUsers;
    }

    public List<User> getEvaluators() {
        return evaluators;
    }

    public void setEvaluators(List<User> evaluators) {
        this.evaluators = evaluators;
    }

    public List<User> getEvaluateds() {
        return evaluateds;
    }

    public void setEvaluateds(List<User> evaluateds) {
        this.evaluateds = evaluateds;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
