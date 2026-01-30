(ns open-ai-api.specs.costs-result-amount
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def costs-result-amount-data
  {
   (ds/opt :value) float?
   (ds/opt :currency) string?
   })

(def costs-result-amount-spec
  (ds/spec
    {:name ::costs-result-amount
     :spec costs-result-amount-data}))
