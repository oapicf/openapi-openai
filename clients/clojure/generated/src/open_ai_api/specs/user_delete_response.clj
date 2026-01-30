(ns open-ai-api.specs.user-delete-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-delete-response-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   })

(def user-delete-response-spec
  (ds/spec
    {:name ::user-delete-response
     :spec user-delete-response-data}))
