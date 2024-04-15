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


type CompletionUsage* = object
  ## Usage statistics for the completion request.
  completionTokens*: int ## Number of tokens in the generated completion.
  promptTokens*: int ## Number of tokens in the prompt.
  totalTokens*: int ## Total number of tokens used in the request (prompt + completion).