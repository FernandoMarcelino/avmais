package org.jboss.as.quickstarts.kitchensink.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.jboss.as.quickstarts.kitchensink.model.TeamMemberPdi;
import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudModel;

@ManagedBean
@RequestScoped
public class PdiMBean {

	private TeamMemberPdi pdi = new TeamMemberPdi();

	public void register() throws Exception {
		System.out.println("salvou " + pdi.getName());
	}

	public TeamMemberPdi getPdi() {
		return pdi;
	}

	public void setPdi(TeamMemberPdi pdi) {
		this.pdi = pdi;
	}

}
