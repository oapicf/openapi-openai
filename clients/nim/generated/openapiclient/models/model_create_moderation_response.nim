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

import model_create_moderation_response_results_inner

type CreateModerationResponse* = object
  ## Represents if a given text input is potentially harmful.
  id*: string ## The unique identifier for the moderation request.
  model*: string ## The model used to generate the moderation results.
  results*: seq[CreateModerationResponse_results_inner] ## A list of moderation objects.
