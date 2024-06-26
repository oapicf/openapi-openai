#
# OpenAI API
# 
# The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
# The version of the OpenAPI document: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_delete_model_response
import ../models/model_list_models_response
import ../models/model_model

const basepath = "https://api.openai.com/v1"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc deleteModel*(httpClient: HttpClient, model: string): (Option[DeleteModelResponse], Response) =
  ## Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

  let response = httpClient.delete(basepath & fmt"/models/{model}")
  constructResult[DeleteModelResponse](response)


proc listModels*(httpClient: HttpClient): (Option[ListModelsResponse], Response) =
  ## Lists the currently available models, and provides basic information about each one such as the owner and availability.

  let response = httpClient.get(basepath & "/models")
  constructResult[ListModelsResponse](response)


proc retrieveModel*(httpClient: HttpClient, model: string): (Option[Model], Response) =
  ## Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

  let response = httpClient.get(basepath & fmt"/models/{model}")
  constructResult[Model](response)

