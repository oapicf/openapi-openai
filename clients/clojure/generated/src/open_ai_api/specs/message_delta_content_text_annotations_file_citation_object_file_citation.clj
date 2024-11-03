(ns open-ai-api.specs.message-delta-content-text-annotations-file-citation-object-file-citation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-delta-content-text-annotations-file-citation-object-file-citation-data
  {
   (ds/opt :file_id) string?
   (ds/opt :quote) string?
   })

(def message-delta-content-text-annotations-file-citation-object-file-citation-spec
  (ds/spec
    {:name ::message-delta-content-text-annotations-file-citation-object-file-citation
     :spec message-delta-content-text-annotations-file-citation-object-file-citation-data}))
