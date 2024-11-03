(ns open-ai-api.specs.create-completion-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-completion-request-model :refer :all]
            [open-ai-api.specs.create-completion-request-prompt :refer :all]
            [open-ai-api.specs.create-completion-request-stop :refer :all]
            )
  (:import (java.io File)))


(def create-completion-request-data
  {
   (ds/req :model) create-completion-request-model-spec
   (ds/req :prompt) create-completion-request-prompt-spec
   (ds/opt :best_of) int?
   (ds/opt :echo) boolean?
   (ds/opt :frequency_penalty) float?
   (ds/opt :logit_bias) (s/map-of string? int?)
   (ds/opt :logprobs) int?
   (ds/opt :max_tokens) int?
   (ds/opt :n) int?
   (ds/opt :presence_penalty) float?
   (ds/opt :seed) int?
   (ds/opt :stop) create-completion-request-stop-spec
   (ds/opt :stream) boolean?
   (ds/opt :suffix) string?
   (ds/opt :temperature) float?
   (ds/opt :top_p) float?
   (ds/opt :user) string?
   })

(def create-completion-request-spec
  (ds/spec
    {:name ::create-completion-request
     :spec create-completion-request-data}))
