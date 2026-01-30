(ns open-ai-api.specs.usage-code-interpreter-sessions-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def usage-code-interpreter-sessions-result-data
  {
   (ds/req :object) string?
   (ds/req :sessions) int?
   (ds/opt :project_id) string?
   })

(def usage-code-interpreter-sessions-result-spec
  (ds/spec
    {:name ::usage-code-interpreter-sessions-result
     :spec usage-code-interpreter-sessions-result-data}))
