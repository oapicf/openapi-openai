(ns open-ai-api.specs.run-object-incomplete-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-object-incomplete-details-data
  {
   (ds/opt :reason) string?
   })

(def run-object-incomplete-details-spec
  (ds/spec
    {:name ::run-object-incomplete-details
     :spec run-object-incomplete-details-data}))
