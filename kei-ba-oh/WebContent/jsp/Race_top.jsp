<!--
	トップ画面
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="ja">

<head>
<meta charset="UTF-8">
<title>競馬サイト</title>
<link href="/kei-ba-oh/jsp/Race_top.css" rel="stylesheet" type="text/css">

<%@ page import = "Beans.RaceDetailForm" %>

<script type="text/javascript">
$(function() {

    var arr = ["a", "b", "c", "d", "e"];

    $.each(arr, function(index, element) {
        $('.sample').append(index + ':' + element + '<br>');
    });

});
</script>

</head>

<body>

<h2>競☆馬☆王</h2>
<div class="tabs">
<!-- タブ START -->
	  <input id="races_tab" type="radio" name="tab_item" checked>
	  <label class="tab_item" for="races_tab">レース一覧</label>
	  <input id="weekendrace_tab" type="radio" name="tab_item">
	  <label class="tab_item" for="weekendrace_tab">今週末のレース</label>
	  <input id="free_search_tab" type="radio" name="tab_item">
	  <label class="tab_item" for="free_search_tab">フリー検索</label>
<!-- タブ END -->


<!-- レース一覧 START -->
	  <div class="tab_content" id="races_content">
		<div class="tab_content_description">
			<table>
				<tr>
					<td style="width:10em;">レースコード</td>
					<td style="width:10em;">発走時刻</td>
					<td style="width:6em;">レース番号</td>
					<td style="width:10em;">レース名</td>
					<td style="width:5em;">コース</td>
					<td>出走数</td>
				</tr>

				<c:forEach items="${raceinfo}" var="records" end = "25">
				<tr class="recordtable">
					<td><a href="http://localhost:8080/kei-ba-oh/RaceDetail?rdf=${records.raceCode}"/>${records.raceCode}</a></td>
					<td><c:out value="${records.startTime}"/></td>
					<td>
						<c:out value="${records.place}"/>
						<c:out value="${records.racenum}"/>R
					</td>
					<td><c:out value="${records.raceName}"/></td>
					<td>
						<c:out value="${records.corse}"/>
						<c:out value="${records.distance}"/>
					</td>
					<td><c:out value="${records.starters}"/>頭立て</td>
				</tr>
				</c:forEach>
			</table>
	    </div>
	  </div>
<!-- レース一覧 END -->

<!-- 今週末のレース START -->
	  <div class="tab_content" id="weekendrace_content">
	    <div class="tab_content_description">
	      <p>コメント：今週末のレースの情報、予想を表示する。</p>
	    </div>
	  </div>
<!-- 今週末のレース END -->

<!-- フリー検索 START -->
	  <div class="tab_content" id="free_search_content">
	    <div class="tab_content_description">
	<!-- 検索ボックス -->
		<form id="form2" action="/keiba/RaceTop_Servlet" method="get">
			<input id="sbox2"  id="s" name="s" type="text" placeholder="フリーワードを入力"/>
			<button type="submit" id="sbtn2"><i class="fas fa-search"></i></button>
		</form>

	    </div>
	  </div>
<!-- フリー検索 END -->

	</div>
</body>
</html>