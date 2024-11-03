(ns open-ai-api.specs.delete-assistant-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-assistant-response-data
  {
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   (ds/req :object) string?
   })

(def delete-assistant-response-spec
  (ds/spec
    {:name ::delete-assistant-response
     :spec delete-assistant-response-data}))
