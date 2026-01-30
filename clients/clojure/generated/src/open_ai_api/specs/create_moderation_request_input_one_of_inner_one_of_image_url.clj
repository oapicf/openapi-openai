(ns open-ai-api.specs.create-moderation-request-input-one-of-inner-one-of-image-url
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-moderation-request-input-one-of-inner-one-of-image-url-data
  {
   (ds/req :url) string?
   })

(def create-moderation-request-input-one-of-inner-one-of-image-url-spec
  (ds/spec
    {:name ::create-moderation-request-input-one-of-inner-one-of-image-url
     :spec create-moderation-request-input-one-of-inner-one-of-image-url-data}))
