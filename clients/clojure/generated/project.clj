(defproject open-ai-api "2.3.0"
  :description "The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details."
  :url "https://github.com/oapicf/openapi-openai"
  :license {:name "MIT"
            :url "https://github.com/openai/openai-openapi/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [metosin/spec-tools "0.7.0"]
                 [clj-http "3.8.0"]
                 [orchestra "2017.11.12-1"]
                 [cheshire "5.8.0"]])