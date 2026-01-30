(ns open-ai-api.specs.create-chat-completion-request-audio
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-chat-completion-request-audio-data
  {
   (ds/req :voice) string?
   (ds/req :format) string?
   })

(def create-chat-completion-request-audio-spec
  (ds/spec
    {:name ::create-chat-completion-request-audio
     :spec create-chat-completion-request-audio-data}))
