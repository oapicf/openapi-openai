(ns open-ai-api.specs.create-completion-response-choices-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-completion-response-choices-inner-logprobs :refer :all]
            )
  (:import (java.io File)))


(def create-completion-response-choices-inner-data
  {
   (ds/req :finish_reason) string?
   (ds/req :index) int?
   (ds/req :logprobs) create-completion-response-choices-inner-logprobs-spec
   (ds/req :text) string?
   })

(def create-completion-response-choices-inner-spec
  (ds/spec
    {:name ::create-completion-response-choices-inner
     :spec create-completion-response-choices-inner-data}))
