(ns open-ai-api.specs.user-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.user :refer :all]
            )
  (:import (java.io File)))


(def user-list-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of user-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def user-list-response-spec
  (ds/spec
    {:name ::user-list-response
     :spec user-list-response-data}))
