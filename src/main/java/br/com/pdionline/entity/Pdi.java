package br.com.pdionline.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pdi implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	private User userThatGenerateThePdi;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	private User userEvaluated;

	private String positivePoints;
	private String pointsToImprove;
	private String nextGoals;
	private String studySugestions;
	private String indications;
	private String tipsForDailyBehavior;
	private String actions;
	private String whatManagerCanDo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUserThatGenerateThePdi() {
		return userThatGenerateThePdi;
	}

	public void setUserThatGenerateThePdi(User userThatGenerateThePdi) {
		this.userThatGenerateThePdi = userThatGenerateThePdi;
	}

	public User getUserEvaluated() {
		return userEvaluated;
	}

	public void setUserEvaluated(User userEvaluated) {
		this.userEvaluated = userEvaluated;
	}

	public String getPositivePoints() {
		return positivePoints;
	}

	public void setPositivePoints(String positivePoints) {
		this.positivePoints = positivePoints;
	}

	public String getPointsToImprove() {
		return pointsToImprove;
	}

	public void setPointsToImprove(String pointsToImprove) {
		this.pointsToImprove = pointsToImprove;
	}

	public String getNextGoals() {
		return nextGoals;
	}

	public void setNextGoals(String nextGoals) {
		this.nextGoals = nextGoals;
	}

	public String getStudySugestions() {
		return studySugestions;
	}

	public void setStudySugestions(String studySugestions) {
		this.studySugestions = studySugestions;
	}

	public String getIndications() {
		return indications;
	}

	public void setIndications(String indications) {
		this.indications = indications;
	}

	public String getTipsForDailyBehavior() {
		return tipsForDailyBehavior;
	}

	public void setTipsForDailyBehavior(String tipsForDailyBehavior) {
		this.tipsForDailyBehavior = tipsForDailyBehavior;
	}

	public String getActions() {
		return actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public String getWhatManagerCanDo() {
		return whatManagerCanDo;
	}

	public void setWhatManagerCanDo(String whatManagerCanDo) {
		this.whatManagerCanDo = whatManagerCanDo;
	}

}
