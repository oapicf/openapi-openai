(ns open-ai-api.specs.chat-completion-role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-role-data
  {
   })

(def chat-completion-role-spec
  (ds/spec
    {:name ::chat-completion-role
     :spec chat-completion-role-data}))
