
#include "CompletionUsage_prompt_tokens_details.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CompletionUsage_prompt_tokens_details_audio_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "audio_tokens", 1
    };

    CompletionUsage_prompt_tokens_details obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAudioTokens());








}


void test_CompletionUsage_prompt_tokens_details_cached_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "cached_tokens", 1
    };

    CompletionUsage_prompt_tokens_details obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCachedTokens());








}



void test_CompletionUsage_prompt_tokens_details_audio_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "audio_tokens", 1
    };

    CompletionUsage_prompt_tokens_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audio_tokens"] == output["audio_tokens"]);




}


void test_CompletionUsage_prompt_tokens_details_cached_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "cached_tokens", 1
    };

    CompletionUsage_prompt_tokens_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cached_tokens"] == output["cached_tokens"]);




}


