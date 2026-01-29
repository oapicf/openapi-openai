(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-retrieval-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-retrieval-object-data
  {
   (ds/req :index) int?
   (ds/opt :id) string?
   (ds/req :type) string?
   (ds/opt :retrieval) any?
   })

(def run-step-delta-step-details-tool-calls-retrieval-object-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-retrieval-object
     :spec run-step-delta-step-details-tool-calls-retrieval-object-data}))
