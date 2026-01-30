(ns open-ai-api.specs.realtime-session-input-audio-transcription
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-session-input-audio-transcription-data
  {
   (ds/opt :model) string?
   })

(def realtime-session-input-audio-transcription-spec
  (ds/spec
    {:name ::realtime-session-input-audio-transcription
     :spec realtime-session-input-audio-transcription-data}))
