(ns open-ai-api.specs.delete-thread-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-thread-response-data
  {
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   (ds/req :object) string?
   })

(def delete-thread-response-spec
  (ds/spec
    {:name ::delete-thread-response
     :spec delete-thread-response-data}))
