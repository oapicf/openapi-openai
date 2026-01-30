(ns open-ai-api.specs.audio-response-format
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audio-response-format-data
  {
   })

(def audio-response-format-spec
  (ds/spec
    {:name ::audio-response-format
     :spec audio-response-format-data}))
