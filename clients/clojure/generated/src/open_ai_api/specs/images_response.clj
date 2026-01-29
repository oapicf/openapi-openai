(ns open-ai-api.specs.images-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.image :refer :all]
            )
  (:import (java.io File)))


(def images-response-data
  {
   (ds/req :created) int?
   (ds/req :data) (s/coll-of image-spec)
   })

(def images-response-spec
  (ds/spec
    {:name ::images-response
     :spec images-response-data}))
