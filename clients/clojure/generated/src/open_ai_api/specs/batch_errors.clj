(ns open-ai-api.specs.batch-errors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.batch-errors-data-inner :refer :all]
            )
  (:import (java.io File)))


(def batch-errors-data
  {
   (ds/opt :object) string?
   (ds/opt :data) (s/coll-of batch-errors-data-inner-spec)
   })

(def batch-errors-spec
  (ds/spec
    {:name ::batch-errors
     :spec batch-errors-data}))
