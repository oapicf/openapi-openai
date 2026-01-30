(ns open-ai-api.specs.completion-usage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.completion-usage-completion-tokens-details :refer :all]
            [open-ai-api.specs.completion-usage-prompt-tokens-details :refer :all]
            )
  (:import (java.io File)))


(def completion-usage-data
  {
   (ds/req :completion_tokens) int?
   (ds/req :prompt_tokens) int?
   (ds/req :total_tokens) int?
   (ds/opt :completion_tokens_details) completion-usage-completion-tokens-details-spec
   (ds/opt :prompt_tokens_details) completion-usage-prompt-tokens-details-spec
   })

(def completion-usage-spec
  (ds/spec
    {:name ::completion-usage
     :spec completion-usage-data}))
