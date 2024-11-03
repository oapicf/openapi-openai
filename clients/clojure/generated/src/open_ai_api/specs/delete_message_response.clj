(ns open-ai-api.specs.delete-message-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-message-response-data
  {
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   (ds/req :object) string?
   })

(def delete-message-response-spec
  (ds/spec
    {:name ::delete-message-response
     :spec delete-message-response-data}))
