(ns open-ai-api.specs.list-assistant-files-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistant-file-object :refer :all]
            )
  (:import (java.io File)))


(def list-assistant-files-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of assistant-file-object-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-assistant-files-response-spec
  (ds/spec
    {:name ::list-assistant-files-response
     :spec list-assistant-files-response-data}))
