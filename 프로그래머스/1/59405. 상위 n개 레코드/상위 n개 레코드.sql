-- 코드를 입력하세요
SELECT name from ANIMAL_INS where DATETIME = (SELECT MIN(DATETIME) from ANIMAL_INS);