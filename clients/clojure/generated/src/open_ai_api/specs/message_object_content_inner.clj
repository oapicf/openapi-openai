(ns open-ai-api.specs.message-object-content-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-content-image-file-object-image-file :refer :all]
            [open-ai-api.specs.message-content-image-url-object-image-url :refer :all]
            [open-ai-api.specs.message-content-text-object-text :refer :all]
            )
  (:import (java.io File)))


(def message-object-content-inner-data
  {
   (ds/req :type) string?
   (ds/req :image_file) message-content-image-file-object-image-file-spec
   (ds/req :image_url) message-content-image-url-object-image-url-spec
   (ds/req :text) message-content-text-object-text-spec
   (ds/req :refusal) string?
   })

(def message-object-content-inner-spec
  (ds/spec
    {:name ::message-object-content-inner
     :spec message-object-content-inner-data}))
