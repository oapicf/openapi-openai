(ns open-ai-api.specs.submit-tool-outputs-run-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.submit-tool-outputs-run-request-tool-outputs-inner :refer :all]
            )
  (:import (java.io File)))


(def submit-tool-outputs-run-request-data
  {
   (ds/req :tool_outputs) (s/coll-of submit-tool-outputs-run-request-tool-outputs-inner-spec)
   (ds/opt :stream) boolean?
   })

(def submit-tool-outputs-run-request-spec
  (ds/spec
    {:name ::submit-tool-outputs-run-request
     :spec submit-tool-outputs-run-request-data}))
