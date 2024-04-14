=begin
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class MessageObject < ApplicationRecord
  validates_presence_of :id
  validates_presence_of :object
  validates_presence_of :created_at
  validates_presence_of :thread_id
  validates_presence_of :status
  validates_presence_of :incomplete_details
  validates_presence_of :completed_at
  validates_presence_of :incomplete_at
  validates_presence_of :role
  validates_presence_of :content
  validates_presence_of :assistant_id
  validates_presence_of :run_id
  validates_presence_of :file_ids
  validates_presence_of :metadata

  serialize :content, Array
  serialize :file_ids, Array
end
