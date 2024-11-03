(ns open-ai-api.specs.delete-assistant-file-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-assistant-file-response-data
  {
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   (ds/req :object) string?
   })

(def delete-assistant-file-response-spec
  (ds/spec
    {:name ::delete-assistant-file-response
     :spec delete-assistant-file-response-data}))
