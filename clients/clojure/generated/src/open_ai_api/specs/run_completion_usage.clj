(ns open-ai-api.specs.run-completion-usage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-completion-usage-data
  {
   (ds/req :completion_tokens) int?
   (ds/req :prompt_tokens) int?
   (ds/req :total_tokens) int?
   })

(def run-completion-usage-spec
  (ds/spec
    {:name ::run-completion-usage
     :spec run-completion-usage-data}))
