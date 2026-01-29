(ns open-ai-api.specs.delete-model-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-model-response-data
  {
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   (ds/req :object) string?
   })

(def delete-model-response-spec
  (ds/spec
    {:name ::delete-model-response
     :spec delete-model-response-data}))
