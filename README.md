# Temi-Android
키오스크 및 안내로봇을 개발합니다.<br>
AI 동아리 WITH강 & WITH권에서 제작하는 동아리 프로젝트입니다.

### Temi-Android
> **Temi SDK**를 개발하는 Repo 입니다.

<br>

### Commit Message
>커밋 메세지는 항상 중요하다고 생각하며 Git Flow를 사용합니다.

```
1. branch naming (git flow 협업방식을 사용합니다)  

2. 각자 브랜치에서 작업 후 develop으로 pr을 날립니다.   
(코드리뷰 필요 시 코드리뷰를 진행합니다.)
-> 팀원들이 코멘트를 달고 모두 동의 후 develop에 merge합니다.
master branch에 pr날리는 일은 없어야 합니다. (pr시 확인)

3. merge 후 자신의 브랜치는 자신이 삭제합니다.

4. 브랜치 규칙입니다.
  [develop] 개발
  [test/이름] 테스트 실행
  [feature/이름] 기능개발

5. 커밋메세지를 통일합나다.
    [CREATE] : 새로운 
    [ADD] : 기능 추가
    [UPDATE] : 기능 수정 또는 업데이트
    [FIX] : 에러 해결 및 수정(에러)
    [DELETE] : 코드 삭제
```

# Temi build 연결 방법
```
테미마다 다를 수 있음
curl "https://192.168.0.23:5556/grantAuth?pwd= {개발자 모드에 나오는 인증코드}"
adb connect 192.168.0.23
```
