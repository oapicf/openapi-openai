(ns open-ai-api.specs.message-content-text-annotations-file-path-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-content-text-annotations-file-path-object-file-path :refer :all]
            )
  (:import (java.io File)))


(def message-content-text-annotations-file-path-object-data
  {
   (ds/req :type) string?
   (ds/req :text) string?
   (ds/req :file_path) message-content-text-annotations-file-path-object-file-path-spec
   (ds/req :start_index) int?
   (ds/req :end_index) int?
   })

(def message-content-text-annotations-file-path-object-spec
  (ds/spec
    {:name ::message-content-text-annotations-file-path-object
     :spec message-content-text-annotations-file-path-object-data}))
