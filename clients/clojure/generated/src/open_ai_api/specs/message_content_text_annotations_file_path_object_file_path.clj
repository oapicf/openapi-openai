(ns open-ai-api.specs.message-content-text-annotations-file-path-object-file-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-content-text-annotations-file-path-object-file-path-data
  {
   (ds/req :file_id) string?
   })

(def message-content-text-annotations-file-path-object-file-path-spec
  (ds/spec
    {:name ::message-content-text-annotations-file-path-object-file-path
     :spec message-content-text-annotations-file-path-object-file-path-data}))
