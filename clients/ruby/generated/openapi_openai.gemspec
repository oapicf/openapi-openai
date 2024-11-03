# -*- encoding: utf-8 -*-

=begin
#OpenAI API

#The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech
Generator version: 7.9.0

=end

$:.push File.expand_path("../lib", __FILE__)
require "openapi_openai/version"

Gem::Specification.new do |s|
  s.name        = "openapi_openai"
  s.version     = OpenApiOpenAIClient::VERSION
  s.platform    = Gem::Platform::RUBY
  s.authors     = ["OpenAPI Clients Factory"]
  s.email       = ["blah+oapicf@cliffano.com"]
  s.homepage    = "https://github.com/oapicf/openapi-openai"
  s.summary     = "OpenAI API Ruby Gem"
  s.description = "The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details."
  s.license     = "MIT"
  s.required_ruby_version = ">= 2.0"
  s.metadata    = {}

  s.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'

  s.add_development_dependency 'rspec', '~> 3.6', '>= 3.6.0'

  s.files         = `find *`.split("\n").uniq.sort.select { |f| !f.empty? }
  s.test_files    = `find spec/*`.split("\n")
  s.executables   = []
  s.require_paths = ["lib"]
end
