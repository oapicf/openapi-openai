(ns open-ai-api.specs.fine-tune-completion-request-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fine-tune-completion-request-input-data
  {
   (ds/opt :prompt) string?
   (ds/opt :completion) string?
   })

(def fine-tune-completion-request-input-spec
  (ds/spec
    {:name ::fine-tune-completion-request-input
     :spec fine-tune-completion-request-input-data}))
