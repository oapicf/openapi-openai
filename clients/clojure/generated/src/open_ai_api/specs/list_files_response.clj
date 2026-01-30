(ns open-ai-api.specs.list-files-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.open-ai-file :refer :all]
            )
  (:import (java.io File)))


(def list-files-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of open-ai-file-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-files-response-spec
  (ds/spec
    {:name ::list-files-response
     :spec list-files-response-data}))
