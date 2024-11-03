(ns open-ai-api.specs.assistant-tools-code
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistant-tools-code-data
  {
   (ds/req :type) string?
   })

(def assistant-tools-code-spec
  (ds/spec
    {:name ::assistant-tools-code
     :spec assistant-tools-code-data}))
