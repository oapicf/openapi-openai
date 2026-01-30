(ns open-ai-api.specs.delete-vector-store-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-vector-store-response-data
  {
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   (ds/req :object) string?
   })

(def delete-vector-store-response-spec
  (ds/spec
    {:name ::delete-vector-store-response
     :spec delete-vector-store-response-data}))
