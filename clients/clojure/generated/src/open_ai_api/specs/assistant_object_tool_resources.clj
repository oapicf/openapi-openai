(ns open-ai-api.specs.assistant-object-tool-resources
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistant-object-tool-resources-code-interpreter :refer :all]
            [open-ai-api.specs.assistant-object-tool-resources-file-search :refer :all]
            )
  (:import (java.io File)))


(def assistant-object-tool-resources-data
  {
   (ds/opt :code_interpreter) assistant-object-tool-resources-code-interpreter-spec
   (ds/opt :file_search) assistant-object-tool-resources-file-search-spec
   })

(def assistant-object-tool-resources-spec
  (ds/spec
    {:name ::assistant-object-tool-resources
     :spec assistant-object-tool-resources-data}))
