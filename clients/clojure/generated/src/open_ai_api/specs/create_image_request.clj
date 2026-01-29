(ns open-ai-api.specs.create-image-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-image-request-model :refer :all]
            )
  (:import (java.io File)))


(def create-image-request-data
  {
   (ds/req :prompt) string?
   (ds/opt :model) create-image-request-model-spec
   (ds/opt :n) int?
   (ds/opt :quality) string?
   (ds/opt :response_format) string?
   (ds/opt :size) string?
   (ds/opt :style) string?
   (ds/opt :user) string?
   })

(def create-image-request-spec
  (ds/spec
    {:name ::create-image-request
     :spec create-image-request-data}))
