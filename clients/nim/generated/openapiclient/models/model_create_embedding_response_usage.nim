#
# OpenAI API
# 
# The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
# The version of the OpenAPI document: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables


type CreateEmbeddingResponseUsage* = object
  ## The usage information for the request.
  promptTokens*: int ## The number of tokens used by the prompt.
  totalTokens*: int ## The total number of tokens used by the request.
