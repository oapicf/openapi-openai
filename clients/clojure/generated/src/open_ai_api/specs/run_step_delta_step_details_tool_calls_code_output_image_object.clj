(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-code-output-image-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-output-image-object-image :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-code-output-image-object-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :image) run-step-delta-step-details-tool-calls-code-output-image-object-image-spec
   })

(def run-step-delta-step-details-tool-calls-code-output-image-object-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-code-output-image-object
     :spec run-step-delta-step-details-tool-calls-code-output-image-object-data}))
