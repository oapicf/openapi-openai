(ns open-ai-api.specs.realtime-server-event-input-audio-buffer-speech-stopped
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-input-audio-buffer-speech-stopped-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :audio_end_ms) int?
   (ds/req :item_id) string?
   })

(def realtime-server-event-input-audio-buffer-speech-stopped-spec
  (ds/spec
    {:name ::realtime-server-event-input-audio-buffer-speech-stopped
     :spec realtime-server-event-input-audio-buffer-speech-stopped-data}))
