(ns open-ai-api.specs.message-delta-object-delta-content-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-content-image-file-object-image-file :refer :all]
            [open-ai-api.specs.message-delta-content-text-object-text :refer :all]
            )
  (:import (java.io File)))


(def message-delta-object-delta-content-inner-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :image_file) message-delta-content-image-file-object-image-file-spec
   (ds/opt :text) message-delta-content-text-object-text-spec
   })

(def message-delta-object-delta-content-inner-spec
  (ds/spec
    {:name ::message-delta-object-delta-content-inner
     :spec message-delta-object-delta-content-inner-data}))
