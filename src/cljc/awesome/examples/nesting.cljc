(ns no-syntax.examples.nesting)

(def city-data
  { "Albuquerque" { :population 903000
                   :state "NM"
                   :mayor "Richard Berry"
                   :area 189.5
                   :elevation 5312
                   :demonym "burqueno"}
   "Boise" { :population 616561
            :state "ID"
            :mayor "David Bieter"
            :area 80.05
            :elevation 2730
            :demonym "boisean"
            :area-code 208}})

;This is how we access nested data.
(prn (get-in city-data ["Albuquerque" :population]))
(prn (get-in city-data ["Boise" :population]))

;It is safe - anything that fails just returns nil
(prn (get-in city-data ["Boise" :area-code]))
(prn (get-in city-data ["Albuquerque" :area-code]))

;This is how we update a data structure by replacement
(prn (get-in city-data ["Albuquerque" :demonym]))
(def updated-city-data (assoc-in city-data ["Albuquerque" :demonym] "Albuquerquean"))
(prn (get-in updated-city-data ["Albuquerque" :demonym]))

;This is how we update a data structure with a function
(prn (update-in city-data ["Albuquerque" :population] inc))


