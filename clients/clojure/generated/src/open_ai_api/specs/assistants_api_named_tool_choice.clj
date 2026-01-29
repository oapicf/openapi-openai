(ns open-ai-api.specs.assistants-api-named-tool-choice
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-named-tool-choice-function :refer :all]
            )
  (:import (java.io File)))


(def assistants-api-named-tool-choice-data
  {
   (ds/req :type) string?
   (ds/opt :function) chat-completion-named-tool-choice-function-spec
   })

(def assistants-api-named-tool-choice-spec
  (ds/spec
    {:name ::assistants-api-named-tool-choice
     :spec assistants-api-named-tool-choice-data}))
