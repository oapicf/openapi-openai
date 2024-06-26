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


type RunToolCallObjectFunction* = object
  ## The function definition.
  name*: string ## The name of the function.
  arguments*: string ## The arguments that the model expects you to pass to the function.
