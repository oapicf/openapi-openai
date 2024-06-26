=begin
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CreateChatCompletionRequest < ApplicationRecord
  validates_presence_of :messages
  validates_presence_of :model

  serialize :messages, Array
  serialize :logit_bias, Hash
  serialize :tools, Array
  serialize :functions, Array
end
