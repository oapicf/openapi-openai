(ns open-ai-api.specs.chat-completion-stream-response-delta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-stream-response-delta-function-call :refer :all]
            [open-ai-api.specs.chat-completion-message-tool-call-chunk :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-stream-response-delta-data
  {
   (ds/opt :content) string?
   (ds/opt :function_call) chat-completion-stream-response-delta-function-call-spec
   (ds/opt :tool_calls) (s/coll-of chat-completion-message-tool-call-chunk-spec)
   (ds/opt :role) string?
   })

(def chat-completion-stream-response-delta-spec
  (ds/spec
    {:name ::chat-completion-stream-response-delta
     :spec chat-completion-stream-response-delta-data}))
