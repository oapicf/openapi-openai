(ns open-ai-api.specs.message-delta-content-image-file-object-image-file
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-delta-content-image-file-object-image-file-data
  {
   (ds/opt :file_id) string?
   (ds/opt :detail) string?
   })

(def message-delta-content-image-file-object-image-file-spec
  (ds/spec
    {:name ::message-delta-content-image-file-object-image-file
     :spec message-delta-content-image-file-object-image-file-data}))
