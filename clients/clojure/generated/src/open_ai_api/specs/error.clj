(ns open-ai-api.specs.error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def error-data
  {
   (ds/req :code) string?
   (ds/req :message) string?
   (ds/req :param) string?
   (ds/req :type) string?
   })

(def error-spec
  (ds/spec
    {:name ::error
     :spec error-data}))
