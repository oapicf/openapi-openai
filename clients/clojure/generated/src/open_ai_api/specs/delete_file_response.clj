(ns open-ai-api.specs.delete-file-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-file-response-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :deleted) boolean?
   })

(def delete-file-response-spec
  (ds/spec
    {:name ::delete-file-response
     :spec delete-file-response-data}))
