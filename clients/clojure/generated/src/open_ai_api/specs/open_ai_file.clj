(ns open-ai-api.specs.open-ai-file
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def open-ai-file-data
  {
   (ds/req :id) string?
   (ds/req :bytes) int?
   (ds/req :created_at) int?
   (ds/req :filename) string?
   (ds/req :object) string?
   (ds/req :purpose) string?
   (ds/req :status) string?
   (ds/opt :status_details) string?
   })

(def open-ai-file-spec
  (ds/spec
    {:name ::open-ai-file
     :spec open-ai-file-data}))
