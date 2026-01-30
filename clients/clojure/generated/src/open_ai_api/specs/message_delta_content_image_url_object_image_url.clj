(ns open-ai-api.specs.message-delta-content-image-url-object-image-url
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-delta-content-image-url-object-image-url-data
  {
   (ds/opt :url) string?
   (ds/opt :detail) string?
   })

(def message-delta-content-image-url-object-image-url-spec
  (ds/spec
    {:name ::message-delta-content-image-url-object-image-url
     :spec message-delta-content-image-url-object-image-url-data}))
