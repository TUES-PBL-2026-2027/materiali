# list2: програмите от лист 2, заедно с класовете на казуса

Същите Ticket, Card, Validator и Inspector като в `../transport`, плюс четирите програми от лист 2.
Shop.java нарочно не се компилира: това е задачата.

```
javac Ticket.java Card.java Validator.java Inspector.java
javac Mem.java && java Mem
javac Str.java && java Str
javac Cnt.java && java Cnt
javac Shop.java
```
Последната команда показва четирите грешки при компилация. След като ги поправиш: `java Shop`.
