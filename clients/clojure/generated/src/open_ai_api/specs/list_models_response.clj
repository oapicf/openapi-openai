(ns open-ai-api.specs.list-models-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.model :refer :all]
            )
  (:import (java.io File)))


(def list-models-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of model-spec)
   })

(def list-models-response-spec
  (ds/spec
    {:name ::list-models-response
     :spec list-models-response-data}))
