=begin
#OpenAI API

#The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech
Generator version: 7.9.0

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OpenApiOpenAIClient::MessageObjectIncompleteDetails
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenApiOpenAIClient::MessageObjectIncompleteDetails do
  let(:instance) { OpenApiOpenAIClient::MessageObjectIncompleteDetails.new }

  describe 'test an instance of MessageObjectIncompleteDetails' do
    it 'should create an instance of MessageObjectIncompleteDetails' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(OpenApiOpenAIClient::MessageObjectIncompleteDetails)
    end
  end

  describe 'test attribute "reason"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["content_filter", "max_tokens", "run_cancelled", "run_expired", "run_failed"])
      # validator.allowable_values.each do |value|
      #   expect { instance.reason = value }.not_to raise_error
      # end
    end
  end

end
