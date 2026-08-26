(ns open-ai-api.specs.audit-log-actor
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-actor-session :refer :all]
            [open-ai-api.specs.audit-log-actor-api-key :refer :all]
            )
  (:import (java.io File)))


(def audit-log-actor-data
  {
   (ds/opt :type) string?
   (ds/opt :session) audit-log-actor-session-spec
   (ds/opt :api_key) audit-log-actor-api-key-spec
   })

(def audit-log-actor-spec
  (ds/spec
    {:name ::audit-log-actor
     :spec audit-log-actor-data}))
