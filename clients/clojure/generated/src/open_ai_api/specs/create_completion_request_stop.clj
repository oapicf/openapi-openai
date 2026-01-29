(ns open-ai-api.specs.create-completion-request-stop
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-completion-request-stop-data
  {
   })

(def create-completion-request-stop-spec
  (ds/spec
    {:name ::create-completion-request-stop
     :spec create-completion-request-stop-data}))
