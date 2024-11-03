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

import model_run_step_details_tool_calls_code_output_image_object_image

type `Type`* {.pure.} = enum
  Image

type RunStepDetailsToolCallsCodeOutputImageObject* = object
  ## 
  `type`*: `Type` ## Always `image`.
  image*: RunStepDetailsToolCallsCodeOutputImageObject_image

func `%`*(v: `Type`): JsonNode =
  let str = case v:
    of `Type`.Image: "image"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Type`): string =
  result = case v:
    of `Type`.Image: "image"
