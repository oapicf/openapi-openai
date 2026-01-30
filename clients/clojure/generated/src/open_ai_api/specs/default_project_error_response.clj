(ns open-ai-api.specs.default-project-error-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def default-project-error-response-data
  {
   (ds/req :code) int?
   (ds/req :message) string?
   })

(def default-project-error-response-spec
  (ds/spec
    {:name ::default-project-error-response
     :spec default-project-error-response-data}))
