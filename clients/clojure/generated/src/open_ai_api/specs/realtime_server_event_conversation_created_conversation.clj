(ns open-ai-api.specs.realtime-server-event-conversation-created-conversation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-conversation-created-conversation-data
  {
   (ds/opt :id) string?
   (ds/opt :object) string?
   })

(def realtime-server-event-conversation-created-conversation-spec
  (ds/spec
    {:name ::realtime-server-event-conversation-created-conversation
     :spec realtime-server-event-conversation-created-conversation-data}))
