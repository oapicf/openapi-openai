(ns open-ai-api.specs.batch-errors-data-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def batch-errors-data-inner-data
  {
   (ds/opt :code) string?
   (ds/opt :message) string?
   (ds/opt :param) string?
   (ds/opt :line) int?
   })

(def batch-errors-data-inner-spec
  (ds/spec
    {:name ::batch-errors-data-inner
     :spec batch-errors-data-inner-data}))
