(ns open-ai-api.specs.message-content-image-url-object-image-url
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-content-image-url-object-image-url-data
  {
   (ds/req :url) string?
   (ds/opt :detail) string?
   })

(def message-content-image-url-object-image-url-spec
  (ds/spec
    {:name ::message-content-image-url-object-image-url
     :spec message-content-image-url-object-image-url-data}))
