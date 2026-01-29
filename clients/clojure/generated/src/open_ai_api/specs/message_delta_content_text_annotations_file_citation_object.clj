(ns open-ai-api.specs.message-delta-content-text-annotations-file-citation-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-content-text-annotations-file-citation-object-file-citation :refer :all]
            )
  (:import (java.io File)))


(def message-delta-content-text-annotations-file-citation-object-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :text) string?
   (ds/opt :file_citation) message-delta-content-text-annotations-file-citation-object-file-citation-spec
   (ds/opt :start_index) int?
   (ds/opt :end_index) int?
   })

(def message-delta-content-text-annotations-file-citation-object-spec
  (ds/spec
    {:name ::message-delta-content-text-annotations-file-citation-object
     :spec message-delta-content-text-annotations-file-citation-object-data}))
