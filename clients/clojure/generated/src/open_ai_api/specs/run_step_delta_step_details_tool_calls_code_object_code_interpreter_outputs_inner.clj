(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-code-object-code-interpreter-outputs-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-output-image-object-image :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-code-object-code-interpreter-outputs-inner-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :logs) string?
   (ds/opt :image) run-step-delta-step-details-tool-calls-code-output-image-object-image-spec
   })

(def run-step-delta-step-details-tool-calls-code-object-code-interpreter-outputs-inner-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-code-object-code-interpreter-outputs-inner
     :spec run-step-delta-step-details-tool-calls-code-object-code-interpreter-outputs-inner-data}))
