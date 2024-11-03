(ns open-ai-api.specs.list-assistants-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistant-object :refer :all]
            )
  (:import (java.io File)))


(def list-assistants-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of assistant-object-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-assistants-response-spec
  (ds/spec
    {:name ::list-assistants-response
     :spec list-assistants-response-data}))
