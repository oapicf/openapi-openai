(ns open-ai-api.specs.realtime-server-event-conversation-item-truncated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-conversation-item-truncated-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :item_id) string?
   (ds/req :content_index) int?
   (ds/req :audio_end_ms) int?
   })

(def realtime-server-event-conversation-item-truncated-spec
  (ds/spec
    {:name ::realtime-server-event-conversation-item-truncated
     :spec realtime-server-event-conversation-item-truncated-data}))
