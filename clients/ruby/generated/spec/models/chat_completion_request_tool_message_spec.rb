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

# Unit tests for OpenApiOpenAIClient::ChatCompletionRequestToolMessage
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenApiOpenAIClient::ChatCompletionRequestToolMessage do
  let(:instance) { OpenApiOpenAIClient::ChatCompletionRequestToolMessage.new }

  describe 'test an instance of ChatCompletionRequestToolMessage' do
    it 'should create an instance of ChatCompletionRequestToolMessage' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(OpenApiOpenAIClient::ChatCompletionRequestToolMessage)
    end
  end

  describe 'test attribute "role"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["tool"])
      # validator.allowable_values.each do |value|
      #   expect { instance.role = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "content"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "tool_call_id"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
