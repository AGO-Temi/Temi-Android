# Temi-Android

# 초기 규칙
[develop] 개발 <br>
[test/이름] 테스트 실행 <br>
[feature/이름] 기능개발 <br>

# Temi Size
13.3인치, 1920*1080

# Emulator 생성
기본 지급되는 Emul에서는 사이즈 맞는게 없으므로 Clone Device -> 왼쪽하단 New HardWare Profile<br> -> 사이즈 입력후 Finish<br>
Screen size : 13.3<br>
Resolution : 1920*1080 

# Temi build 연결 방법

curl -k "https://192.168.0.23.5556/grantAuth?pwd= {개발자 모드에 나오는 인증코드}"<br>
adb connect 192.168.0.23

# 에뮬레이터 실행이 안될때
오류는 안나고 applying filter가 계속 뜬다면<br>
temi sdk를 빼고 실행
