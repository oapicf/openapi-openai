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

use_ok('WWW::OpenAPIClient::ImagesApi');

my $api = WWW::OpenAPIClient::ImagesApi->new();
isa_ok($api, 'WWW::OpenAPIClient::ImagesApi');

#
# create_image test
#
# uncomment below and update the test
#my $create_image_create_image_request = undef; # replace NULL with a proper value
#my $create_image_result = $api->create_image(create_image_request => $create_image_create_image_request);

#
# create_image_edit test
#
# uncomment below and update the test
#my $create_image_edit_image = undef; # replace NULL with a proper value
#my $create_image_edit_prompt = undef; # replace NULL with a proper value
#my $create_image_edit_mask = undef; # replace NULL with a proper value
#my $create_image_edit_model = undef; # replace NULL with a proper value
#my $create_image_edit_n = undef; # replace NULL with a proper value
#my $create_image_edit_size = undef; # replace NULL with a proper value
#my $create_image_edit_response_format = undef; # replace NULL with a proper value
#my $create_image_edit_user = undef; # replace NULL with a proper value
#my $create_image_edit_result = $api->create_image_edit(image => $create_image_edit_image, prompt => $create_image_edit_prompt, mask => $create_image_edit_mask, model => $create_image_edit_model, n => $create_image_edit_n, size => $create_image_edit_size, response_format => $create_image_edit_response_format, user => $create_image_edit_user);

#
# create_image_variation test
#
# uncomment below and update the test
#my $create_image_variation_image = undef; # replace NULL with a proper value
#my $create_image_variation_model = undef; # replace NULL with a proper value
#my $create_image_variation_n = undef; # replace NULL with a proper value
#my $create_image_variation_response_format = undef; # replace NULL with a proper value
#my $create_image_variation_size = undef; # replace NULL with a proper value
#my $create_image_variation_user = undef; # replace NULL with a proper value
#my $create_image_variation_result = $api->create_image_variation(image => $create_image_variation_image, model => $create_image_variation_model, n => $create_image_variation_n, response_format => $create_image_variation_response_format, size => $create_image_variation_size, user => $create_image_variation_user);


done_testing();