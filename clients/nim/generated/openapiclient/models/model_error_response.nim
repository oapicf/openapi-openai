#
# OpenAI API
# 
# APIs for sampling from and fine-tuning language models
# The version of the OpenAPI document: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_error

type ErrorResponse* = object
  ## 
  error*: Error
