(ns open-ai-api.specs.create-image-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-image-request-model-data
  {
   })

(def create-image-request-model-spec
  (ds/spec
    {:name ::create-image-request-model
     :spec create-image-request-model-data}))
