(ns open-ai-api.specs.create-completion-request-prompt
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-completion-request-prompt-data
  {
   })

(def create-completion-request-prompt-spec
  (ds/spec
    {:name ::create-completion-request-prompt
     :spec create-completion-request-prompt-data}))
