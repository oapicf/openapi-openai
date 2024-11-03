(ns open-ai-api.specs.message-content-image-file-object-image-file
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-content-image-file-object-image-file-data
  {
   (ds/req :file_id) string?
   })

(def message-content-image-file-object-image-file-spec
  (ds/spec
    {:name ::message-content-image-file-object-image-file
     :spec message-content-image-file-object-image-file-data}))
