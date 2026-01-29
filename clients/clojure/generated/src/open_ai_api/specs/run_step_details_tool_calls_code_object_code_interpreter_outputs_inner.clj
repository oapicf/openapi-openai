(ns open-ai-api.specs.run-step-details-tool-calls-code-object-code-interpreter-outputs-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-tool-calls-code-output-image-object-image :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-code-object-code-interpreter-outputs-inner-data
  {
   (ds/req :type) string?
   (ds/req :logs) string?
   (ds/req :image) run-step-details-tool-calls-code-output-image-object-image-spec
   })

(def run-step-details-tool-calls-code-object-code-interpreter-outputs-inner-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-code-object-code-interpreter-outputs-inner
     :spec run-step-details-tool-calls-code-object-code-interpreter-outputs-inner-data}))
