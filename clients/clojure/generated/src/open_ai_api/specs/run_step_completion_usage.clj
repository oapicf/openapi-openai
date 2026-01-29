(ns open-ai-api.specs.run-step-completion-usage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-completion-usage-data
  {
   (ds/req :completion_tokens) int?
   (ds/req :prompt_tokens) int?
   (ds/req :total_tokens) int?
   })

(def run-step-completion-usage-spec
  (ds/spec
    {:name ::run-step-completion-usage
     :spec run-step-completion-usage-data}))
