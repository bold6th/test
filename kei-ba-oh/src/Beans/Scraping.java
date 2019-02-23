package Beans;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class Scraping implements Serializable{

	public static void main(String args[]) {

//	public RaceDetailForm doScraping (RaceDetailForm rdf,String url){
		try {
			//情報を登録するフォームインスタンス
			RaceDetailForm rdf = new RaceDetailForm();
			//競走馬情報を登録するクラス
			rdf.horses = new ArrayList<Racehorse>();

			//スクレイピング実行
            Document doc = Jsoup.connect("https://race.netkeiba.com/race/result.html?race_id=202005010506").get();

            //レース情報抜き取り用
            Elements elm1 = doc.select(".RaceData01");
            //競走馬情報抜き取り用
            Elements elm2 = doc.select("td");

/*レース情報を抜く*/
            String[] raceInfo = new String[4];
            for(Element e:elm1) {
            	raceInfo = e.text().split(" / ");
            	//デバッグ
            	for(String s:raceInfo) {
            		System.out.println("レース情報：" + s);
            	}
            }
            //発走時間
            //rdf.setStartTime(raceInfo[0]);


            Pattern p = Pattern.compile("[0-9]+");


            //コース情報・距離・回り
            if(raceInfo[1].contains("芝")) {
            	//コース情報
            	rdf.setCorse("芝");
            }
            if(raceInfo[1].contains("ダート")) {
            	rdf.setCorse("ダート");
            }
            System.out.println(rdf.getCorse());

            //距離（数字部分のみを抽出してセット
        	Matcher m = p.matcher(raceInfo[1]);
        	String wks = "";
        	while (m.find()) {
                wks += m.group();
            }
        	rdf.setDistance(Integer.parseInt(wks));
        	System.out.println(rdf.getDistance());

        	//回り
        	if(raceInfo[1].contains("右")) {
        		rdf.setDirection("右");
        	}
        	if(raceInfo[1].contains("左")) {
        		rdf.setDirection("左");
        	}
        	System.out.println(rdf.getDirection());
        	//天候
        	for(int i = 0;i < raceInfo[2].length();i++) {
        		if(raceInfo[2].substring(i,i+1) == "：") {
        			rdf.setWeather(raceInfo[2].substring(i+1));
        		}
        	}
        	System.out.println(rdf.getWeather());




/*競走馬情報を抜く*/
            //spanタグから出走数の情報を抜く
            Elements span = doc.select("span");
            int starters = 0;
            for(Element s:span) {
            	if(s.text().endsWith("頭")) {
            		starters = Integer.parseInt(s.text().replace("頭",""));
            	}
            }
            System.out.println(starters + "頭立て");

            //競走馬情報一頭分が15列である前提でデータを切り分ける
            //項目管理用変数
            int cnt = 0;
            //レコード件数管理用変数
            int records = 0;
            Racehorse rh = new Racehorse();
            for(Element e:elm2) {
            	if(records < starters) {
            		switch(cnt) {
            		//着順
            		case 0:
            			System.out.println("着順：" + Integer.parseInt(e.text()));
            			rh.setPlace(Integer.parseInt(e.text()));
            			break;
            		//枠番
            		case 1:
            			rh.setFlame(Integer.parseInt(e.text()));
            			break;
            		//馬番
            		case 2:
            			rh.setHorsenum(Integer.parseInt(e.text()));
            			break;
            		//競走馬名
            		case 3:
            			rh.setHorseName(e.text());
            			break;
            		//性齢
            		case 4:
            			rh.setAge(e.text());
            			break;
            		//斤量
            		case 5:
            			rh.setLoaf(Double.parseDouble(e.text()));
            			break;
            		//騎手
            		case 6:
            			rh.setJockeyName(e.text());
            			//騎手コードを求める処理を加える事。
            			break;
            		//タイム
            		case 7:
            			rh.setTime(e.text());
            			break;
            		//着差
            		case 8:
            			rh.setDistance(e.text());
            			break;
            		//人気
            		case 9:
            			rh.setPopular(Integer.parseInt(e.text()));
            			break;
            		//単勝オッズ
            		case 10:
            			rh.setWinOdds(Double.parseDouble(e.text()));
            			break;
            		//後3F
            		case 11:
            			rh.setLast3F(e.text());
            			break;
            		//コーナー通過順
            		case 12:
            			rh.setPath(e.text());
            			break;
            		//厩舎
            		case 13:
            			rh.setStables(e.text());
            			break;
            		//馬体重
            		case 14:
            			rh.setWeight(Integer.parseInt(e.text().substring(0, 3)));
            			rdf.horses.add(rh);
            			rh = new Racehorse();
            			records++;
            			break;
            		}
            		cnt++;
            		if(cnt == 15) cnt = 0;
            	}
            }


            //デバッグ用
            System.out.println("こっから馬ごとのデータ");
            for(Racehorse horses:rdf.horses) {
        		System.out.println("着順：" + horses.getPlace());
        		System.out.println("枠番：" + horses.getFlame());
        		System.out.println("馬番：" + horses.getHorsenum());
        		System.out.println("競走馬名：" + horses.getHorseName());
        		System.out.println("性齢：" + horses.getAge());
        		System.out.println("斤量：" + horses.getLoaf());
        		System.out.println("騎手：" + horses.getJockeyName());
        		System.out.println("タイム：" + horses.getTime());
        		System.out.println("騎手：" + horses.getJockeyName());
        		System.out.println("着差：" + horses.getDistance());
        		System.out.println("人気：" + horses.getPopular());
        		System.out.println("単勝オッズ：" + horses.getWinOdds());
        		System.out.println("後3F：" + horses.getLast3F());
        		System.out.println("コーナー通過順：" + horses.getPath());
        		System.out.println("厩舎：" + horses.getStables());
        		System.out.println("馬体重：" + horses.getWeight());

        	}

        //例外処理
        }catch(IOException e) {
            e.printStackTrace();
        }
		//return rdf;
    }
}

