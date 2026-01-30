(ns open-ai-api.specs.completion-usage-prompt-tokens-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def completion-usage-prompt-tokens-details-data
  {
   (ds/opt :audio_tokens) int?
   (ds/opt :cached_tokens) int?
   })

(def completion-usage-prompt-tokens-details-spec
  (ds/spec
    {:name ::completion-usage-prompt-tokens-details
     :spec completion-usage-prompt-tokens-details-data}))
