(ns open-ai-api.specs.chat-completion-named-tool-choice
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistants-named-tool-choice-function :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-named-tool-choice-data
  {
   (ds/req :type) string?
   (ds/req :function) assistants-named-tool-choice-function-spec
   })

(def chat-completion-named-tool-choice-spec
  (ds/spec
    {:name ::chat-completion-named-tool-choice
     :spec chat-completion-named-tool-choice-data}))
