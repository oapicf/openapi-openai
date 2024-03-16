=begin
#OpenAI API

#APIs for sampling from and fine-tuning language models

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech
Generator version: 7.4.0

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OpenApiOpenAIClient::CreateEditResponseChoicesInner
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenApiOpenAIClient::CreateEditResponseChoicesInner do
  let(:instance) { OpenApiOpenAIClient::CreateEditResponseChoicesInner.new }

  describe 'test an instance of CreateEditResponseChoicesInner' do
    it 'should create an instance of CreateEditResponseChoicesInner' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(OpenApiOpenAIClient::CreateEditResponseChoicesInner)
    end
  end

  describe 'test attribute "text"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "index"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "logprobs"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "finish_reason"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["stop", "length"])
      # validator.allowable_values.each do |value|
      #   expect { instance.finish_reason = value }.not_to raise_error
      # end
    end
  end

end
