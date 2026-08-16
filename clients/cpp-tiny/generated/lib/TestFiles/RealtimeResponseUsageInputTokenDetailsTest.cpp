
#include "RealtimeResponse_usage_input_token_details.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeResponse_usage_input_token_details_cached_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "cached_tokens", 1
    };

    RealtimeResponse_usage_input_token_details obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCachedTokens());








}


void test_RealtimeResponse_usage_input_token_details_text_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "text_tokens", 1
    };

    RealtimeResponse_usage_input_token_details obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTextTokens());








}


void test_RealtimeResponse_usage_input_token_details_audio_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "audio_tokens", 1
    };

    RealtimeResponse_usage_input_token_details obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAudioTokens());








}



void test_RealtimeResponse_usage_input_token_details_cached_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "cached_tokens", 1
    };

    RealtimeResponse_usage_input_token_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cached_tokens"] == output["cached_tokens"]);




}


void test_RealtimeResponse_usage_input_token_details_text_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "text_tokens", 1
    };

    RealtimeResponse_usage_input_token_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text_tokens"] == output["text_tokens"]);




}


void test_RealtimeResponse_usage_input_token_details_audio_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "audio_tokens", 1
    };

    RealtimeResponse_usage_input_token_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audio_tokens"] == output["audio_tokens"]);




}


