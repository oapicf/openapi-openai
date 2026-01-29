(ns open-ai-api.specs.run-step-object-last-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-object-last-error-data
  {
   (ds/req :code) string?
   (ds/req :message) string?
   })

(def run-step-object-last-error-spec
  (ds/spec
    {:name ::run-step-object-last-error
     :spec run-step-object-last-error-data}))
