(ns open-ai-api.specs.run-tool-call-object-function
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-tool-call-object-function-data
  {
   (ds/req :name) string?
   (ds/req :arguments) string?
   })

(def run-tool-call-object-function-spec
  (ds/spec
    {:name ::run-tool-call-object-function
     :spec run-tool-call-object-function-data}))
