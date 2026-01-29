(ns open-ai-api.specs.transcription-segment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def transcription-segment-data
  {
   (ds/req :id) int?
   (ds/req :seek) int?
   (ds/req :start) float?
   (ds/req :end) float?
   (ds/req :text) string?
   (ds/req :tokens) (s/coll-of int?)
   (ds/req :temperature) float?
   (ds/req :avg_logprob) float?
   (ds/req :compression_ratio) float?
   (ds/req :no_speech_prob) float?
   })

(def transcription-segment-spec
  (ds/spec
    {:name ::transcription-segment
     :spec transcription-segment-data}))
