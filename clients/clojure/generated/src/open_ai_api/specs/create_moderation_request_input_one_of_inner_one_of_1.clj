(ns open-ai-api.specs.create-moderation-request-input-one-of-inner-one-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-moderation-request-input-one-of-inner-one-of-1-data
  {
   (ds/req :type) string?
   (ds/req :text) string?
   })

(def create-moderation-request-input-one-of-inner-one-of-1-spec
  (ds/spec
    {:name ::create-moderation-request-input-one-of-inner-one-of-1
     :spec create-moderation-request-input-one-of-inner-one-of-1-data}))
