(ns open-ai-api.specs.message-delta-content-text-object-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-content-text-object-text-annotations-inner :refer :all]
            )
  (:import (java.io File)))


(def message-delta-content-text-object-text-data
  {
   (ds/opt :value) string?
   (ds/opt :annotations) (s/coll-of message-delta-content-text-object-text-annotations-inner-spec)
   })

(def message-delta-content-text-object-text-spec
  (ds/spec
    {:name ::message-delta-content-text-object-text
     :spec message-delta-content-text-object-text-data}))
