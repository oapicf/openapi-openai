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


type CreateFineTuningJobRequestHyperparametersBatchSize* = object
  ## Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
