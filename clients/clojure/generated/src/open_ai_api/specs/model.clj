(ns open-ai-api.specs.model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def model-data
  {
   (ds/req :id) string?
   (ds/req :created) int?
   (ds/req :object) string?
   (ds/req :owned_by) string?
   })

(def model-spec
  (ds/spec
    {:name ::model
     :spec model-data}))
