(ns open-ai-api.specs.chat-completion-message-tool-call-chunk
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-message-tool-call-chunk-function :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-message-tool-call-chunk-data
  {
   (ds/req :index) int?
   (ds/opt :id) string?
   (ds/opt :type) string?
   (ds/opt :function) chat-completion-message-tool-call-chunk-function-spec
   })

(def chat-completion-message-tool-call-chunk-spec
  (ds/spec
    {:name ::chat-completion-message-tool-call-chunk
     :spec chat-completion-message-tool-call-chunk-data}))
