(ns open-ai-api.specs.assistants-api-tool-choice-option
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-named-tool-choice-function :refer :all]
            )
  (:import (java.io File)))


(def assistants-api-tool-choice-option-data
  {
   (ds/req :type) string?
   (ds/opt :function) chat-completion-named-tool-choice-function-spec
   })

(def assistants-api-tool-choice-option-spec
  (ds/spec
    {:name ::assistants-api-tool-choice-option
     :spec assistants-api-tool-choice-option-data}))
