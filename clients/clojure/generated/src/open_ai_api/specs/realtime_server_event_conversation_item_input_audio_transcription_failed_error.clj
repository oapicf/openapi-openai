(ns open-ai-api.specs.realtime-server-event-conversation-item-input-audio-transcription-failed-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-conversation-item-input-audio-transcription-failed-error-data
  {
   (ds/opt :type) string?
   (ds/opt :code) string?
   (ds/opt :message) string?
   (ds/opt :param) string?
   })

(def realtime-server-event-conversation-item-input-audio-transcription-failed-error-spec
  (ds/spec
    {:name ::realtime-server-event-conversation-item-input-audio-transcription-failed-error
     :spec realtime-server-event-conversation-item-input-audio-transcription-failed-error-data}))
