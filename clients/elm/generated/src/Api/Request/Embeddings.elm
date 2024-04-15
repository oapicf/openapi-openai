{-
   OpenAI API
   The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

   The version of the OpenAPI document: 2.0.0
   Contact: blah+oapicf@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Embeddings exposing
    ( createEmbedding
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

createEmbedding : Api.Data.CreateEmbeddingRequest -> String -> Api.Request Api.Data.CreateEmbeddingResponse
createEmbedding createEmbeddingRequest_body auth_token =
    Api.request
        "POST"
        "/embeddings"
        []
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeCreateEmbeddingRequest createEmbeddingRequest_body)))
        Api.Data.createEmbeddingResponseDecoder
        |> Api.withBearerToken auth_token