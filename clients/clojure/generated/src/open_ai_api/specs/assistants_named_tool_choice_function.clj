(ns open-ai-api.specs.assistants-named-tool-choice-function
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistants-named-tool-choice-function-data
  {
   (ds/req :name) string?
   })

(def assistants-named-tool-choice-function-spec
  (ds/spec
    {:name ::assistants-named-tool-choice-function
     :spec assistants-named-tool-choice-function-data}))
