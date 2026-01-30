(ns open-ai-api.specs.assistants-named-tool-choice
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistants-named-tool-choice-function :refer :all]
            )
  (:import (java.io File)))


(def assistants-named-tool-choice-data
  {
   (ds/req :type) string?
   (ds/opt :function) assistants-named-tool-choice-function-spec
   })

(def assistants-named-tool-choice-spec
  (ds/spec
    {:name ::assistants-named-tool-choice
     :spec assistants-named-tool-choice-data}))
