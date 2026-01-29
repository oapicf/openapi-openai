(ns open-ai-api.specs.chat-completion-stream-response-delta-function-call
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-stream-response-delta-function-call-data
  {
   (ds/opt :arguments) string?
   (ds/opt :name) string?
   })

(def chat-completion-stream-response-delta-function-call-spec
  (ds/spec
    {:name ::chat-completion-stream-response-delta-function-call
     :spec chat-completion-stream-response-delta-function-call-data}))
