(ns open-ai-api.specs.realtime-conversation-item-content-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-conversation-item-content-inner-data
  {
   (ds/opt :type) string?
   (ds/opt :text) string?
   (ds/opt :id) string?
   (ds/opt :audio) string?
   (ds/opt :transcript) string?
   })

(def realtime-conversation-item-content-inner-spec
  (ds/spec
    {:name ::realtime-conversation-item-content-inner
     :spec realtime-conversation-item-content-inner-data}))
