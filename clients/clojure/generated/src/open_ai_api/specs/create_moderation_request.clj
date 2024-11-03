(ns open-ai-api.specs.create-moderation-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-moderation-request-input :refer :all]
            [open-ai-api.specs.create-moderation-request-model :refer :all]
            )
  (:import (java.io File)))


(def create-moderation-request-data
  {
   (ds/req :input) create-moderation-request-input-spec
   (ds/opt :model) create-moderation-request-model-spec
   })

(def create-moderation-request-spec
  (ds/spec
    {:name ::create-moderation-request
     :spec create-moderation-request-data}))
