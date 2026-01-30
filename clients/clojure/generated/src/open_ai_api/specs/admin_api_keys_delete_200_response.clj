(ns open-ai-api.specs.admin-api-keys-delete-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def admin-api-keys-delete-200-response-data
  {
   (ds/opt :id) string?
   (ds/opt :object) string?
   (ds/opt :deleted) boolean?
   })

(def admin-api-keys-delete-200-response-spec
  (ds/spec
    {:name ::admin-api-keys-delete-200-response
     :spec admin-api-keys-delete-200-response-data}))
