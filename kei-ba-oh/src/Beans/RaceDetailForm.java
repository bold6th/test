/*
 * レース詳細ページフォームクラス
 *
 * 2019.12.30 新規作成
 *
 */

package Beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class RaceDetailForm implements Serializable{

/*
 * レースコード
 */
	private String raceCode;
/*
 * レース名
 */
	private String raceName;
/*
 * レース場名
 */
	private String place;
/*
 * レース番号
 */
	private int racenum;
/*
 * グレード
 */
	private String grade;
/*
 * 発走時間
 */
	private LocalDateTime startTime;
/*
 * 出走数（計算で求める）
 */
	private int starters;
/*
 * コース
 *
 * 芝orダート
 */
	private String corse;
/*
 * 距離
 */
	private int distance;
/*
 * 回り方
 */
	private String direction;
/*
 * 天気
 *
 * 晴or曇or雨orその他
 */
	private String weather;
/*
 * 馬場状態
 */
	private String fieldCondition;
/*
 * 賞金
 */
	private String prize;
/*
 * ハンデ
 */
	private String handicap;
/*
 * 競走馬情報
 * めんどくさいからこいつはpublic
 */
	public ArrayList<Racehorse> horses;
/*
 * 払い戻し・オッズ情報
 */
	public OddsAndReturnForm orf;



	//以下、ゲッターおよびセッター
	public String getRaceCode() {
		return raceCode;
	}
	public String getRaceName() {
		return raceName;
	}
	public String getPlace() {
		return place;
	}
	public int getRacenum() {
		return racenum;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public int getStarters() {
		return starters;
	}
	public String getCorse() {
		return corse;
	}
	public int getDistance() {
		return distance;
	}
	public String getDirection() {
		return direction;
	}
	public String getWeather() {
		return weather;
	}
	public String getFieldCondition() {
		return fieldCondition;
	}
	public ArrayList<Racehorse> getHorses() {
		return horses;
	}
	public void setRaceCode(String raceCode) {
		this.raceCode = raceCode;
	}
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setRacenum(int racenum) {
		this.racenum = racenum;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public void setStarters(int starters) {
		this.starters = starters;
	}
	public void setCorse(String corse) {
		this.corse = corse;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public void setWeather(String weather) {
		if(weather == "晴" || weather == "曇" || weather == "雨" || weather == "その他") {
			this.weather = weather;
		}
	}
	public void setFieldCondition(String fieldCondition) {
		this.fieldCondition = fieldCondition;
	}
	public void setHorses(ArrayList<Racehorse> horses) {
		this.horses = horses;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getHandicap() {
		return handicap;
	}
	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}
	public OddsAndReturnForm getOrf() {
		return orf;
	}
	public void setOrf(OddsAndReturnForm orf) {
		this.orf = orf;
	}
}
