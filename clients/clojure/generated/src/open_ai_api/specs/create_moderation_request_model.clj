(ns open-ai-api.specs.create-moderation-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-moderation-request-model-data
  {
   })

(def create-moderation-request-model-spec
  (ds/spec
    {:name ::create-moderation-request-model
     :spec create-moderation-request-model-data}))
