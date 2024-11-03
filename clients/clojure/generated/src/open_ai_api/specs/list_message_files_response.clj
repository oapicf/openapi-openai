(ns open-ai-api.specs.list-message-files-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-file-object :refer :all]
            )
  (:import (java.io File)))


(def list-message-files-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of message-file-object-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-message-files-response-spec
  (ds/spec
    {:name ::list-message-files-response
     :spec list-message-files-response-data}))
