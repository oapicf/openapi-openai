(ns open-ai-api.specs.fine-tune-chat-request-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tune-chat-request-input-messages-inner :refer :all]
            [open-ai-api.specs.chat-completion-tool :refer :all]
            [open-ai-api.specs.chat-completion-functions :refer :all]
            )
  (:import (java.io File)))


(def fine-tune-chat-request-input-data
  {
   (ds/opt :messages) (s/coll-of fine-tune-chat-request-input-messages-inner-spec)
   (ds/opt :tools) (s/coll-of chat-completion-tool-spec)
   (ds/opt :parallel_tool_calls) boolean?
   (ds/opt :functions) (s/coll-of chat-completion-functions-spec)
   })

(def fine-tune-chat-request-input-spec
  (ds/spec
    {:name ::fine-tune-chat-request-input
     :spec fine-tune-chat-request-input-data}))
