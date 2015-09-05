(ns state.overview)

; Empasize that OOP and FP are paradigms, not languages
; You can do a lot of this, but not all, in Java
;
; History
; -I went through all of this
; -Had all of these problems
; -Iterated through Java, Scala, Clojure
; -Clojure is the only one that addresses everything
; -Maybe put the following in the conclusions
; -You can do it all in Java using Clojure (http://www.lispcast.com/3-things-java-can-steal-from-clojure)
;
; Basics
; - FP is not methods and not just functions
;  -First class functions - not the emphasis of the talk
;  -Values - show with diagram that x, f(x) are values. This is the emphasis of the talk. How do you do anything useful
;            if nothing ever changes?
;  -Referential transparency - f(x) always gives the same x. Not the emphasis of this talk, but shows value of values and FP
;
; Discuss ways of thinking of "state" - Universe/Multiverse
;
; Evolving Challenges and Benefits:
; -Values
; -Collections or References/Cycles (which first?)
; -Application state: At some point we have to keep track of values
;  -PCL - Complected. Inconsistent with best practices.
;  -Atoms,Agents,Refs - Awesome!
;
; Value Classes - Start with "Effective Java"
; -Best practices point to doing value oriented programming
; -Easy in the small, difficult in the large
;
; Cycles and references - Use IDs
; - MutableAmoeba example
; - Demonstrate parent-child
;  -return child OR entire state
;
; Immutable Collections
; - Demonstrate addition, removal, and updates - including cycles
; - Bonuses of heterogeneity (maybe better in cycles section?)
;
; Application state
; - Not handled well outside of Clojure
; - Java uses beans and PCLs
;  -Complected
;  -Antipatterns for immutability
; -Scala + Akka
;  -Not batteries included
;  -Complex
; -Clojure - Awesome
;
; Conclusions
; -Clojure handles all of these proglems very well
; -Scala does most of it
; -You can use Clojure from all of the above since Clojure is hosted.
;  -http://www.lispcast.com/3-things-java-can-steal-from-clojure
