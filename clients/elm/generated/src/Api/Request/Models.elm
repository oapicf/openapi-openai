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


module Api.Request.Models exposing
    ( deleteModel
    , listModels
    , retrieveModel
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

deleteModel : String -> String -> Api.Request Api.Data.DeleteModelResponse
deleteModel model_path auth_token =
    Api.request
        "DELETE"
        "/models/{model}"
        [ ( "model", identity model_path ) ]
        []
        []
        Nothing
        Api.Data.deleteModelResponseDecoder
        |> Api.withBearerToken auth_token

listModels : String -> Api.Request Api.Data.ListModelsResponse
listModels auth_token =
    Api.request
        "GET"
        "/models"
        []
        []
        []
        Nothing
        Api.Data.listModelsResponseDecoder
        |> Api.withBearerToken auth_token

retrieveModel : String -> String -> Api.Request Api.Data.Model
retrieveModel model_path auth_token =
    Api.request
        "GET"
        "/models/{model}"
        [ ( "model", identity model_path ) ]
        []
        []
        Nothing
        Api.Data.modelDecoder
        |> Api.withBearerToken auth_token
