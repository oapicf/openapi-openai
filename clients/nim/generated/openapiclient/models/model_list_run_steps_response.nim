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

import model_run_step_object

type ListRunStepsResponse* = object
  ## 
  `object`*: string
  data*: seq[RunStepObject]
  firstId*: string
  lastId*: string
  hasMore*: bool
