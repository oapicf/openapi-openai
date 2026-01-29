(ns open-ai-api.specs.message-delta-content-text-annotations-file-path-object-file-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-delta-content-text-annotations-file-path-object-file-path-data
  {
   (ds/opt :file_id) string?
   })

(def message-delta-content-text-annotations-file-path-object-file-path-spec
  (ds/spec
    {:name ::message-delta-content-text-annotations-file-path-object-file-path
     :spec message-delta-content-text-annotations-file-path-object-file-path-data}))
