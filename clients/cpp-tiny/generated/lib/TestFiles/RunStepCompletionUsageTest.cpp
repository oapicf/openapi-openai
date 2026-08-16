
#include "RunStepCompletionUsage.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepCompletionUsage_completion_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "completion_tokens", 1
    };

    RunStepCompletionUsage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCompletionTokens());








}


void test_RunStepCompletionUsage_prompt_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "prompt_tokens", 1
    };

    RunStepCompletionUsage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPromptTokens());








}


void test_RunStepCompletionUsage_total_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "total_tokens", 1
    };

    RunStepCompletionUsage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalTokens());








}



void test_RunStepCompletionUsage_completion_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "completion_tokens", 1
    };

    RunStepCompletionUsage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completion_tokens"] == output["completion_tokens"]);




}


void test_RunStepCompletionUsage_prompt_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "prompt_tokens", 1
    };

    RunStepCompletionUsage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["prompt_tokens"] == output["prompt_tokens"]);




}


void test_RunStepCompletionUsage_total_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "total_tokens", 1
    };

    RunStepCompletionUsage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total_tokens"] == output["total_tokens"]);




}


