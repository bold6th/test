package Beans;
import java.io.IOException;
import java.io.Serializable;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraping implements Serializable{

	public RaceDetailForm doScraping (RaceDetailForm rdf,String url){
		try {
			//スクレイピング実行
            Document doc = Jsoup.connect(url).get();

            System.out.println("サイト接続はいけた");
            Elements elm = doc.select("td");

            //spanタグから出走数の情報を抜く
            Elements span = doc.select("span");
            int starters = 0;

            for(Element s:span) {
            	if(s.text().endsWith("頭")) {
            		starters = Integer.parseInt(s.text().replace("頭",""));
            	}
            }

            //競走馬情報一頭分が15行である前提でデータを切り分ける
            int cnt = 0;
            int records = 0;
            Racehorse rh = new Racehorse();
            for(Element e:elm) {
            	if(records < starters) {
            		switch(cnt) {
            		//着順
            		case 0:
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
            	}
            }

        //例外処理
        }catch(IOException e) {
            e.printStackTrace();
        }
		return rdf;
    }
}
