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


type FineTuningJobError* = object
  ## For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
  code*: string ## A machine-readable error code.
  message*: string ## A human-readable error message.
  param*: string ## The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
