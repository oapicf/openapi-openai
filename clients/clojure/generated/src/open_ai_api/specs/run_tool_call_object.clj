(ns open-ai-api.specs.run-tool-call-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-tool-call-object-function :refer :all]
            )
  (:import (java.io File)))


(def run-tool-call-object-data
  {
   (ds/req :id) string?
   (ds/req :type) string?
   (ds/req :function) run-tool-call-object-function-spec
   })

(def run-tool-call-object-spec
  (ds/spec
    {:name ::run-tool-call-object
     :spec run-tool-call-object-data}))
