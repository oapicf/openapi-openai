(ns open-ai-api.specs.realtime-session-create-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-session-create-response-client-secret :refer :all]
            [open-ai-api.specs.realtime-session-input-audio-transcription :refer :all]
            [open-ai-api.specs.realtime-session-create-response-turn-detection :refer :all]
            [open-ai-api.specs.realtime-response-create-params-tools-inner :refer :all]
            [open-ai-api.specs.realtime-response-create-params-max-response-output-tokens :refer :all]
            )
  (:import (java.io File)))


(def realtime-session-create-response-data
  {
   (ds/opt :client_secret) realtime-session-create-response-client-secret-spec
   (ds/opt :modalities) (s/coll-of string?)
   (ds/opt :instructions) string?
   (ds/opt :voice) string?
   (ds/opt :input_audio_format) string?
   (ds/opt :output_audio_format) string?
   (ds/opt :input_audio_transcription) realtime-session-input-audio-transcription-spec
   (ds/opt :turn_detection) realtime-session-create-response-turn-detection-spec
   (ds/opt :tools) (s/coll-of realtime-response-create-params-tools-inner-spec)
   (ds/opt :tool_choice) string?
   (ds/opt :temperature) float?
   (ds/opt :max_response_output_tokens) realtime-response-create-params-max-response-output-tokens-spec
   })

(def realtime-session-create-response-spec
  (ds/spec
    {:name ::realtime-session-create-response
     :spec realtime-session-create-response-data}))
