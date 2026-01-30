(ns open-ai-api.specs.modify-assistant-request-tool-resources
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.modify-assistant-request-tool-resources-code-interpreter :refer :all]
            [open-ai-api.specs.modify-assistant-request-tool-resources-file-search :refer :all]
            )
  (:import (java.io File)))


(def modify-assistant-request-tool-resources-data
  {
   (ds/opt :code_interpreter) modify-assistant-request-tool-resources-code-interpreter-spec
   (ds/opt :file_search) modify-assistant-request-tool-resources-file-search-spec
   })

(def modify-assistant-request-tool-resources-spec
  (ds/spec
    {:name ::modify-assistant-request-tool-resources
     :spec modify-assistant-request-tool-resources-data}))
