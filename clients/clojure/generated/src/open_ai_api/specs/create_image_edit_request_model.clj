(ns open-ai-api.specs.create-image-edit-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-image-edit-request-model-data
  {
   })

(def create-image-edit-request-model-spec
  (ds/spec
    {:name ::create-image-edit-request-model
     :spec create-image-edit-request-model-data}))
