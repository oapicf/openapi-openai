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


type RunStepDeltaStepDetailsToolCallsFunctionObjectFunction* = object
  ## The definition of the function that was called.
  name*: string ## The name of the function.
  arguments*: string ## The arguments passed to the function.
  output*: string ## The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
