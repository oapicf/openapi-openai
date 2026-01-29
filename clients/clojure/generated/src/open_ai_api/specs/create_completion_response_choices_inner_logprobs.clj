(ns open-ai-api.specs.create-completion-response-choices-inner-logprobs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-completion-response-choices-inner-logprobs-data
  {
   (ds/opt :text_offset) (s/coll-of int?)
   (ds/opt :token_logprobs) (s/coll-of float?)
   (ds/opt :tokens) (s/coll-of string?)
   (ds/opt :top_logprobs) (s/coll-of (s/map-of string? float?))
   })

(def create-completion-response-choices-inner-logprobs-spec
  (ds/spec
    {:name ::create-completion-response-choices-inner-logprobs
     :spec create-completion-response-choices-inner-logprobs-data}))
