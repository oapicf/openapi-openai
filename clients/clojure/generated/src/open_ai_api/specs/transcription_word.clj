(ns open-ai-api.specs.transcription-word
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def transcription-word-data
  {
   (ds/req :word) string?
   (ds/req :start) float?
   (ds/req :end) float?
   })

(def transcription-word-spec
  (ds/spec
    {:name ::transcription-word
     :spec transcription-word-data}))
