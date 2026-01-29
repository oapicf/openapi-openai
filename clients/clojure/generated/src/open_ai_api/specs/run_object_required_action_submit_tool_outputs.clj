(ns open-ai-api.specs.run-object-required-action-submit-tool-outputs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-tool-call-object :refer :all]
            )
  (:import (java.io File)))


(def run-object-required-action-submit-tool-outputs-data
  {
   (ds/req :tool_calls) (s/coll-of run-tool-call-object-spec)
   })

(def run-object-required-action-submit-tool-outputs-spec
  (ds/spec
    {:name ::run-object-required-action-submit-tool-outputs
     :spec run-object-required-action-submit-tool-outputs-data}))
