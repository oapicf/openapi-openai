(ns open-ai-api.specs.completion-usage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def completion-usage-data
  {
   (ds/req :completion_tokens) int?
   (ds/req :prompt_tokens) int?
   (ds/req :total_tokens) int?
   })

(def completion-usage-spec
  (ds/spec
    {:name ::completion-usage
     :spec completion-usage-data}))
