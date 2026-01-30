(ns open-ai-api.specs.upload-part
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def upload-part-data
  {
   (ds/req :id) string?
   (ds/req :created_at) int?
   (ds/req :upload_id) string?
   (ds/req :object) string?
   })

(def upload-part-spec
  (ds/spec
    {:name ::upload-part
     :spec upload-part-data}))
