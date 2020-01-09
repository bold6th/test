/*
 * データベースからの値の取得・データベースへの値の挿入を行う
 */

package Beans;

public class DAO {

	/*
	 * レース一覧ページに表示する値を取得します。
	 * param:page 現在のページを表す。
	 */

	public void getPrev(int page) {

	}



	//レース結果から払い戻しテーブルに表示する要素を求めます。
	public RaceDetailForm getReturnAndOdds(RaceDetailForm rdf) {
		OddsAndReturnForm orf = new OddsAndReturnForm();

		//1着から3着までの競走馬の馬番・枠番・単勝人気を取得する。
		for(Racehorse rh:rdf.horses) {
			if(rh.getPlace() == 1) {
				orf.setFirstHorsenum(rh.getHorsenum());
				orf.setFirstPopular(rh.getPopular());
				orf.setFirstHorseflame(rh.getFlame());
			}
			if(rh.getPlace() == 2) {
				orf.setSecondHorsenum(rh.getHorsenum());
				orf.setSecondPopular(rh.getPopular());
				orf.setSecondHorseflame(rh.getFlame());
			}
			if(rh.getPlace() == 3) {
				orf.setThirdHorsenum(rh.getHorsenum());
				orf.setThirdPopular(rh.getPopular());
				orf.setThirdHorseflame(rh.getFlame());
			}
		}

		//単勝オッズを取得する。




		//オッズ情報を取得する。
		//SELECTで取得した体

		rdf.setOrf(orf);

		return rdf;
	}







}
