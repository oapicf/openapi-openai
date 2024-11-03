(ns open-ai-api.specs.run-step-details-tool-calls-retrieval-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-retrieval-object-data
  {
   (ds/req :id) string?
   (ds/req :type) string?
   (ds/req :retrieval) any?
   })

(def run-step-details-tool-calls-retrieval-object-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-retrieval-object
     :spec run-step-details-tool-calls-retrieval-object-data}))
