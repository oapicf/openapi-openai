=begin comment

OpenAI API

APIs for sampling from and fine-tuning language models

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

use_ok('WWW::OpenAPIClient::OpenAIApi');

my $api = WWW::OpenAPIClient::OpenAIApi->new();
isa_ok($api, 'WWW::OpenAPIClient::OpenAIApi');

#
# cancel_fine_tune test
#
# uncomment below and update the test
#my $cancel_fine_tune_fine_tune_id = undef; # replace NULL with a proper value
#my $cancel_fine_tune_result = $api->cancel_fine_tune(fine_tune_id => $cancel_fine_tune_fine_tune_id);

#
# create_chat_completion test
#
# uncomment below and update the test
#my $create_chat_completion_create_chat_completion_request = undef; # replace NULL with a proper value
#my $create_chat_completion_result = $api->create_chat_completion(create_chat_completion_request => $create_chat_completion_create_chat_completion_request);

#
# create_completion test
#
# uncomment below and update the test
#my $create_completion_create_completion_request = undef; # replace NULL with a proper value
#my $create_completion_result = $api->create_completion(create_completion_request => $create_completion_create_completion_request);

#
# create_edit test
#
# uncomment below and update the test
#my $create_edit_create_edit_request = undef; # replace NULL with a proper value
#my $create_edit_result = $api->create_edit(create_edit_request => $create_edit_create_edit_request);

#
# create_embedding test
#
# uncomment below and update the test
#my $create_embedding_create_embedding_request = undef; # replace NULL with a proper value
#my $create_embedding_result = $api->create_embedding(create_embedding_request => $create_embedding_create_embedding_request);

#
# create_file test
#
# uncomment below and update the test
#my $create_file_file = undef; # replace NULL with a proper value
#my $create_file_purpose = undef; # replace NULL with a proper value
#my $create_file_result = $api->create_file(file => $create_file_file, purpose => $create_file_purpose);

#
# create_fine_tune test
#
# uncomment below and update the test
#my $create_fine_tune_create_fine_tune_request = undef; # replace NULL with a proper value
#my $create_fine_tune_result = $api->create_fine_tune(create_fine_tune_request => $create_fine_tune_create_fine_tune_request);

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
#my $create_image_edit_n = undef; # replace NULL with a proper value
#my $create_image_edit_size = undef; # replace NULL with a proper value
#my $create_image_edit_response_format = undef; # replace NULL with a proper value
#my $create_image_edit_user = undef; # replace NULL with a proper value
#my $create_image_edit_result = $api->create_image_edit(image => $create_image_edit_image, prompt => $create_image_edit_prompt, mask => $create_image_edit_mask, n => $create_image_edit_n, size => $create_image_edit_size, response_format => $create_image_edit_response_format, user => $create_image_edit_user);

#
# create_image_variation test
#
# uncomment below and update the test
#my $create_image_variation_image = undef; # replace NULL with a proper value
#my $create_image_variation_n = undef; # replace NULL with a proper value
#my $create_image_variation_size = undef; # replace NULL with a proper value
#my $create_image_variation_response_format = undef; # replace NULL with a proper value
#my $create_image_variation_user = undef; # replace NULL with a proper value
#my $create_image_variation_result = $api->create_image_variation(image => $create_image_variation_image, n => $create_image_variation_n, size => $create_image_variation_size, response_format => $create_image_variation_response_format, user => $create_image_variation_user);

#
# create_moderation test
#
# uncomment below and update the test
#my $create_moderation_create_moderation_request = undef; # replace NULL with a proper value
#my $create_moderation_result = $api->create_moderation(create_moderation_request => $create_moderation_create_moderation_request);

#
# create_transcription test
#
# uncomment below and update the test
#my $create_transcription_file = undef; # replace NULL with a proper value
#my $create_transcription_model = undef; # replace NULL with a proper value
#my $create_transcription_prompt = undef; # replace NULL with a proper value
#my $create_transcription_response_format = undef; # replace NULL with a proper value
#my $create_transcription_temperature = undef; # replace NULL with a proper value
#my $create_transcription_language = undef; # replace NULL with a proper value
#my $create_transcription_result = $api->create_transcription(file => $create_transcription_file, model => $create_transcription_model, prompt => $create_transcription_prompt, response_format => $create_transcription_response_format, temperature => $create_transcription_temperature, language => $create_transcription_language);

#
# create_translation test
#
# uncomment below and update the test
#my $create_translation_file = undef; # replace NULL with a proper value
#my $create_translation_model = undef; # replace NULL with a proper value
#my $create_translation_prompt = undef; # replace NULL with a proper value
#my $create_translation_response_format = undef; # replace NULL with a proper value
#my $create_translation_temperature = undef; # replace NULL with a proper value
#my $create_translation_result = $api->create_translation(file => $create_translation_file, model => $create_translation_model, prompt => $create_translation_prompt, response_format => $create_translation_response_format, temperature => $create_translation_temperature);

#
# delete_file test
#
# uncomment below and update the test
#my $delete_file_file_id = undef; # replace NULL with a proper value
#my $delete_file_result = $api->delete_file(file_id => $delete_file_file_id);

#
# delete_model test
#
# uncomment below and update the test
#my $delete_model_model = undef; # replace NULL with a proper value
#my $delete_model_result = $api->delete_model(model => $delete_model_model);

#
# download_file test
#
# uncomment below and update the test
#my $download_file_file_id = undef; # replace NULL with a proper value
#my $download_file_result = $api->download_file(file_id => $download_file_file_id);

#
# list_files test
#
# uncomment below and update the test
#my $list_files_result = $api->list_files();

#
# list_fine_tune_events test
#
# uncomment below and update the test
#my $list_fine_tune_events_fine_tune_id = undef; # replace NULL with a proper value
#my $list_fine_tune_events_stream = undef; # replace NULL with a proper value
#my $list_fine_tune_events_result = $api->list_fine_tune_events(fine_tune_id => $list_fine_tune_events_fine_tune_id, stream => $list_fine_tune_events_stream);

#
# list_fine_tunes test
#
# uncomment below and update the test
#my $list_fine_tunes_result = $api->list_fine_tunes();

#
# list_models test
#
# uncomment below and update the test
#my $list_models_result = $api->list_models();

#
# retrieve_file test
#
# uncomment below and update the test
#my $retrieve_file_file_id = undef; # replace NULL with a proper value
#my $retrieve_file_result = $api->retrieve_file(file_id => $retrieve_file_file_id);

#
# retrieve_fine_tune test
#
# uncomment below and update the test
#my $retrieve_fine_tune_fine_tune_id = undef; # replace NULL with a proper value
#my $retrieve_fine_tune_result = $api->retrieve_fine_tune(fine_tune_id => $retrieve_fine_tune_fine_tune_id);

#
# retrieve_model test
#
# uncomment below and update the test
#my $retrieve_model_model = undef; # replace NULL with a proper value
#my $retrieve_model_result = $api->retrieve_model(model => $retrieve_model_model);


done_testing();
