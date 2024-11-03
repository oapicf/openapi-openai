(ns open-ai-api.specs.create-speech-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-speech-request-model-data
  {
   })

(def create-speech-request-model-spec
  (ds/spec
    {:name ::create-speech-request-model
     :spec create-speech-request-model-data}))
