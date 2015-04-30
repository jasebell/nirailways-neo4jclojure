(ns nirailways.core
  (:require [clojurewerkz.neocons.rest :as nr]
            [clojurewerkz.neocons.rest.nodes :as nn]
            [clojurewerkz.neocons.rest.relationships :as nrl]))

(defn create-nodes-edges [] 
  (let [conn (nr/connect "http://localhost:7474/db/data") 
        londonderry (nn/create conn {:name "Londonderry" :type "station"})
        bellarena (nn/create conn {:name "Bellarena" :type "station"})
        castlerock (nn/create conn {:name "Castlerock" :type "station"})
        coleraine (nn/create conn {:name "Coleraine" :type "station"})
        ballymoney (nn/create conn {:name "Ballymoney" :type "station"})
        cullybacky (nn/create conn {:name "Cullybacky" :type "station"})
        ballymena (nn/create conn {:name "Ballymena" :type "station"})
        antrim (nn/create conn {:name "Antrim" :type "station"})
        mossleywest (nn/create conn {:name "Mossley West" :type "station"})
        yorkgate (nn/create conn {:name "Yorkgate" :type "station"})
        belfastcentral (nn/create conn {:name "Belfast Central" :type "station"})
        botanic (nn/create conn {:name "Botanic" :type "station"})
        cityhospital (nn/create conn {:name "City Hospital" :type "station"})
        gtvictoriastreet (nn/create conn {:name "Great Victoria Street" :type "station"})
        university (nn/create conn {:name "University" :type "station"})
        dhuvarren (nn/create conn {:name "Dhu Varren" :type "station"})
        portrush (nn/create conn {:name "Portrush" :type "station"})
        rel1 (nrl/create conn londonderry bellarena :connection {:distance "10"})
        rel2 (nrl/create conn bellarena castlerock :connection {:distance "10"})
        rel3 (nrl/create conn castlerock coleraine :connection {:distance "10"})
        rel4 (nrl/create conn coleraine ballymoney :connection {:distance "10"})
        rel5 (nrl/create conn coleraine university :connection {:distnace "10"})
        rel6 (nrl/create conn ballymoney cullybacky :connection {:distance "10"})
        rel7 (nrl/create conn cullybacky ballymena :connection {:distance "10"})
        rel8 (nrl/create conn ballymena antrim :connection {:distance "10"})
        rel9 (nrl/create conn antrim mossleywest :connection {:distance "10"})
        rel10 (nrl/create conn mossleywest yorkgate :connection {:distance "10"})
        rel11 (nrl/create conn yorkgate belfastcentral :connection {:distance "10"})
        rel12 (nrl/create conn belfastcentral botanic :connection {:distance "10"})
        rel13 (nrl/create conn botanic cityhospital :connection {:distance "10"})
        rel14 (nrl/create conn cityhospital gtvictoriastreet :connection {:distance "10"})
        rel15 (nrl/create conn university dhuvarren :connection {:distance "10"})
        rel16 (nrl/create conn dhuvarren portrush :connection {:distance "10"})
       ]))



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
