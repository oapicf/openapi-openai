=begin comment

OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More;
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::ModelsApi');

my $api = WWW::OpenAPIClient::ModelsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::ModelsApi');

#
# delete_model test
#
# uncomment below and update the test
#my $delete_model_model = undef; # replace NULL with a proper value
#my $delete_model_result = $api->delete_model(model => $delete_model_model);

#
# list_models test
#
# uncomment below and update the test
#my $list_models_result = $api->list_models();

#
# retrieve_model test
#
# uncomment below and update the test
#my $retrieve_model_model = undef; # replace NULL with a proper value
#my $retrieve_model_result = $api->retrieve_model(model => $retrieve_model_model);


done_testing();
