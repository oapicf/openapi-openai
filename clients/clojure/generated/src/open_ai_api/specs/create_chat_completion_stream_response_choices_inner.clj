(ns open-ai-api.specs.create-chat-completion-stream-response-choices-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-stream-response-delta :refer :all]
            [open-ai-api.specs.create-chat-completion-response-choices-inner-logprobs :refer :all]
            )
  (:import (java.io File)))


(def create-chat-completion-stream-response-choices-inner-data
  {
   (ds/req :delta) chat-completion-stream-response-delta-spec
   (ds/opt :logprobs) create-chat-completion-response-choices-inner-logprobs-spec
   (ds/req :finish_reason) string?
   (ds/req :index) int?
   })

(def create-chat-completion-stream-response-choices-inner-spec
  (ds/spec
    {:name ::create-chat-completion-stream-response-choices-inner
     :spec create-chat-completion-stream-response-choices-inner-data}))
