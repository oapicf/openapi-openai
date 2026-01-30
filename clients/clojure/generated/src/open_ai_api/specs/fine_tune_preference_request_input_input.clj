(ns open-ai-api.specs.fine-tune-preference-request-input-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tune-chat-request-input-messages-inner :refer :all]
            [open-ai-api.specs.chat-completion-tool :refer :all]
            )
  (:import (java.io File)))


(def fine-tune-preference-request-input-input-data
  {
   (ds/opt :messages) (s/coll-of fine-tune-chat-request-input-messages-inner-spec)
   (ds/opt :tools) (s/coll-of chat-completion-tool-spec)
   (ds/opt :parallel_tool_calls) boolean?
   })

(def fine-tune-preference-request-input-input-spec
  (ds/spec
    {:name ::fine-tune-preference-request-input-input
     :spec fine-tune-preference-request-input-input-data}))
