(ns open-ai-api.specs.create-assistant-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-assistant-request-model-data
  {
   })

(def create-assistant-request-model-spec
  (ds/spec
    {:name ::create-assistant-request-model
     :spec create-assistant-request-model-data}))
