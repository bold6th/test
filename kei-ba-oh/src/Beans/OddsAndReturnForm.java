package Beans;

import java.io.Serializable;

public class OddsAndReturnForm implements Serializable{

/*
 * 1着馬番
 */
	private int firstHorsenum;
/*
 * 1着枠番
 */
	private int firstHorseflame;
/*
 * 1着人気
 */
	private int firstPopular;
/*
 * 2着馬番
 */
	private int secondHorsenum;
/*
 * 2着枠番
 */
	private int secondHorseflame;
/*
 * 2着人気
 */
	private int secondPopular;
/*
 * 3着馬番
 */
	private int thirdHorsenum;
/*
 * 3着枠番
 */
	private int thirdHorseflame;
/*
 * 3着人気
 */
	private int thirdPopular;
/*
 * 単勝払戻金
 */
	private String tanReturn;
/*
 * 複勝払戻金1
 */
	private String fukuReturn1;
/*
 * 複勝払戻金2
 */
	private String fukuReturn2;
/*
 * 複勝払戻金3
 */
	private String fukuReturn3;
/*
 * 複勝人気1
 */
	private String fukuPopular1;
/*
 * 複勝人気2
 */
	private String fukuPopular2;
/*
 * 複勝人気3
 */
	private String fukuPopular3;
/*
 * 枠連払戻金
 */
	private String wakuReturn;
/*
 * 枠連人気
 */
	private String wakuPopular;
/*
 * 馬連払戻金
 */
	private String umarenReturn;
/*
 * 馬連人気
 */
	private String umarenPopular;
/*
 * ワイド払戻金1
 */
	private String wideReturn1;
/*
 * ワイド払戻金2
 */
	private String wideReturn2;
/*
 * ワイド払戻金3
 */
	private String wideReturn3;
/*
 * ワイド人気1
 */
	private String widePopular1;
/*
 * ワイド人気2
 */
	private String widePopular2;
/*
 * ワイド人気3
 */
	private String widePopular3;
/*
 * 馬単払戻金
 */
	private String umatanReturn;
/*
 * 馬単人気
 */
	private String umatanPopular;
/*
 * 三連複払戻金
 */
	private String sanrenpukuReturn;
/*
 * 三連複人気
 */
	private String sanrenpukuPopular;
/*
 * 三連単払戻金
 */
	private String sanrentanReturn;
/*
 * 三連単人気
 */
	private String sanrentanPopular;
/*
 * 単勝オッズ
 */
	public double[] winOdds;
/*
 * 複勝オッズ
 */
	public double[][] fukuOdds;
/*
 * 枠連オッズ
 */
	public double[][] wakuOdds;
/*
 * 馬連オッズ
 */
	public double[][] umarenOdds;
/*
 * ワイドオッズ
 */
	public double[][] wideOdds;
/*
 * 馬単オッズ
 */
	public double[][] umatanOdds;
/*
 * 三連複オッズ
 */
	public double[][][] sanrenpukuOdds;
/*
 * 三連単オッズ
 */
	public double[][][] sanrentanOdds;


//以下、ゲッターおよびセッター
	public int getFirstHorsenum() {
		return firstHorsenum;
	}
	public int getFirstPopular() {
		return firstPopular;
	}
	public int getSecondHorsenum() {
		return secondHorsenum;
	}
	public int getSecondPopular() {
		return secondPopular;
	}
	public int getThirdHorsenum() {
		return thirdHorsenum;
	}
	public int getThirdPopular() {
		return thirdPopular;
	}
	public String getTanReturn() {
		return tanReturn;
	}
	public String getFukuReturn1() {
		return fukuReturn1;
	}
	public String getFukuReturn2() {
		return fukuReturn2;
	}
	public String getFukuReturn3() {
		return fukuReturn3;
	}
	public String getWakuReturn() {
		return wakuReturn;
	}
	public String getUmarenReturn() {
		return umarenReturn;
	}
	public String getWideReturn1() {
		return wideReturn1;
	}
	public String getWideReturn2() {
		return wideReturn2;
	}
	public String getWideReturn3() {
		return wideReturn3;
	}
	public String getSanrenpukuReturn() {
		return sanrenpukuReturn;
	}
	public String getSanrentanReturn() {
		return sanrentanReturn;
	}
	public double[][] getFukuOdds() {
		return fukuOdds;
	}
	public double[][] getWakuOdds() {
		return wakuOdds;
	}
	public double[][] getUmarenOdds() {
		return umarenOdds;
	}
	public double[][] getWideOdds() {
		return wideOdds;
	}
	public double[][] getUmatanOdds() {
		return umatanOdds;
	}
	public double[][][] getSanrenpukuOdds() {
		return sanrenpukuOdds;
	}
	public double[][][] getSanrentanOdds() {
		return sanrentanOdds;
	}
	public void setFirstHorsenum(int firstHorsenum) {
		this.firstHorsenum = firstHorsenum;
	}
	public void setFirstPopular(int firstPopular) {
		this.firstPopular = firstPopular;
	}
	public void setSecondHorsenum(int secondHorsenum) {
		this.secondHorsenum = secondHorsenum;
	}
	public void setSecondPopular(int secondPopular) {
		this.secondPopular = secondPopular;
	}
	public void setThirdHorsenum(int thirdHorsenum) {
		this.thirdHorsenum = thirdHorsenum;
	}
	public void setThirdPopular(int thirdPopular) {
		this.thirdPopular = thirdPopular;
	}
	public void setTanReturn(String tanReturn) {
		this.tanReturn = tanReturn;
	}
	public void setFukuReturn1(String fukuReturn1) {
		this.fukuReturn1 = fukuReturn1;
	}
	public void setFukuReturn2(String fukuReturn2) {
		this.fukuReturn2 = fukuReturn2;
	}
	public void setFukuReturn3(String fukuReturn3) {
		this.fukuReturn3 = fukuReturn3;
	}
	public void setWakuReturn(String wakuReturn) {
		this.wakuReturn = wakuReturn;
	}
	public void setUmarenReturn(String umarenReturn) {
		this.umarenReturn = umarenReturn;
	}
	public void setWideReturn1(String wideReturn1) {
		this.wideReturn1 = wideReturn1;
	}
	public void setWideReturn2(String wideReturn2) {
		this.wideReturn2 = wideReturn2;
	}
	public void setWideReturn3(String wideReturn3) {
		this.wideReturn3 = wideReturn3;
	}
	public void setSanrenpukuReturn(String sanrenpukuReturn) {
		this.sanrenpukuReturn = sanrenpukuReturn;
	}
	public void setSanrentanReturn(String sanrentanReturn) {
		this.sanrentanReturn = sanrentanReturn;
	}
	public void setFukuOdds(double[][] fukuOdds) {
		this.fukuOdds = fukuOdds;
	}
	public void setWakuOdds(double[][] wakuOdds) {
		this.wakuOdds = wakuOdds;
	}
	public void setUmarenOdds(double[][] umarenOdds) {
		this.umarenOdds = umarenOdds;
	}
	public void setWideOdds(double[][] wideOdds) {
		this.wideOdds = wideOdds;
	}
	public void setUmatanOdds(double[][] umatanOdds) {
		this.umatanOdds = umatanOdds;
	}
	public void setSanrenpukuOdds(double[][][] sanrenpukuOdds) {
		this.sanrenpukuOdds = sanrenpukuOdds;
	}
	public void setSanrentanOdds(double[][][] sanrentanOdds) {
		this.sanrentanOdds = sanrentanOdds;
	}
	public int getFirstHorseflame() {
		return firstHorseflame;
	}
	public int getSecondHorseflame() {
		return secondHorseflame;
	}
	public int getThirdHorseflame() {
		return thirdHorseflame;
	}
	public void setFirstHorseflame(int firstHorseflame) {
		this.firstHorseflame = firstHorseflame;
	}
	public void setSecondHorseflame(int secondHorseflame) {
		this.secondHorseflame = secondHorseflame;
	}
	public void setThirdHorseflame(int thirdHorseflame) {
		this.thirdHorseflame = thirdHorseflame;
	}
	public String getFukuPopular1() {
		return fukuPopular1;
	}
	public String getFukuPopular2() {
		return fukuPopular2;
	}
	public String getFukuPopular3() {
		return fukuPopular3;
	}
	public String getWakuPopular() {
		return wakuPopular;
	}
	public String getUmarenPopular() {
		return umarenPopular;
	}
	public String getWidePopular1() {
		return widePopular1;
	}
	public String getWidePopular2() {
		return widePopular2;
	}
	public String getWidePopular3() {
		return widePopular3;
	}
	public String getSanrenpukuPopular() {
		return sanrenpukuPopular;
	}
	public String getSanrentanPopular() {
		return sanrentanPopular;
	}
	public void setFukuPopular1(String fukuPopular1) {
		this.fukuPopular1 = fukuPopular1;
	}
	public void setFukuPopular2(String fukuPopular2) {
		this.fukuPopular2 = fukuPopular2;
	}
	public void setFukuPopular3(String fukuPopular3) {
		this.fukuPopular3 = fukuPopular3;
	}
	public void setWakuPopular(String wakuPopular) {
		this.wakuPopular = wakuPopular;
	}
	public void setUmarenPopular(String umarenPopular) {
		this.umarenPopular = umarenPopular;
	}
	public void setWidePopular1(String widePopular1) {
		this.widePopular1 = widePopular1;
	}
	public void setWidePopular2(String widePopular2) {
		this.widePopular2 = widePopular2;
	}
	public void setWidePopular3(String widePopular3) {
		this.widePopular3 = widePopular3;
	}
	public void setSanrenpukuPopular(String sanrenpukuPopular) {
		this.sanrenpukuPopular = sanrenpukuPopular;
	}
	public void setSanrentanPopular(String sanrentanPopular) {
		this.sanrentanPopular = sanrentanPopular;
	}
	public String getUmatanReturn() {
		return umatanReturn;
	}
	public String getUmatanPopular() {
		return umatanPopular;
	}
	public void setUmatanReturn(String umatanReturn) {
		this.umatanReturn = umatanReturn;
	}
	public void setUmatanPopular(String umatanPopular) {
		this.umatanPopular = umatanPopular;
	}
	public double[] getWinOdds() {
		return winOdds;
	}
	public void setWinOdds(double[] winOdds) {
		this.winOdds = winOdds;
	}


}
