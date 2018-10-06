chcp 1251
md target
javac -encoding utf8 -d target -sourcepath src src/by/itacademy/Main.java
java -cp target by.itacademy.Main
pause
