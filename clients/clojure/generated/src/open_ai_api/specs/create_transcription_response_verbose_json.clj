(ns open-ai-api.specs.create-transcription-response-verbose-json
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.transcription-word :refer :all]
            [open-ai-api.specs.transcription-segment :refer :all]
            )
  (:import (java.io File)))


(def create-transcription-response-verbose-json-data
  {
   (ds/req :language) string?
   (ds/req :duration) string?
   (ds/req :text) string?
   (ds/opt :words) (s/coll-of transcription-word-spec)
   (ds/opt :segments) (s/coll-of transcription-segment-spec)
   })

(def create-transcription-response-verbose-json-spec
  (ds/spec
    {:name ::create-transcription-response-verbose-json
     :spec create-transcription-response-verbose-json-data}))
