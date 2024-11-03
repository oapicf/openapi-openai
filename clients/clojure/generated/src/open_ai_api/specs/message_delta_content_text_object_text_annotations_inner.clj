(ns open-ai-api.specs.message-delta-content-text-object-text-annotations-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-content-text-annotations-file-citation-object-file-citation :refer :all]
            [open-ai-api.specs.message-delta-content-text-annotations-file-path-object-file-path :refer :all]
            )
  (:import (java.io File)))


(def message-delta-content-text-object-text-annotations-inner-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :text) string?
   (ds/opt :file_citation) message-delta-content-text-annotations-file-citation-object-file-citation-spec
   (ds/opt :start_index) int?
   (ds/opt :end_index) int?
   (ds/opt :file_path) message-delta-content-text-annotations-file-path-object-file-path-spec
   })

(def message-delta-content-text-object-text-annotations-inner-spec
  (ds/spec
    {:name ::message-delta-content-text-object-text-annotations-inner
     :spec message-delta-content-text-object-text-annotations-inner-data}))
