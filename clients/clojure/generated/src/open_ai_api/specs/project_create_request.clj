(ns open-ai-api.specs.project-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-create-request-data
  {
   (ds/req :name) string?
   })

(def project-create-request-spec
  (ds/spec
    {:name ::project-create-request
     :spec project-create-request-data}))
