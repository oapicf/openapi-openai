(ns open-ai-api.specs.admin-api-keys-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def admin-api-keys-create-request-data
  {
   (ds/req :name) string?
   })

(def admin-api-keys-create-request-spec
  (ds/spec
    {:name ::admin-api-keys-create-request
     :spec admin-api-keys-create-request-data}))
