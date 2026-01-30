(ns open-ai-api.specs.modify-thread-request-tool-resources
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-assistant-request-tool-resources-code-interpreter :refer :all]
            [open-ai-api.specs.modify-thread-request-tool-resources-file-search :refer :all]
            )
  (:import (java.io File)))


(def modify-thread-request-tool-resources-data
  {
   (ds/opt :code_interpreter) create-assistant-request-tool-resources-code-interpreter-spec
   (ds/opt :file_search) modify-thread-request-tool-resources-file-search-spec
   })

(def modify-thread-request-tool-resources-spec
  (ds/spec
    {:name ::modify-thread-request-tool-resources
     :spec modify-thread-request-tool-resources-data}))
