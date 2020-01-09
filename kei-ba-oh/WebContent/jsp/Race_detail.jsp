<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/kei-ba-oh/jsp/Race_detail.css" rel="stylesheet" type="text/css">
<title>レース詳細-${raceinfo.raceName}</title>
</head>
<body>
	<h2 style="font:normal;">${raceinfo.place}${raceinfo.racenum}R　${raceinfo.raceName}</h2>

	<div class="center">
<!-- レース情報 -->
		<div class="text-left">
			レースコード：${raceinfo.raceCode}<br>
			発走時刻：${raceinfo.startTime}<br>
			グレード：${raceinfo.grade}<br>
			ハンデ：${raceinfo.handicap}<br>
			賞金：${raceinfo.prize}
		</div>
		<div class="text-right">
			出走数：${raceinfo.starters}<br>
			コース：${raceinfo.corse} ${raceinfo.distance}m　${raceinfo.direction}回り<br>
			馬場状態：${raceinfo.fieldCondition}<br>
			天気：${raceinfo.weather}
		</div>

<!-- レース結果テーブル -->
		<table>
			<tr>
				<th>着順</th>
				<th>枠番</th>
				<th>馬番</th>
				<th>馬名</th>
				<th>性齢</th>
				<th>負担重量</th>
				<th>騎手</th>
				<th>タイム</th>
				<th>着差</th>
				<th>人気</th>
				<th>単勝オッズ</th>
				<th>後3F</th>
				<th>コーナー通過順</th>
				<th>厩舎(調教師)</th>
				<th>馬体重</th>
			</tr>
			<c:forEach items="${raceinfo.horses}" var="records">
				<tr>
					<td>${records.place}</td>
					<td>${records.flame}</td>
					<td>${records.horsenum}</td>
					<td><a href="" >${records.horseName}</a></td>
					<td>${records.age}</td>
					<td>${records.loaf}</td>
					<td><a href="" >${records.jockeyName}</a></td>
					<td>${records.time}</td>
					<td>${records.distance}</td>
					<td>${records.popular}</td>
					<td>${records.winOdds}</td>
					<td>${records.last3F}</td>
					<td>${records.path}</td>
					<td>(${records.producingNAreaName})<a href="" >${records.trainerName}</a></td>
					<td>${records.weight}(${records.weightDif})</td>
				</tr>
			</c:forEach>
		</table>
<!-- 払戻金 -->
		<h4>払い戻し</h4>
		<table class="return" align="left">
			<tr>
				<th style="width:40px;">単勝</th>
				<td>${raceinfo.orf.firstHorsenum}</td>
				<td>${raceinfo.orf.tanReturn}円</td>
				<td>${raceinfo.orf.firstPopular}人気</td>
			</tr>
			<tr style="height:60px;">
				<th>複勝</th>
				<td>
					${raceinfo.orf.firstHorsenum}<br>
					${raceinfo.orf.secondHorsenum}<br>
					${raceinfo.orf.thirdHorsenum}
				</td>
				<td>
					${raceinfo.orf.fukuReturn1}円<br>
					${raceinfo.orf.fukuReturn2}円<br>
					${raceinfo.orf.fukuReturn3}円
				</td>
				<td>
					${raceinfo.orf.fukuPopular1}人気<br>
					${raceinfo.orf.fukuPopular2}人気<br>
					${raceinfo.orf.fukuPopular3}人気
				</td>
			</tr>
			<tr>
				<th>枠連</th>
				<td>${raceinfo.orf.firstHorseflame}-${raceinfo.orf.secondHorseflame}</td>
				<td>${raceinfo.orf.wakuReturn}円</td>
				<td>${raceinfo.orf.wakuPopular}人気</td>
			</tr>
			<tr>
				<th>馬連</th>
				<td>${raceinfo.orf.firstHorsenum}-${raceinfo.orf.secondHorsenum}</td>
				<td>${raceinfo.orf.umarenReturn}円</td>
				<td>${raceinfo.orf.umarenPopular}人気</td>
			</tr>
		</table>
		<table class="return" align="left">
			<tr>
				<th style="height:60px; width:40px;">ワイド</th>
				<td>
					${raceinfo.orf.firstHorsenum}-${raceinfo.orf.secondHorsenum}<br>
					${raceinfo.orf.firstHorsenum}-${raceinfo.orf.thirdHorsenum}<br>
					${raceinfo.orf.secondHorsenum}-${raceinfo.orf.thirdHorsenum}
				</td>
				<td>
					${raceinfo.orf.wideReturn1}円<br>
					${raceinfo.orf.wideReturn2}円<br>
					${raceinfo.orf.wideReturn3}円
				</td>
				<td>
					${raceinfo.orf.widePopular1}人気<br>
					${raceinfo.orf.widePopular2}人気<br>
					${raceinfo.orf.widePopular3}人気
				</td>
			</tr>
			<tr>
				<th>馬単</th>
				<td>${raceinfo.orf.firstHorsenum}→${raceinfo.orf.secondHorsenum}</td>
				<td>${raceinfo.orf.umatanReturn}円</td>
				<td>${raceinfo.orf.umatanPopular}人気</td>
			</tr>
			<tr>
				<th>三連複</th>
				<td>${raceinfo.orf.firstHorsenum}-${raceinfo.orf.secondHorsenum}-${raceinfo.orf.thirdHorsenum}</td>
				<td>${raceinfo.orf.sanrenpukuReturn}円</td>
				<td>${raceinfo.orf.sanrenpukuPopular}人気</td>
			</tr>
			<tr>
				<th>三連単</th>
				<td>${raceinfo.orf.firstHorsenum}→${raceinfo.orf.secondHorsenum}→${raceinfo.orf.thirdHorsenum}</td>
				<td>${raceinfo.orf.sanrentanReturn}円</td>
				<td>${raceinfo.orf.sanrentanPopular}人気</td>
			</tr>
		</table>
	</div>


<!-- オッズ -->


















</body>
</html>