(ns open-ai-api.specs.submit-tool-outputs-run-request-tool-outputs-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def submit-tool-outputs-run-request-tool-outputs-inner-data
  {
   (ds/opt :tool_call_id) string?
   (ds/opt :output) string?
   })

(def submit-tool-outputs-run-request-tool-outputs-inner-spec
  (ds/spec
    {:name ::submit-tool-outputs-run-request-tool-outputs-inner
     :spec submit-tool-outputs-run-request-tool-outputs-inner-data}))
