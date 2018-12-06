(ns cljs-peer-star-app.core
  (:require [peer-star-app]))

(.log js/console "hello world")

(.log js/console peer-star-app)

; (defn listen
;   ([src type fn]
;      (listen src type fn false))
;   ([src type fn capture?]
;      (events/listen src
;                     (get (event-types src) type type)
;                     fn
;                     capture?)))

; (defn start-app [app]
;   (do (.then (.start app) #(println "app started"))
;       app))
; (defn create-app [name cfg] (peer-star-app name cfg))
; (defn get-id [app] (.then (.id app)))
; (let [app (start-app (create-app "cljs" {}))]
;   (.log js/console "App started!")
;   (.log js/console (get-id app)))
; (comment
;   (println "hello"))
; (comment
;   (js/alert "yo"))
; ; (listen peer-star-app "")
; ; (.log js/console (peer-star-app))
