=begin
OpenAI API

APIs for sampling from and fine-tuning language models

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CreateEmbeddingResponseDataInner < ApplicationRecord
  validates_presence_of :index
  validates_presence_of :object
  validates_presence_of :embedding

  serialize :embedding, Array
end
