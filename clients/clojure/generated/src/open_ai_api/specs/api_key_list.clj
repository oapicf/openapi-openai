(ns open-ai-api.specs.api-key-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.admin-api-key :refer :all]
            )
  (:import (java.io File)))


(def api-key-list-data
  {
   (ds/opt :object) string?
   (ds/opt :data) (s/coll-of admin-api-key-spec)
   (ds/opt :has_more) boolean?
   (ds/opt :first_id) string?
   (ds/opt :last_id) string?
   })

(def api-key-list-spec
  (ds/spec
    {:name ::api-key-list
     :spec api-key-list-data}))
