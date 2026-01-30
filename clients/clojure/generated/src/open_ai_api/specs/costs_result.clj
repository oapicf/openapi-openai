(ns open-ai-api.specs.costs-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.costs-result-amount :refer :all]
            )
  (:import (java.io File)))


(def costs-result-data
  {
   (ds/req :object) string?
   (ds/opt :amount) costs-result-amount-spec
   (ds/opt :line_item) string?
   (ds/opt :project_id) string?
   })

(def costs-result-spec
  (ds/spec
    {:name ::costs-result
     :spec costs-result-data}))
