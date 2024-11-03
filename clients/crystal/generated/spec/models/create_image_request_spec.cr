# #OpenAI API
#
##The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
#
#The version of the OpenAPI document: 2.0.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::CreateImageRequest
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenAPIClient::CreateImageRequest do

  describe "test an instance of CreateImageRequest" do
    it "should create an instance of CreateImageRequest" do
      #instance = OpenAPIClient::CreateImageRequest.new
      #expect(instance).to be_instance_of(OpenAPIClient::CreateImageRequest)
    end
  end
  describe "test attribute 'prompt'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'model'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'n'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'quality'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
      # validator = Petstore::EnumTest::EnumAttributeValidator.new("String", ["standard", "hd"])
      # validator.allowable_values.each do |value|
      #   expect { instance.quality = value }.not_to raise_error
      # end
    end
  end

  describe "test attribute 'response_format'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
      # validator = Petstore::EnumTest::EnumAttributeValidator.new("String", ["url", "b64_json"])
      # validator.allowable_values.each do |value|
      #   expect { instance.response_format = value }.not_to raise_error
      # end
    end
  end

  describe "test attribute 'size'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
      # validator = Petstore::EnumTest::EnumAttributeValidator.new("String", ["256x256", "512x512", "1024x1024", "1792x1024", "1024x1792"])
      # validator.allowable_values.each do |value|
      #   expect { instance.size = value }.not_to raise_error
      # end
    end
  end

  describe "test attribute 'style'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
      # validator = Petstore::EnumTest::EnumAttributeValidator.new("String", ["vivid", "natural"])
      # validator.allowable_values.each do |value|
      #   expect { instance.style = value }.not_to raise_error
      # end
    end
  end

  describe "test attribute 'user'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
