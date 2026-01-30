(ns open-ai-api.specs.user-role-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-role-update-request-data
  {
   (ds/req :role) string?
   })

(def user-role-update-request-spec
  (ds/spec
    {:name ::user-role-update-request
     :spec user-role-update-request-data}))
