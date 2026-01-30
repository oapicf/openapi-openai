(ns open-ai-api.specs.invite-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.invite :refer :all]
            )
  (:import (java.io File)))


(def invite-list-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of invite-spec)
   (ds/opt :first_id) string?
   (ds/opt :last_id) string?
   (ds/opt :has_more) boolean?
   })

(def invite-list-response-spec
  (ds/spec
    {:name ::invite-list-response
     :spec invite-list-response-data}))
