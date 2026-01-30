(ns open-ai-api.specs.realtime-server-event-conversation-item-input-audio-transcription-completed
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-conversation-item-input-audio-transcription-completed-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :item_id) string?
   (ds/req :content_index) int?
   (ds/req :transcript) string?
   })

(def realtime-server-event-conversation-item-input-audio-transcription-completed-spec
  (ds/spec
    {:name ::realtime-server-event-conversation-item-input-audio-transcription-completed
     :spec realtime-server-event-conversation-item-input-audio-transcription-completed-data}))
