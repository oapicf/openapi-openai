(ns open-ai-api.specs.assistant-file-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistant-file-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :created_at) int?
   (ds/req :assistant_id) string?
   })

(def assistant-file-object-spec
  (ds/spec
    {:name ::assistant-file-object
     :spec assistant-file-object-data}))
