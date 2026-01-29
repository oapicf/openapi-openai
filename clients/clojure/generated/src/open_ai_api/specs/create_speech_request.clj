(ns open-ai-api.specs.create-speech-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-speech-request-model :refer :all]
            )
  (:import (java.io File)))


(def create-speech-request-data
  {
   (ds/req :model) create-speech-request-model-spec
   (ds/req :input) string?
   (ds/req :voice) string?
   (ds/opt :response_format) string?
   (ds/opt :speed) float?
   })

(def create-speech-request-spec
  (ds/spec
    {:name ::create-speech-request
     :spec create-speech-request-data}))
