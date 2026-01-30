(ns open-ai-api.specs.invite-projects-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-projects-inner-data
  {
   (ds/opt :id) string?
   (ds/opt :role) string?
   })

(def invite-projects-inner-spec
  (ds/spec
    {:name ::invite-projects-inner
     :spec invite-projects-inner-data}))
