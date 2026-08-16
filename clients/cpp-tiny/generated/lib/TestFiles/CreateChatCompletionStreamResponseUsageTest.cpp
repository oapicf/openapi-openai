
#include "CreateChatCompletionStreamResponse_usage.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateChatCompletionStreamResponse_usage_completion_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "completion_tokens", 1
    };

    CreateChatCompletionStreamResponse_usage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCompletionTokens());








}


void test_CreateChatCompletionStreamResponse_usage_prompt_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "prompt_tokens", 1
    };

    CreateChatCompletionStreamResponse_usage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPromptTokens());








}


void test_CreateChatCompletionStreamResponse_usage_total_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "total_tokens", 1
    };

    CreateChatCompletionStreamResponse_usage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalTokens());








}



void test_CreateChatCompletionStreamResponse_usage_completion_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "completion_tokens", 1
    };

    CreateChatCompletionStreamResponse_usage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completion_tokens"] == output["completion_tokens"]);




}


void test_CreateChatCompletionStreamResponse_usage_prompt_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "prompt_tokens", 1
    };

    CreateChatCompletionStreamResponse_usage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["prompt_tokens"] == output["prompt_tokens"]);




}


void test_CreateChatCompletionStreamResponse_usage_total_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "total_tokens", 1
    };

    CreateChatCompletionStreamResponse_usage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total_tokens"] == output["total_tokens"]);




}


