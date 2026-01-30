(ns open-ai-api.specs.completion-usage-completion-tokens-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def completion-usage-completion-tokens-details-data
  {
   (ds/opt :accepted_prediction_tokens) int?
   (ds/opt :audio_tokens) int?
   (ds/opt :reasoning_tokens) int?
   (ds/opt :rejected_prediction_tokens) int?
   })

(def completion-usage-completion-tokens-details-spec
  (ds/spec
    {:name ::completion-usage-completion-tokens-details
     :spec completion-usage-completion-tokens-details-data}))
