package Beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

//テストレコード
public class test implements Serializable{

	public RaceDetailForm getracedata1(){

		RaceDetailForm rdf = new RaceDetailForm();
		//DBから値を取得してオブジェクトにセットした体
		rdf.setRaceName("天皇賞（秋）");
		rdf.setRaceCode("A001_2019123_1");
		rdf.setRacenum(12);
		rdf.setDistance(2000);
		rdf.setDirection("左");
		rdf.setCorse("芝");
		rdf.setWeather("晴");
		rdf.setFieldCondition("良");
		rdf.setPlace("東京");
		rdf.setStartTime(LocalDateTime.of(2019, 10, 27, 15, 40, 00));
		rdf.setStarters(16);
		rdf.setHandicap("定量");
		rdf.setGrade("GI");
		rdf.setPrize("15000,6000,3800,2300,1500万円");

		rdf.horses = new ArrayList<Racehorse>();

		//競走馬情報1
		Racehorse horse1 = new Racehorse();
		horse1.setPlace(1);
		horse1.setFlame(6);
		horse1.setHorsenum(12);
		horse1.setHorseName("ヤマタケクララ");
		horse1.setAge("牝2");
		horse1.setLoaf(51.0);
		horse1.setJockeyName("菅原明");
		horse1.setTime("1:12.7");
		horse1.setDistance("");
		horse1.setPopular(1);
		horse1.setWinOdds(4.0);
		horse1.setLast3F("38.1");
		horse1.setPath("2-2");
		horse1.setProducingNAreaName("美浦");
		horse1.setTrainerName("矢野");
		horse1.setWeight(462);
		horse1.setWeightDif("+2");

		//競走馬情報2
		Racehorse horse2 = new Racehorse();
		horse2.setPlace(2);
		horse2.setFlame(5);
		horse2.setHorsenum(9);
		horse2.setHorseName("ダノンプレミアム");
		horse2.setAge("牡4");
		horse2.setLoaf(58.0);
		horse2.setJockeyName("川田");
		horse2.setTime("1:56.7");
		horse2.setDistance("3");
		horse2.setPopular(3);
		horse2.setWinOdds(9.5);
		horse2.setLast3F("34.5");
		horse2.setPath("5-5-3");
		horse2.setProducingNAreaName("栗東");
		horse2.setTrainerName("中内田");
		horse2.setWeight(508);
		horse2.setWeightDif("+4");

		Racehorse horse3 = new Racehorse();
		horse3.setPlace(3);
		horse3.setFlame(3);
		horse3.setHorsenum(5);
		horse3.setHorseName("アエロリット");
		horse3.setAge("牝5");
		horse3.setLoaf(56.0);
		horse3.setJockeyName("戸崎圭");
		horse3.setTime("1:56.7");
		horse3.setDistance("クビ");
		horse3.setPopular(6);
		horse3.setWinOdds(20.0);
		horse3.setLast3F("34.8");
		horse3.setPath("1-1-1");
		horse3.setProducingNAreaName("美浦");
		horse3.setTrainerName("菊沢");
		horse3.setWeight(516);
		horse3.setWeightDif("0");

		Racehorse horse4 = new Racehorse();
		horse4.setPlace(4);
		horse4.setFlame(3);
		horse4.setHorsenum(6);
		horse4.setHorseName("ユーキャンスマイル");
		horse4.setAge("牡4");
		horse4.setLoaf(58.0);
		horse4.setJockeyName("岩田康");
		horse4.setTime("1:56.8");
		horse4.setDistance("クビ");
		horse4.setPopular(7);
		horse4.setWinOdds(40.6);
		horse4.setLast3F("33.7");
		horse4.setPath("13-13-13");
		horse4.setProducingNAreaName("栗東");
		horse4.setTrainerName("友道");
		horse4.setWeight(488);
		horse4.setWeightDif("-8");

		rdf.horses.add(horse1);
		rdf.horses.add(horse2);
		rdf.horses.add(horse3);
		rdf.horses.add(horse4);

		return rdf;
	}

	public RaceDetailForm getracedata2(){

		RaceDetailForm rdf = new RaceDetailForm();
		//DBから値を取得してオブジェクトにセットした体
		rdf.setRaceName("天皇賞（春）");
		rdf.setRaceCode("A001_2019064_0");
		rdf.setRacenum(12);
		rdf.setDistance(2000);
		rdf.setDirection("左");
		rdf.setCorse("芝");
		rdf.setWeather("晴");
		rdf.setFieldCondition("良");
		rdf.setPlace("東京");
		rdf.setStartTime(LocalDateTime.of(2019, 10, 27, 15, 40, 00));
		rdf.setStarters(16);

		return rdf;
	}

	public RaceDetailForm getracedata3(){

		RaceDetailForm rdf = new RaceDetailForm();
		//DBから値を取得してオブジェクトにセットした体
		rdf.setRaceName("ホープフルステークス");
		rdf.setRaceCode("A001_2019053_0");
		rdf.setRacenum(12);
		rdf.setDistance(2000);
		rdf.setDirection("左");
		rdf.setCorse("芝");
		rdf.setWeather("晴");
		rdf.setFieldCondition("良");
		rdf.setPlace("東京");
		rdf.setStartTime(LocalDateTime.of(2019, 10, 27, 15, 40, 00));
		rdf.setStarters(16);


		return rdf;
	}

	//オッズのテストレコードを取得
	public OddsAndReturnForm getOdds(OddsAndReturnForm orf) {
		double[] winOdds = {126.0,1.6,257.8,19.1,20.0,145.1,53.0,9.5,3.4,406.1,296.2,150.9,18.7,148.9,67.9};
		double[][] fukuOdds = {
				{7.5,21.8},
				{1.1,1.1},
				{16.2,48.1},
				{2.0,5.0},
				{2.1,5.5},
				{3.3,9.1},
				{11.9,35.0},
				{6.6,19.0},
				{2.0,5.2},
				{1.2,2.1},
				{33.4,100.1},
				{18.3,54.4},
				{10.7,31.6},
				{2.3,6.0},
				{11.3,33.5},
				{5.5,15.8}
		};

		double[][] wakuOdds = {
				{72.1,10.5,7.5,28.2,2.2,84.7,10.6,28.2},
				{510.3,42.7,127.1,20.0,299.1,46.3,149.1},
				{152.9,106.1,14.4,202.0,37.6,97.4},
				{884.3,55.3,332.9,98.8,233.0},
				{20.0,156.5,18.9,48.9},
				{1563.3,376.6,413.6},
				{362.2,107.0},
				{582.7}
		};


		orf.setWinOdds(winOdds);
		orf.setFukuOdds(fukuOdds);
		orf.setWakuOdds(wakuOdds);

		return orf;
	}





}
