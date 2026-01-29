(ns open-ai-api.specs.chat-completion-token-logprob-top-logprobs-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-token-logprob-top-logprobs-inner-data
  {
   (ds/req :token) string?
   (ds/req :logprob) float?
   (ds/req :bytes) (s/coll-of int?)
   })

(def chat-completion-token-logprob-top-logprobs-inner-spec
  (ds/spec
    {:name ::chat-completion-token-logprob-top-logprobs-inner
     :spec chat-completion-token-logprob-top-logprobs-inner-data}))
