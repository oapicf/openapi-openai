(ns open-ai-api.specs.create-transcription-response-json
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-transcription-response-json-data
  {
   (ds/req :text) string?
   })

(def create-transcription-response-json-spec
  (ds/spec
    {:name ::create-transcription-response-json
     :spec create-transcription-response-json-data}))
