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

# Unit tests for OpenApiOpenAIClient::CreateImageRequest
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenApiOpenAIClient::CreateImageRequest do
  let(:instance) { OpenApiOpenAIClient::CreateImageRequest.new }

  describe 'test an instance of CreateImageRequest' do
    it 'should create an instance of CreateImageRequest' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(OpenApiOpenAIClient::CreateImageRequest)
    end
  end

  describe 'test attribute "prompt"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "n"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "size"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["256x256", "512x512", "1024x1024"])
      # validator.allowable_values.each do |value|
      #   expect { instance.size = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "response_format"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["url", "b64_json"])
      # validator.allowable_values.each do |value|
      #   expect { instance.response_format = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "user"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end