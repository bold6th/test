/*
 * 出走馬ごとに値が存在する項目を保持。
 */
package Beans;

public class Racehorse{
/*
 * 馬コード
 */
	private String HorseCode;
/*
 * 競走馬名
 */
	private String horseName;
/*
 * 属性フラグ
 *
 * 0:国産中央馬
 * 1:地方馬
 * 2:外国馬
 */
	private int classification;
/*
 * 着順
 */
	private int place;
/*
 * タイム
 */
	private String time;
/*
 * 着差
 */
	private String distance;
/*
 * 斤量
 */
	private double loaf;
/*
 * 騎手コード
 */
	private String jockeyCode;
/*
 * 騎手名
 */
	private String jockeyName;
/*
 * 枠番
 */
	private int flame;
/*
 * 馬番
 */
	private int horsenum;
/*
 * 性齢
 */
	private String age;
/*
 * 馬体重
 */
	private int weight;
/*
 * 体重差
 */
	private String weightDif;
/*
 * 通過
 */
	private String path;
/*
 * 人気順
 */
	private int popular;
/*
 * 単勝オッズ
 */
	private double winOdds;
/*
 * 後半3F
 */
	private String last3F;
/*
 * 調教師コード
 */
	private String trainerCode;
/*
 * 調教師名
 */
	private String trainerName;
/*
 * 馬主コード
 */
	private String ownerCode;
/*
 * 生産者コード
 */
	private String producerCode;
/*
 * 生産地名
 */
	private String producingNAreaName;
/*
 * 厩舎
 */
	private String stables;


	public String getHorseCode() {
		return HorseCode;
	}
	public String getHorseName() {
		return horseName;
	}
	public int getClassification() {
		return classification;
	}
	public int getPlace() {
		return place;
	}
	public String getTime() {
		return time;
	}
	public String getDistance() {
		return distance;
	}
	public String getJockeyCode() {
		return jockeyCode;
	}
	public String getJockeyName() {
		return jockeyName;
	}
	public int getFlame() {
		return flame;
	}
	public int getHorsenum() {
		return horsenum;
	}
	public String getAge() {
		return age;
	}
	public int getWeight() {
		return weight;
	}
	public String getWeightDif() {
		return weightDif;
	}
	public String getPath() {
		return path;
	}
	public int getPopular() {
		return popular;
	}
	public double getWinOdds() {
		return winOdds;
	}
	public String getLast3F() {
		return last3F;
	}
	public String getTrainerCode() {
		return trainerCode;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public String getOwnerCode() {
		return ownerCode;
	}
	public String getProducerCode() {
		return producerCode;
	}
	public String getProducingNAreaName() {
		return producingNAreaName;
	}
	public void setHorseCode(String horseCode) {
		HorseCode = horseCode;
	}
	public void setHorseName(String horseName) {
		this.horseName = horseName;
	}
	public void setClassification(int classification) {
		this.classification = classification;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public void setJockeyCode(String jockeyCode) {
		this.jockeyCode = jockeyCode;
	}
	public void setJockeyName(String jockeyName) {
		this.jockeyName = jockeyName;
	}
	public void setFlame(int flame) {
		this.flame = flame;
	}
	public void setHorsenum(int horsenum) {
		this.horsenum = horsenum;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setWeightDif(String weightDif) {
		this.weightDif = weightDif;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public void setPopular(int popular) {
		this.popular = popular;
	}
	public void setWinOdds(double winOdds) {
		this.winOdds = winOdds;
	}
	public void setLast3F(String last3f) {
		last3F = last3f;
	}
	public void setTrainerCode(String trainerCode) {
		this.trainerCode = trainerCode;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public void setProducerCode(String producerCode) {
		this.producerCode = producerCode;
	}
	public void setProducingNAreaName(String producingNAreaName) {
		this.producingNAreaName = producingNAreaName;
	}
	public double getLoaf() {
		return loaf;
	}
	public void setLoaf(double loaf) {
		this.loaf = loaf;
	}
	public String getStables() {
		return stables;
	}
	public void setStables(String stables) {
		this.stables = stables;
	}


}

