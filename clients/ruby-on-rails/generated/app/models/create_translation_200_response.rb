=begin
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CreateTranslation200Response < ApplicationRecord
  validates_presence_of :text
  validates_presence_of :language
  validates_presence_of :duration

  serialize :segments, Array
end
