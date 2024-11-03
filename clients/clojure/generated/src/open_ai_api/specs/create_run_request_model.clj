(ns open-ai-api.specs.create-run-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-run-request-model-data
  {
   })

(def create-run-request-model-spec
  (ds/spec
    {:name ::create-run-request-model
     :spec create-run-request-model-data}))
