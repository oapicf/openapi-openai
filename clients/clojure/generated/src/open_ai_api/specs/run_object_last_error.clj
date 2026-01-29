(ns open-ai-api.specs.run-object-last-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-object-last-error-data
  {
   (ds/req :code) string?
   (ds/req :message) string?
   })

(def run-object-last-error-spec
  (ds/spec
    {:name ::run-object-last-error
     :spec run-object-last-error-data}))
