/**
 * 
 * OpenAI API
 * 
 * 
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 * 
 * Version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// audio_api

export default {
    Query: {

    },

    Mutation: {

        // @return String!
        CreateSpeech: ($createSpeechRequest) => {
            return {
                "createSpeechRequest": ""
            };
        },

        // @return CreateTranscription200Response
        CreateTranscription: ($file, $model, $language, $prompt, $responseFormat, $temperature, $timestampGranularities) => {
            return {
                "file": "BINARY_DATA_HERE",
                "model": "",
                "language": "language_example",
                "prompt": "prompt_example",
                "responseFormat": "responseFormat_example",
                "temperature": "8.14",
                "timestampGranularities": ""
            };
        },

        // @return CreateTranslation200Response
        CreateTranslation: ($file, $model, $prompt, $responseFormat, $temperature) => {
            return {
                "file": "BINARY_DATA_HERE",
                "model": "",
                "prompt": "prompt_example",
                "responseFormat": "responseFormat_example",
                "temperature": "8.14"
            };
        },

    }
}