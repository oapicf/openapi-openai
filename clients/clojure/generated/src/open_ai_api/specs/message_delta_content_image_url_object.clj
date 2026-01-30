(ns open-ai-api.specs.message-delta-content-image-url-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-content-image-url-object-image-url :refer :all]
            )
  (:import (java.io File)))


(def message-delta-content-image-url-object-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :image_url) message-delta-content-image-url-object-image-url-spec
   })

(def message-delta-content-image-url-object-spec
  (ds/spec
    {:name ::message-delta-content-image-url-object
     :spec message-delta-content-image-url-object-data}))
