(ns open-ai-api.specs.realtime-response-create-params
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-response-create-params-tools-inner :refer :all]
            [open-ai-api.specs.realtime-response-create-params-max-response-output-tokens :refer :all]
            [open-ai-api.specs.realtime-response-create-params-conversation :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.realtime-conversation-item :refer :all]
            )
  (:import (java.io File)))


(def realtime-response-create-params-data
  {
   (ds/opt :modalities) (s/coll-of string?)
   (ds/opt :instructions) string?
   (ds/opt :voice) string?
   (ds/opt :output_audio_format) string?
   (ds/opt :tools) (s/coll-of realtime-response-create-params-tools-inner-spec)
   (ds/opt :tool_choice) string?
   (ds/opt :temperature) float?
   (ds/opt :max_response_output_tokens) realtime-response-create-params-max-response-output-tokens-spec
   (ds/opt :conversation) realtime-response-create-params-conversation-spec
   (ds/opt :metadata) any?
   (ds/opt :input) (s/coll-of realtime-conversation-item-spec)
   })

(def realtime-response-create-params-spec
  (ds/spec
    {:name ::realtime-response-create-params
     :spec realtime-response-create-params-data}))
