(ns open-ai-api.specs.message-content-text-object-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-content-text-object-text-annotations-inner :refer :all]
            )
  (:import (java.io File)))


(def message-content-text-object-text-data
  {
   (ds/req :value) string?
   (ds/req :annotations) (s/coll-of message-content-text-object-text-annotations-inner-spec)
   })

(def message-content-text-object-text-spec
  (ds/spec
    {:name ::message-content-text-object-text
     :spec message-content-text-object-text-data}))
