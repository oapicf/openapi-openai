(ns open-ai-api.specs.fine-tune-preference-request-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tune-preference-request-input-input :refer :all]
            [open-ai-api.specs.fine-tune-preference-request-input-preferred-completion-inner :refer :all]
            [open-ai-api.specs.fine-tune-preference-request-input-preferred-completion-inner :refer :all]
            )
  (:import (java.io File)))


(def fine-tune-preference-request-input-data
  {
   (ds/opt :input) fine-tune-preference-request-input-input-spec
   (ds/opt :preferred_completion) (s/coll-of fine-tune-preference-request-input-preferred-completion-inner-spec)
   (ds/opt :non_preferred_completion) (s/coll-of fine-tune-preference-request-input-preferred-completion-inner-spec)
   })

(def fine-tune-preference-request-input-spec
  (ds/spec
    {:name ::fine-tune-preference-request-input
     :spec fine-tune-preference-request-input-data}))
