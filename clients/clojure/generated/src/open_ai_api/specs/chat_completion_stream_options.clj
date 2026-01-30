(ns open-ai-api.specs.chat-completion-stream-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-stream-options-data
  {
   (ds/opt :include_usage) boolean?
   })

(def chat-completion-stream-options-spec
  (ds/spec
    {:name ::chat-completion-stream-options
     :spec chat-completion-stream-options-data}))
