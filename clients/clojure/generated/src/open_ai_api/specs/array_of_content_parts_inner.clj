(ns open-ai-api.specs.array-of-content-parts-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-content-image-file-object-image-file :refer :all]
            [open-ai-api.specs.message-content-image-url-object-image-url :refer :all]
            )
  (:import (java.io File)))


(def array-of-content-parts-inner-data
  {
   (ds/req :type) string?
   (ds/req :image_file) message-content-image-file-object-image-file-spec
   (ds/req :image_url) message-content-image-url-object-image-url-spec
   (ds/req :text) string?
   })

(def array-of-content-parts-inner-spec
  (ds/spec
    {:name ::array-of-content-parts-inner
     :spec array-of-content-parts-inner-data}))
