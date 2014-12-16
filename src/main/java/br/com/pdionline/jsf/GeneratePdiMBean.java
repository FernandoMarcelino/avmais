package br.com.pdionline.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.pdionline.ejb.MyPdiService;
import br.com.pdionline.entity.Pdi;
import br.com.pdionline.entity.User;

@ManagedBean
@RequestScoped
public class GeneratePdiMBean {

	@Inject
	private MyPdiService teamMemberBean;

	private Pdi pdi = new Pdi();

	public void save() throws Exception {
		// teamMemberBean.create(pdi);
	}

	public Pdi getPdi() {
		return pdi;
	}

	public void setPdi(Pdi pdi) {
		this.pdi = pdi;
	}

	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		
		User user1 = new User();
		user1.setName("Carlos Silva Fernandes");
		users.add(user1);

		User user2 = new User();
		user2.setName("José Silveira Duffeck");
		users.add(user2);

		User user3 = new User();
		user3.setName("Marcio Pereira Rosa");
		users.add(user3);
		
		User user4 = new User();
		user4.setName("Manoella Assis Garcez");
		users.add(user4);
		
		return users;
	}
}
