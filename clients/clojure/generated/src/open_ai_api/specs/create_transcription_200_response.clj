(ns open-ai-api.specs.create-transcription-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.transcription-word :refer :all]
            [open-ai-api.specs.transcription-segment :refer :all]
            )
  (:import (java.io File)))


(def create-transcription-200-response-data
  {
   (ds/req :text) string?
   (ds/req :language) string?
   (ds/req :duration) string?
   (ds/opt :words) (s/coll-of transcription-word-spec)
   (ds/opt :segments) (s/coll-of transcription-segment-spec)
   })

(def create-transcription-200-response-spec
  (ds/spec
    {:name ::create-transcription-200-response
     :spec create-transcription-200-response-data}))
