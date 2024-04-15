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

use_ok('WWW::OpenAPIClient::ChatApi');

my $api = WWW::OpenAPIClient::ChatApi->new();
isa_ok($api, 'WWW::OpenAPIClient::ChatApi');

#
# create_chat_completion test
#
# uncomment below and update the test
#my $create_chat_completion_create_chat_completion_request = undef; # replace NULL with a proper value
#my $create_chat_completion_result = $api->create_chat_completion(create_chat_completion_request => $create_chat_completion_create_chat_completion_request);


done_testing();