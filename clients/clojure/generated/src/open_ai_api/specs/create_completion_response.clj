(ns open-ai-api.specs.create-completion-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-completion-response-choices-inner :refer :all]
            [open-ai-api.specs.completion-usage :refer :all]
            )
  (:import (java.io File)))


(def create-completion-response-data
  {
   (ds/req :id) string?
   (ds/req :choices) (s/coll-of create-completion-response-choices-inner-spec)
   (ds/req :created) int?
   (ds/req :model) string?
   (ds/opt :system_fingerprint) string?
   (ds/req :object) string?
   (ds/opt :usage) completion-usage-spec
   })

(def create-completion-response-spec
  (ds/spec
    {:name ::create-completion-response
     :spec create-completion-response-data}))
