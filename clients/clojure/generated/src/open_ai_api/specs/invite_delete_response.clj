(ns open-ai-api.specs.invite-delete-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-delete-response-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   })

(def invite-delete-response-spec
  (ds/spec
    {:name ::invite-delete-response
     :spec invite-delete-response-data}))
