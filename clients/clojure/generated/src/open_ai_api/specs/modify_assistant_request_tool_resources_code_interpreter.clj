(ns open-ai-api.specs.modify-assistant-request-tool-resources-code-interpreter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def modify-assistant-request-tool-resources-code-interpreter-data
  {
   (ds/opt :file_ids) (s/coll-of string?)
   })

(def modify-assistant-request-tool-resources-code-interpreter-spec
  (ds/spec
    {:name ::modify-assistant-request-tool-resources-code-interpreter
     :spec modify-assistant-request-tool-resources-code-interpreter-data}))
