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

import model_create_embedding_response_data_inner
import model_create_embedding_response_usage

type CreateEmbeddingResponse* = object
  ## 
  `object`*: string
  model*: string
  data*: seq[CreateEmbeddingResponse_data_inner]
  usage*: CreateEmbeddingResponse_usage