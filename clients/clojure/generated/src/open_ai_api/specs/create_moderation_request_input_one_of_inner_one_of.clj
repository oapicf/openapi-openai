(ns open-ai-api.specs.create-moderation-request-input-one-of-inner-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-moderation-request-input-one-of-inner-one-of-image-url :refer :all]
            )
  (:import (java.io File)))


(def create-moderation-request-input-one-of-inner-one-of-data
  {
   (ds/req :type) string?
   (ds/req :image_url) create-moderation-request-input-one-of-inner-one-of-image-url-spec
   })

(def create-moderation-request-input-one-of-inner-one-of-spec
  (ds/spec
    {:name ::create-moderation-request-input-one-of-inner-one-of
     :spec create-moderation-request-input-one-of-inner-one-of-data}))
