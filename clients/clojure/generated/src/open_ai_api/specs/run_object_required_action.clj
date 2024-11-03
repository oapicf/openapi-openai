(ns open-ai-api.specs.run-object-required-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-object-required-action-submit-tool-outputs :refer :all]
            )
  (:import (java.io File)))


(def run-object-required-action-data
  {
   (ds/req :type) string?
   (ds/req :submit_tool_outputs) run-object-required-action-submit-tool-outputs-spec
   })

(def run-object-required-action-spec
  (ds/spec
    {:name ::run-object-required-action
     :spec run-object-required-action-data}))
