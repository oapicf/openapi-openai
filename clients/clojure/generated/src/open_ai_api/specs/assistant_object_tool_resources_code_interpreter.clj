(ns open-ai-api.specs.assistant-object-tool-resources-code-interpreter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistant-object-tool-resources-code-interpreter-data
  {
   (ds/opt :file_ids) (s/coll-of string?)
   })

(def assistant-object-tool-resources-code-interpreter-spec
  (ds/spec
    {:name ::assistant-object-tool-resources-code-interpreter
     :spec assistant-object-tool-resources-code-interpreter-data}))
