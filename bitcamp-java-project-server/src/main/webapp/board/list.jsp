<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>프로젝트목록</title></head>
<body>
<h1>프로젝트 목록</h1>
<a href='form'>새 프로젝트</a><br>
<table border='1'>
<thead><tr><th>번호</th><th>프로젝트명</th><th>시작일 ~ 종료일</th><th>관리자</th><th>팀원</th></tr></thead>
<tbody>
<tr><td>7</td><td><a href='detail?no=7'>123</a></td><td>2020-11-01 ~ 2020-11-30</td><td>test</td><td>yuaram,abc</td></tr>
<tr><td>6</td><td><a href='detail?no=6'>java22tt</a></td><td>2020-01-01 ~ 2020-03-03</td><td>xxx</td><td>ccc,ddd,test,yuaram</td></tr>
<tr><td>5</td><td><a href='detail?no=5'>aram</a></td><td>2020-12-12 ~ 2020-01-01</td><td>xxx</td><td>aaa</td></tr>
<tr><td>4</td><td><a href='detail?no=4'>ohora</a></td><td>2020-01-01 ~ 2020-03-03</td><td>xxx</td><td>aaa,bbb,ccc,ddd,eee</td></tr>
</tbody>
</table>
<p>
<form action='list' method='get'>
검색어: <input type='text' name='keyword' value=''>
<button>검색</button>
</form>
</p>
<hr>
<h2>상세 검색</h2>
<p>
<form action='list' method='get'>
프로젝트명: <input type='text' name='keywordTitle' value=''><br>
관리자: <input type='text' name='keywordOwner' value=''><br>
멤버: <input type='text' name='keywordMember' value=''><br>
<button>검색</button>
</form>
</p>
</body>
</html>