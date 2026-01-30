(ns open-ai-api.specs.realtime-response-create-params-conversation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-response-create-params-conversation-data
  {
   })

(def realtime-response-create-params-conversation-spec
  (ds/spec
    {:name ::realtime-response-create-params-conversation
     :spec realtime-response-create-params-conversation-data}))
