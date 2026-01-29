(ns open-ai-api.specs.chat-completion-tool
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.function-object :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-tool-data
  {
   (ds/req :type) string?
   (ds/req :function) function-object-spec
   })

(def chat-completion-tool-spec
  (ds/spec
    {:name ::chat-completion-tool
     :spec chat-completion-tool-data}))
