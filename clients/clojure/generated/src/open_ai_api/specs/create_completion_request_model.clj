(ns open-ai-api.specs.create-completion-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-completion-request-model-data
  {
   })

(def create-completion-request-model-spec
  (ds/spec
    {:name ::create-completion-request-model
     :spec create-completion-request-model-data}))
