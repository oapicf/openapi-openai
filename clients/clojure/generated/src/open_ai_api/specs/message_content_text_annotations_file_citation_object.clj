(ns open-ai-api.specs.message-content-text-annotations-file-citation-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-content-text-annotations-file-citation-object-file-citation :refer :all]
            )
  (:import (java.io File)))


(def message-content-text-annotations-file-citation-object-data
  {
   (ds/req :type) string?
   (ds/req :text) string?
   (ds/req :file_citation) message-content-text-annotations-file-citation-object-file-citation-spec
   (ds/req :start_index) int?
   (ds/req :end_index) int?
   })

(def message-content-text-annotations-file-citation-object-spec
  (ds/spec
    {:name ::message-content-text-annotations-file-citation-object
     :spec message-content-text-annotations-file-citation-object-data}))
