(ns open-ai-api.specs.create-moderation-request-input-one-of-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-moderation-request-input-one-of-inner-one-of-image-url :refer :all]
            )
  (:import (java.io File)))


(def create-moderation-request-input-one-of-inner-data
  {
   (ds/req :type) string?
   (ds/req :image_url) create-moderation-request-input-one-of-inner-one-of-image-url-spec
   (ds/req :text) string?
   })

(def create-moderation-request-input-one-of-inner-spec
  (ds/spec
    {:name ::create-moderation-request-input-one-of-inner
     :spec create-moderation-request-input-one-of-inner-data}))
