(ns open-ai-api.specs.audit-log-login-failed
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-login-failed-data
  {
   (ds/opt :error_code) string?
   (ds/opt :error_message) string?
   })

(def audit-log-login-failed-spec
  (ds/spec
    {:name ::audit-log-login-failed
     :spec audit-log-login-failed-data}))
