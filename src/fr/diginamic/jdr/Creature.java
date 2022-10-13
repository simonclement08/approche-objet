package fr.diginamic.jdr;

public abstract class Creature extends Individu {
	private int reward;

	public int getReward() {
		return reward;
	}

	public void setReward(int reward) {
		this.reward = reward;
	}
}
