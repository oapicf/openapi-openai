(ns open-ai-api.specs.create-assistant-request-tool-resources-code-interpreter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-assistant-request-tool-resources-code-interpreter-data
  {
   (ds/opt :file_ids) (s/coll-of string?)
   })

(def create-assistant-request-tool-resources-code-interpreter-spec
  (ds/spec
    {:name ::create-assistant-request-tool-resources-code-interpreter
     :spec create-assistant-request-tool-resources-code-interpreter-data}))
