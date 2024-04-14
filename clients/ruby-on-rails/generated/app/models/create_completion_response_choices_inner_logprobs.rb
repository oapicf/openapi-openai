=begin
OpenAI API

APIs for sampling from and fine-tuning language models

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CreateCompletionResponseChoicesInnerLogprobs < ApplicationRecord

  serialize :tokens, Array
  serialize :token_logprobs, Array
  serialize :top_logprobs, Array
  serialize :text_offset, Array
end