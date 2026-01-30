(ns open-ai-api.specs.realtime-session-create-response-client-secret
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-session-create-response-client-secret-data
  {
   (ds/opt :value) string?
   (ds/opt :expires_at) int?
   })

(def realtime-session-create-response-client-secret-spec
  (ds/spec
    {:name ::realtime-session-create-response-client-secret
     :spec realtime-session-create-response-client-secret-data}))
