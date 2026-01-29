(ns open-ai-api.specs.create-chat-completion-response-choices-inner-logprobs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-token-logprob :refer :all]
            )
  (:import (java.io File)))


(def create-chat-completion-response-choices-inner-logprobs-data
  {
   (ds/req :content) (s/coll-of chat-completion-token-logprob-spec)
   })

(def create-chat-completion-response-choices-inner-logprobs-spec
  (ds/spec
    {:name ::create-chat-completion-response-choices-inner-logprobs
     :spec create-chat-completion-response-choices-inner-logprobs-data}))
