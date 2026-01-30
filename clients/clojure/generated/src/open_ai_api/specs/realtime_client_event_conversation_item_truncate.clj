(ns open-ai-api.specs.realtime-client-event-conversation-item-truncate
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-client-event-conversation-item-truncate-data
  {
   (ds/opt :event_id) string?
   (ds/req :type) string?
   (ds/req :item_id) string?
   (ds/req :content_index) int?
   (ds/req :audio_end_ms) int?
   })

(def realtime-client-event-conversation-item-truncate-spec
  (ds/spec
    {:name ::realtime-client-event-conversation-item-truncate
     :spec realtime-client-event-conversation-item-truncate-data}))
