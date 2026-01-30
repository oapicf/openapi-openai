(ns open-ai-api.specs.realtime-server-event-conversation-item-input-audio-transcription-failed
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-server-event-conversation-item-input-audio-transcription-failed-error :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-conversation-item-input-audio-transcription-failed-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :item_id) string?
   (ds/req :content_index) int?
   (ds/req :error) realtime-server-event-conversation-item-input-audio-transcription-failed-error-spec
   })

(def realtime-server-event-conversation-item-input-audio-transcription-failed-spec
  (ds/spec
    {:name ::realtime-server-event-conversation-item-input-audio-transcription-failed
     :spec realtime-server-event-conversation-item-input-audio-transcription-failed-data}))
