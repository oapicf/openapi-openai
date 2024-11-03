(ns open-ai-api.specs.chat-completion-tool-choice-option
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-named-tool-choice-function :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-tool-choice-option-data
  {
   (ds/req :type) string?
   (ds/req :function) chat-completion-named-tool-choice-function-spec
   })

(def chat-completion-tool-choice-option-spec
  (ds/spec
    {:name ::chat-completion-tool-choice-option
     :spec chat-completion-tool-choice-option-data}))
