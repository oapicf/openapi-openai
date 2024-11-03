(ns open-ai-api.specs.message-content-image-file-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-content-image-file-object-image-file :refer :all]
            )
  (:import (java.io File)))


(def message-content-image-file-object-data
  {
   (ds/req :type) string?
   (ds/req :image_file) message-content-image-file-object-image-file-spec
   })

(def message-content-image-file-object-spec
  (ds/spec
    {:name ::message-content-image-file-object
     :spec message-content-image-file-object-data}))
