(ns open-ai-api.specs.create-moderation-request-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-moderation-request-input-data
  {
   })

(def create-moderation-request-input-spec
  (ds/spec
    {:name ::create-moderation-request-input
     :spec create-moderation-request-input-data}))
