# Lab1_regex
Aufgabe. Es wird ein Quellprogramm gegeben (Beispiel auf der nachsten Seite). Verlangt wird ein ¨
Programm (C++ oder Java oder Python . . . ) der
1. die Kommentare entfernt
2. den Wortern die syntaktische Kategorie angeh ¨ angt: ¨
• Schlusselw ¨ orter (keywords) ¨
• Identifikatoren (identifiers)
• Gleitkommazahlen (floats)
• ganze Zahlen (integers)
• Zeichen fur die man keine Kategorie erstellt hat geh ¨ oren zu der Kategorie ‘Unbekannt’. ¨
Fur die Aufgabe wird man eine Bibliothek f ¨ ur regul ¨ are Ausdr ¨ ucke verwenden wollen. Der Output ¨
soll folgende Form haben:
Ka te g o r ie1 Wort1
Ka te g o r ie3 Wort2
Ka te g o r ie1 Wort3
. . .


Input.
// t h i s example was taken from h t tp s : / / en . w ik iped ia . org / w ik i /PL/0
VAR x , squ ;
PROCEDURE square ;
BEGIN
squ := x * x
END;
BEGIN
// some dummy v a r i a b l e s f o r t e s t i n g
dummy1 := 9 9;
dummy2 := 100;
x := 0 . 1 ;
WHILE x <= 10 DO
BEGIN
CALL square ;
! squ ;
x := x + 1. 1
END
END
.
