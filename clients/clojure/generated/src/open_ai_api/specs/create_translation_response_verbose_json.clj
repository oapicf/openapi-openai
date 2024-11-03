(ns open-ai-api.specs.create-translation-response-verbose-json
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.transcription-segment :refer :all]
            )
  (:import (java.io File)))


(def create-translation-response-verbose-json-data
  {
   (ds/req :language) string?
   (ds/req :duration) string?
   (ds/req :text) string?
   (ds/opt :segments) (s/coll-of transcription-segment-spec)
   })

(def create-translation-response-verbose-json-spec
  (ds/spec
    {:name ::create-translation-response-verbose-json
     :spec create-translation-response-verbose-json-data}))
