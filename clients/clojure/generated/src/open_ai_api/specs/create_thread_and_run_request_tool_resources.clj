(ns open-ai-api.specs.create-thread-and-run-request-tool-resources
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-assistant-request-tool-resources-code-interpreter :refer :all]
            [open-ai-api.specs.assistant-object-tool-resources-file-search :refer :all]
            )
  (:import (java.io File)))


(def create-thread-and-run-request-tool-resources-data
  {
   (ds/opt :code_interpreter) create-assistant-request-tool-resources-code-interpreter-spec
   (ds/opt :file_search) assistant-object-tool-resources-file-search-spec
   })

(def create-thread-and-run-request-tool-resources-spec
  (ds/spec
    {:name ::create-thread-and-run-request-tool-resources
     :spec create-thread-and-run-request-tool-resources-data}))
