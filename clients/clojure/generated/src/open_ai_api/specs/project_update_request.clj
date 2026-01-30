(ns open-ai-api.specs.project-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-update-request-data
  {
   (ds/req :name) string?
   })

(def project-update-request-spec
  (ds/spec
    {:name ::project-update-request
     :spec project-update-request-data}))
