(ns open-ai-api.specs.assistant-tools-retrieval
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistant-tools-retrieval-data
  {
   (ds/req :type) string?
   })

(def assistant-tools-retrieval-spec
  (ds/spec
    {:name ::assistant-tools-retrieval
     :spec assistant-tools-retrieval-data}))
