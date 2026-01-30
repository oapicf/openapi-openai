(ns open-ai-api.specs.project
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :name) string?
   (ds/req :created_at) int?
   (ds/opt :archived_at) int?
   (ds/req :status) string?
   })

(def project-spec
  (ds/spec
    {:name ::project
     :spec project-data}))
