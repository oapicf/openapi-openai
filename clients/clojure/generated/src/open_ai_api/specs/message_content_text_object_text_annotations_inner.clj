(ns open-ai-api.specs.message-content-text-object-text-annotations-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-content-text-annotations-file-citation-object-file-citation :refer :all]
            [open-ai-api.specs.message-content-text-annotations-file-path-object-file-path :refer :all]
            )
  (:import (java.io File)))


(def message-content-text-object-text-annotations-inner-data
  {
   (ds/req :type) string?
   (ds/req :text) string?
   (ds/req :file_citation) message-content-text-annotations-file-citation-object-file-citation-spec
   (ds/req :start_index) int?
   (ds/req :end_index) int?
   (ds/req :file_path) message-content-text-annotations-file-path-object-file-path-spec
   })

(def message-content-text-object-text-annotations-inner-spec
  (ds/spec
    {:name ::message-content-text-object-text-annotations-inner
     :spec message-content-text-object-text-annotations-inner-data}))
