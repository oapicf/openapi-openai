(ns open-ai-api.specs.upload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.open-ai-file :refer :all]
            )
  (:import (java.io File)))


(def upload-data
  {
   (ds/req :id) string?
   (ds/req :created_at) int?
   (ds/req :filename) string?
   (ds/req :bytes) int?
   (ds/req :purpose) string?
   (ds/req :status) string?
   (ds/req :expires_at) int?
   (ds/opt :object) string?
   (ds/opt :file) open-ai-file-spec
   })

(def upload-spec
  (ds/spec
    {:name ::upload
     :spec upload-data}))
