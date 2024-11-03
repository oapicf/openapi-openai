(ns open-ai-api.specs.chat-completion-function-call-option
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-function-call-option-data
  {
   (ds/req :name) string?
   })

(def chat-completion-function-call-option-spec
  (ds/spec
    {:name ::chat-completion-function-call-option
     :spec chat-completion-function-call-option-data}))
