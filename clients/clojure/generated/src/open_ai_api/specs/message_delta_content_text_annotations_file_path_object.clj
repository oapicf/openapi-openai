(ns open-ai-api.specs.message-delta-content-text-annotations-file-path-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-content-text-annotations-file-path-object-file-path :refer :all]
            )
  (:import (java.io File)))


(def message-delta-content-text-annotations-file-path-object-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :text) string?
   (ds/opt :file_path) message-delta-content-text-annotations-file-path-object-file-path-spec
   (ds/opt :start_index) int?
   (ds/opt :end_index) int?
   })

(def message-delta-content-text-annotations-file-path-object-spec
  (ds/spec
    {:name ::message-delta-content-text-annotations-file-path-object
     :spec message-delta-content-text-annotations-file-path-object-data}))
