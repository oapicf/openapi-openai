(ns open-ai-api.specs.message-content-image-url-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-content-image-url-object-image-url :refer :all]
            )
  (:import (java.io File)))


(def message-content-image-url-object-data
  {
   (ds/req :type) string?
   (ds/req :image_url) message-content-image-url-object-image-url-spec
   })

(def message-content-image-url-object-spec
  (ds/spec
    {:name ::message-content-image-url-object
     :spec message-content-image-url-object-data}))
