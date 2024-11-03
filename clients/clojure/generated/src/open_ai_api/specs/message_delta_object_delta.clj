(ns open-ai-api.specs.message-delta-object-delta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-object-delta-content-inner :refer :all]
            )
  (:import (java.io File)))


(def message-delta-object-delta-data
  {
   (ds/opt :role) string?
   (ds/opt :content) (s/coll-of message-delta-object-delta-content-inner-spec)
   (ds/opt :file_ids) (s/coll-of string?)
   })

(def message-delta-object-delta-spec
  (ds/spec
    {:name ::message-delta-object-delta
     :spec message-delta-object-delta-data}))
