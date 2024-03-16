/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package main

import (
	"log"
	"net/http"

	openapi "github.com/oapicf/openapi-openai/go"
)

func main() {
	log.Printf("Server started")

	OpenAIAPIService := openapi.NewOpenAIAPIService()
	OpenAIAPIController := openapi.NewOpenAIAPIController(OpenAIAPIService)

	router := openapi.NewRouter(OpenAIAPIController)

	log.Fatal(http.ListenAndServe(":8080", router))
}