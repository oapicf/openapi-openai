(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-code-output-image-object-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-code-output-image-object-image-data
  {
   (ds/opt :file_id) string?
   })

(def run-step-delta-step-details-tool-calls-code-output-image-object-image-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-code-output-image-object-image
     :spec run-step-delta-step-details-tool-calls-code-output-image-object-image-data}))