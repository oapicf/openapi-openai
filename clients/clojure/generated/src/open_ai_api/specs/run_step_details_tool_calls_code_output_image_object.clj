(ns open-ai-api.specs.run-step-details-tool-calls-code-output-image-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-tool-calls-code-output-image-object-image :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-code-output-image-object-data
  {
   (ds/req :type) string?
   (ds/req :image) run-step-details-tool-calls-code-output-image-object-image-spec
   })

(def run-step-details-tool-calls-code-output-image-object-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-code-output-image-object
     :spec run-step-details-tool-calls-code-output-image-object-data}))
