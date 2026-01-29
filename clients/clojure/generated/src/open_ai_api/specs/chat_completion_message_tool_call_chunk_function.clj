(ns open-ai-api.specs.chat-completion-message-tool-call-chunk-function
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-message-tool-call-chunk-function-data
  {
   (ds/opt :name) string?
   (ds/opt :arguments) string?
   })

(def chat-completion-message-tool-call-chunk-function-spec
  (ds/spec
    {:name ::chat-completion-message-tool-call-chunk-function
     :spec chat-completion-message-tool-call-chunk-function-data}))
