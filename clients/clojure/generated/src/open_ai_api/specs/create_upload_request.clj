(ns open-ai-api.specs.create-upload-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-upload-request-data
  {
   (ds/req :filename) string?
   (ds/req :purpose) string?
   (ds/req :bytes) int?
   (ds/req :mime_type) string?
   })

(def create-upload-request-spec
  (ds/spec
    {:name ::create-upload-request
     :spec create-upload-request-data}))
