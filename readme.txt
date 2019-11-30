Bonusaufgabe Vektoren im Computer

Erstellt von 878286 Kreutz, Maximilian und 878334 Fernau, Jan
Siehe auch KlassenDiagramm

Allgemeines:
Alle Klassen besitzen eine to-String Methode, um die Ausgabe über die Standardausgabe in einem formatiertem
Stil zu ermöglichen, sowie getter für alle Attribute und setter an sinnvollen Stellen. 
Alle Methoden bei denen es sinnvoll ist werden als Objekt- sowie als Klassenmethode 
angeboten um sie auch ohne Objekt aufrufen zu können. Alle Vergleiche auf 0 sind auf dem Datentyp double
sehr ungenau, daher wird immer auf einen Abstand von Epsilon = 10E-9 von 0 überprüft.

//Punkt 2D, 3D 
Die Klassen Punkt2D und Punkt3D besitzen als Attribute die x,y bzw. x,y,z Koordinate. Ein Punkt kann entweder
standardmäßig mit 0 in allen Punkten instanziiert werden, allgemein mit den gewünschten Zahlen als 
Fließkommazahl, oder aus einem bestehenden Punkt heraus über den Kopierkonstruktor.
Beide Klassen besitzen die folgenden Funktionen, diese unterscheiden sich nur im Rückgabe bzw.
Parametertyp. Daher werden die beiden Klassen im folgenden allgemein als Punkt bezeichnet.

dist(Punkt a) Gibt Abstand zwischen zwei Punkten als double zurück
Ortsvektor() Gibt einen Vektor zum angegebenen Punkt zurück, benutzt dazu den allgemeinen Vektor Konstruktor
VektorMitDiesemPunkt(Punkt a) Gibt einen Vektor zwischen dem aufrufenden Punkt und a zurück, es wird
der allgemeine Vektor Konstruktor verwendet.

//Vektor2D, 3D
Die Klassen Vektor2D und Vektor3D besitzen als Attribute die x,y bzw. x,y,z Koordinate. Ein Vektor kann entweder
standardmäßig mit 0 in allen Punkten instanziiert werden, allgemein mit den gewünschten Zahlen als 
Fließkommazahl, sowie aus zwei Vektoren, oder aus einem bestehenden Vektor heraus über den Kopierkonstruktor.
Beide Klassen besitzen die folgenden Funktionen, diese unterscheiden sich nur im Rückgabe bzw.
Parametertyp. Daher werden die beiden Klassen im folgenden allgemein als Vektor bezeichnet.

addiere(Vektor a) Addiert a zum aufrufenden Vektor hinzu
subtrahiere(Vektor a) Subtrahiert a vom aufrufenden Vektor
SkalaresVielfaches(double lambda) Skaliert den aufrufenden Vektor um den Faktor lambda
SkalarProdukt(Vektor a) berechnet das SkalarProdukt des aufrufenden mit dem Vektor a
LinearAbhängig(Vektor a) Gibt entweder true oder false zurück je nachdem ob die Vektoren linear abhängig sind oder nicht
dist() Berechnet die Euklidische Länge des aufrufenden Vektor
OrthogonalProjektion(Vektor v) Gibt den bei der Projektion des aufrufenden Vektors auf v zurück
berechneWinkel(Vektor a) Gibt den Winkel zwischen dem aufrufenden Vektor und a in Gradmaß zurück
berechneWinkelBogenMaß(Vektor v) Gibt den Winkel zwischen dem aufrufenden Vektor und v in Bogenmaß zurück

VektorProdukt(Vektor3D a) Nur bei einem Vektor im Raum ist das Vektorprodukt definiert, daher ist es nur hier
implementiert und gibt einen auf beiden Vektoren senkrecht stehenden Vektor zurück.

Hier werden die Objektmethoden durch Aufruf der Klassenmethoden mit der this Referenz und dem Parameter umgesetzt
um Fehler beim doppelten schreiben zu vermeiden.

//Gerade2D
Diese Klasse speichert eine Gerade in der Ebene sowohl in Parameterdarstellung als auch in impliziter Darstellung.
Zusätzlich wird eine Normale der Gerade mitgespeichert um sie direkt als Attribut zugreifbar zu machen.
Außer den normalen gettern gibt es hier zusätzlich die Möglichkeit die Faktoren der Hesseschen Normalenform
zu bekommen. Dazu werden die jeweiligen Komponenten des gespeicherten Normalenvektors durch die Länge des
Normalenvektors geteilt. Im allgemeinen Konstruktor für die Parameterdarstellung werden direkt die implizite 
Darstellung, sowie ein Normalenvektor berechnet und in den jeweiligen Attributen abgelegt. Dasselbe geschieht
auch umgekehrt bei Aufruf des Konstruktors mit den Werten der impliziten Darstellung. Ein Kopierkonstruktor wird
ebenso angeboten.

PunktAufGerade(Punkt2D p) Gibt entweder true oder false zurück je nachdem, ob p auf der aufrufenden Geraden liegt
dist_p(Punkt2D p) Gibt den Betrag der Distanz von p zur aufrufenden Geraden zurück
distOrientated(Punkt2D x) Gibt die Distanz von x zur aufrufenden Geraden zurück, das Vorzeichen hängt vom 
Normalenvektor ab, positiv entspricht der Seite des Normalenvektors, negativ entspricht der gegenüberliegenden Seite
berechneSchnittpunkt(Gerade2D g) Gibt den Schnittpunkt der aufrufenden mit der Geraden g zurück. Dieser ist nur ohne
die Meldung "Linear abhängig. Es gibt keinen echten Schnittpunkt!" ein echter Schnittpunkt der Geraden

Auch hier werden die Objektmethoden durch Aufruf der Klassenmethoden mit der this Referenz und dem Parameter umgesetzt
um Fehler beim doppelten schreiben zu vermeiden.

//Gerade3D
Diese Klasse speichert eine Gerade im Raum in Parameterdarstellung, da es eine implizite Darstelung von Geraden im Raum
nur als Schnittgerade zweier Ebenen gibt. Es gibt daher nur ein Attribut für den Richtungsvektor sowie den Aufpunkt,
welche im allgemeinen Konstruktor entsprechend belegt werden. Zusätzlich gibt es einen Standardkonstruktor, der
die Attribute mit dem Ursprung und dem Nullvektor belegt. Außerdem kann eine Gerade im Raum auch durch zwei Punkte
beschrieben werden. Dieser Konstruktor benutzt den allgemeinen Konstruktor der Klasse Vektor3D um einen Vektor 
zwischen zwei Punkten als Richtungsvektor zu erstellen und abzuspeichern. Standardmäßig gibt es den Kopierkonstruktor.

PunktAufGerade(Punkt3D p) Gibt entweder true oder false zurück je nachdem ob p auf der aufrufenden Geraden liegt
dist_p(Punkt3D p) Gibt den Betrag der Distanz von p zur aufrufenden Geraden zurück
distOrientated(Punkt3D x) Gibt die Distanz von x zur aufrufenden Geraden zurück, das Vorzeichen hängt vom
Normalenvektor ab, positiv entspricht der Seite des Normalenvektors, negativ entspricht der gegenüberliegenden Seite
berechneSchnittpunkt(Gerade3D g) Gibt den Schnittpunkt der aufrufenden mit der Geraden g zurück. Dieser ist nur ohne
die Meldung "Linear abhängig! Parallele Geraden", oder der Meldung "Die Geraden sind identisch!" ein gültiger Schnittpunkt
der beiden Geraden.
Zur Berechnung des Schnittpunkts wird über mehrere Hilfsmethoden ein lineares Gleichungssystem nach dem Gauss-Jordan
Algorithmus gelöst.
Der Lösungsweg durch das LGS wird zusätzlich zum Schnittpunkt ausgegeben.
Quelle: https://www.virtual-maxim.de/losen-linearer-gleichungssysteme-mit-gaus-jordan-algorithmus/

//Ebene3D
Diese Klasse speichert eine Ebene im Raum sowohl in Parameterdarstellung als auch in impliziter Darstellung.
Zusätzlich wird eine Normale der Ebene mitgespeichert um sie direkt als Attribut zugreifbar zu machen.
Außer den normalen gettern gibt es hier zusätzlich die Möglichkeit die Faktoren der Hesseschen Normalenform
zu bekommen. Dazu werden die jeweiligen Komponenten des gespeicherten Normalenvektors durch die Länge des
Normalenvektors geteilt. Im allgemeinen Konstruktor für die Parameterdarstellung werden direkt die implizite 
Darstellung, sowie ein Normalenvektor berechnet und in den jeweiligen Attributen abgelegt. Dasselbe geschieht
auch umgekehrt bei Aufruf des Konstruktors mit den Werten der impliziten Darstellung. Ein Kopierkonstruktor wird
ebenso angeboten.

pruefePunkt(Punkt3D t) Gibt entweder true oder false zurück je nachdem ob t auf der aufrufenden Ebene liegt
getDist_p(Punkt3D t) Gibt den Betrag der Distanz von t zur aufrufenden Ebene zurück
getDistOrientated(Punkt3D t) Gibt die Distanz von t zur aufrufenden Geraden zurück, das Vorzeichen hängt vom 
Normalenvektor ab, positiv entspricht der Seite des Normalenvektors, negativ entspricht der gegenüberliegenden Seite
berechneSchnittwinkel(Ebene3D f) Gibt den Schnittwinkel der aufrufenden mit der Ebene f zurück
berechneSchnittGerade(Ebene3D f) Gibt die Schnittgerade der aufrufenden mit der Ebene f zurück. Diese ist nur ohne
die Meldung "Ebenen sind gleich", oder der Meldung "Ebenen sind parallel !" eine gültige Schnittgerade
der beiden Ebenen.

Auch hier werden die Objektmethoden durch Aufruf der Klassenmethoden mit der this Referenz und dem Parameter umgesetzt
um Fehler beim doppelten schreiben zu vermeiden.


