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

# Unit tests for OpenApiOpenAIClient::DeleteAssistantResponse
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenApiOpenAIClient::DeleteAssistantResponse do
  let(:instance) { OpenApiOpenAIClient::DeleteAssistantResponse.new }

  describe 'test an instance of DeleteAssistantResponse' do
    it 'should create an instance of DeleteAssistantResponse' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(OpenApiOpenAIClient::DeleteAssistantResponse)
    end
  end

  describe 'test attribute "id"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "deleted"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "object"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["assistant.deleted"])
      # validator.allowable_values.each do |value|
      #   expect { instance.object = value }.not_to raise_error
      # end
    end
  end

end
