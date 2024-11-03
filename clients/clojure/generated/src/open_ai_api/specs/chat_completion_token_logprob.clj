(ns open-ai-api.specs.chat-completion-token-logprob
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-token-logprob-top-logprobs-inner :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-token-logprob-data
  {
   (ds/req :token) string?
   (ds/req :logprob) float?
   (ds/req :bytes) (s/coll-of int?)
   (ds/req :top_logprobs) (s/coll-of chat-completion-token-logprob-top-logprobs-inner-spec)
   })

(def chat-completion-token-logprob-spec
  (ds/spec
    {:name ::chat-completion-token-logprob
     :spec chat-completion-token-logprob-data}))
