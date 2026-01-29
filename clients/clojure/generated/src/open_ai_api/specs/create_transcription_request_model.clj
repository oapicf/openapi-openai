(ns open-ai-api.specs.create-transcription-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-transcription-request-model-data
  {
   })

(def create-transcription-request-model-spec
  (ds/spec
    {:name ::create-transcription-request-model
     :spec create-transcription-request-model-data}))
