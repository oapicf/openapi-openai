(ns open-ai-api.specs.message-content-text-annotations-file-citation-object-file-citation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-content-text-annotations-file-citation-object-file-citation-data
  {
   (ds/req :file_id) string?
   })

(def message-content-text-annotations-file-citation-object-file-citation-spec
  (ds/spec
    {:name ::message-content-text-annotations-file-citation-object-file-citation
     :spec message-content-text-annotations-file-citation-object-file-citation-data}))
