(ns open-ai-api.specs.chat-completion-functions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.any-type :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-functions-data
  {
   (ds/opt :description) string?
   (ds/req :name) string?
   (ds/opt :parameters) (s/map-of string? s/any?)
   })

(def chat-completion-functions-spec
  (ds/spec
    {:name ::chat-completion-functions
     :spec chat-completion-functions-data}))
