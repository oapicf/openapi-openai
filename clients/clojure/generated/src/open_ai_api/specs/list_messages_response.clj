(ns open-ai-api.specs.list-messages-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-object :refer :all]
            )
  (:import (java.io File)))


(def list-messages-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of message-object-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-messages-response-spec
  (ds/spec
    {:name ::list-messages-response
     :spec list-messages-response-data}))
