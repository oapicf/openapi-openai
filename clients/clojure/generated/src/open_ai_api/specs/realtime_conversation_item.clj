(ns open-ai-api.specs.realtime-conversation-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-conversation-item-content-inner :refer :all]
            )
  (:import (java.io File)))


(def realtime-conversation-item-data
  {
   (ds/opt :id) string?
   (ds/opt :type) string?
   (ds/opt :object) string?
   (ds/opt :status) string?
   (ds/opt :role) string?
   (ds/opt :content) (s/coll-of realtime-conversation-item-content-inner-spec)
   (ds/opt :call_id) string?
   (ds/opt :name) string?
   (ds/opt :arguments) string?
   (ds/opt :output) string?
   })

(def realtime-conversation-item-spec
  (ds/spec
    {:name ::realtime-conversation-item
     :spec realtime-conversation-item-data}))
