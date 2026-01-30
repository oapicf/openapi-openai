(ns open-ai-api.specs.usage-vector-stores-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def usage-vector-stores-result-data
  {
   (ds/req :object) string?
   (ds/req :usage_bytes) int?
   (ds/opt :project_id) string?
   })

(def usage-vector-stores-result-spec
  (ds/spec
    {:name ::usage-vector-stores-result
     :spec usage-vector-stores-result-data}))
