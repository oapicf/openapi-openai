(ns open-ai-api.specs.chat-completion-named-tool-choice-function
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-named-tool-choice-function-data
  {
   (ds/req :name) string?
   })

(def chat-completion-named-tool-choice-function-spec
  (ds/spec
    {:name ::chat-completion-named-tool-choice-function
     :spec chat-completion-named-tool-choice-function-data}))
