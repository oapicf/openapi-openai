(ns open-ai-api.specs.message-delta-content-image-file-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-content-image-file-object-image-file :refer :all]
            )
  (:import (java.io File)))


(def message-delta-content-image-file-object-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :image_file) message-delta-content-image-file-object-image-file-spec
   })

(def message-delta-content-image-file-object-spec
  (ds/spec
    {:name ::message-delta-content-image-file-object
     :spec message-delta-content-image-file-object-data}))
