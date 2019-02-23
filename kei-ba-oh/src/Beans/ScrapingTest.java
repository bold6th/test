package Beans;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapingTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {

            //Document A = Jsoup.connect("url").get(); urlにスクレイピング対象
            Document doc = Jsoup.connect("https://race.netkeiba.com/race/result.html?race_id=202005010506").get();

            //Elements B = A.select("タグ"); この形でソースに含まれるタグで指定された範囲を書き出す。
            Elements elm = doc.select(".RaceData01");

            //拡張for文
            for(Element elms : elm) {
                String title = elms.text();
                System.out.println(title);//結果　Yahoo!JAPAN
            }

            //例外処理
        }catch(IOException e) {
            e.printStackTrace();
        }
    }


	}


