# SpringBoot Mybatis Mysql or Oracle

Spring 에서는 Mybatis 연동을 해봤지만 Boot에서는 어떻게 하는지 몰라서

열심히 구글링을 해봤다. 그러나 각 포스트 마다 방법이 다 달랐음.

그래서 그냥 내가 편한 방법으로 가장 기초적인 세팅을 했다.

## 01 프로젝트 의존성

<img width="672" alt="의존성" src="https://user-images.githubusercontent.com/87923533/162412672-ff94c110-80be-4922-afe7-8bac4617df73.png">

가장 기본적인 의존성만 추가하여 Boot프로젝트를 생성했다.

(Mysql과 Oracle 둘다 일단 넣어둠)
<br><br>

## 02 데이터베이스

<img width="210" alt="데이터베이스" src="https://user-images.githubusercontent.com/87923533/162412827-672c705c-2a44-40fb-b1a8-0e57c5b0106f.png">

중요한건 연결 성공이므로..
<br><br>
  

## 03 폴더구조
<img width="284" alt="폴더구조" src="https://user-images.githubusercontent.com/87923533/162412893-1c8a70d5-f88c-4b27-ad48-d0ea2d6fe86f.png">

어떻게 만들어야할지 몰라서 우선 내가 편한대로 만들어봄
<br><br>

## 04 application.properties
<img width="572" alt="application.properties" src="https://user-images.githubusercontent.com/87923533/162412949-49d54bed-0c4a-4d61-9cc8-e64213aee539.png">

datasource를 설정하고 mapper 위치를 지정해준다. aliases는 resultType를 간략하게 쓸수있게 해준다.
<br><br>

## 05 DTO

<img width="223" alt="dto" src="https://user-images.githubusercontent.com/87923533/162413100-39c112f3-b04a-4882-8feb-28608cb6da74.png">

ㅎ..
<br><br>

## 06 Mapper

<img width="297" alt="mapperI" src="https://user-images.githubusercontent.com/87923533/162413141-d27e9481-488c-4c40-af88-f6615a4016fa.png">

@Mapper 붙여주면 sqlSessionTemplate인가 그거 안만들어도 알아서 해쥼

Mybatis 3.4.0 이상이었나부터 사용 가능
<br><br>

## 07 Service

<img width="314" alt="service" src="https://user-images.githubusercontent.com/87923533/162413216-8c04266c-a7a5-453a-a105-42d4931e4d06.png">
<br><br>

## 08 Mapper.xml

<img width="668" alt="mapper" src="https://user-images.githubusercontent.com/87923533/162413272-d6327587-e683-477d-8beb-495bedab1f83.png">
<br><br>

## 09 테스트성공

<img width="451" alt="테스트코드" src="https://user-images.githubusercontent.com/87923533/162413318-12c6325d-a634-46d8-95e4-b3b9c6a5a4b1.png">
