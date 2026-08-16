
#include "CreateChatCompletionRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_CreateChatCompletionRequest_store_is_assigned_from_json()
{




    bourne::json input =
    {
        "store", true
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT(true == obj.isStore());




}


void test_CreateChatCompletionRequest_reasoning_effort_is_assigned_from_json()
{


    bourne::json input =
    {
        "reasoning_effort", "hello"
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReasoningEffort().c_str());






}


void test_CreateChatCompletionRequest_metadata_is_assigned_from_json()
{








}


void test_CreateChatCompletionRequest_frequency_penalty_is_assigned_from_json()
{








}


void test_CreateChatCompletionRequest_logit_bias_is_assigned_from_json()
{








}


void test_CreateChatCompletionRequest_logprobs_is_assigned_from_json()
{




    bourne::json input =
    {
        "logprobs", true
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT(true == obj.isLogprobs());




}


void test_CreateChatCompletionRequest_top_logprobs_is_assigned_from_json()
{
    bourne::json input =
    {
        "top_logprobs", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTopLogprobs());








}


void test_CreateChatCompletionRequest_max_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_tokens", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxTokens());








}


void test_CreateChatCompletionRequest_max_completion_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_completion_tokens", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxCompletionTokens());








}


void test_CreateChatCompletionRequest_n_is_assigned_from_json()
{
    bourne::json input =
    {
        "n", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getN());








}





void test_CreateChatCompletionRequest_presence_penalty_is_assigned_from_json()
{








}



void test_CreateChatCompletionRequest_seed_is_assigned_from_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSeed());








}


void test_CreateChatCompletionRequest_service_tier_is_assigned_from_json()
{


    bourne::json input =
    {
        "service_tier", "hello"
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getServiceTier().c_str());






}



void test_CreateChatCompletionRequest_stream_is_assigned_from_json()
{




    bourne::json input =
    {
        "stream", true
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT(true == obj.isStream());




}



void test_CreateChatCompletionRequest_temperature_is_assigned_from_json()
{








}


void test_CreateChatCompletionRequest_top_p_is_assigned_from_json()
{








}




void test_CreateChatCompletionRequest_parallel_tool_calls_is_assigned_from_json()
{




    bourne::json input =
    {
        "parallel_tool_calls", true
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT(true == obj.isParallelToolCalls());




}


void test_CreateChatCompletionRequest_user_is_assigned_from_json()
{


    bourne::json input =
    {
        "user", "hello"
    };

    CreateChatCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUser().c_str());






}







void test_CreateChatCompletionRequest_store_is_converted_to_json()
{


    bourne::json input =
    {
        "store", true
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["store"] == output["store"]);


}


void test_CreateChatCompletionRequest_reasoning_effort_is_converted_to_json()
{

    bourne::json input =
    {
        "reasoning_effort", "hello"
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["reasoning_effort"] == output["reasoning_effort"]);



}


void test_CreateChatCompletionRequest_metadata_is_converted_to_json()
{




}


void test_CreateChatCompletionRequest_frequency_penalty_is_converted_to_json()
{




}


void test_CreateChatCompletionRequest_logit_bias_is_converted_to_json()
{




}


void test_CreateChatCompletionRequest_logprobs_is_converted_to_json()
{


    bourne::json input =
    {
        "logprobs", true
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["logprobs"] == output["logprobs"]);


}


void test_CreateChatCompletionRequest_top_logprobs_is_converted_to_json()
{
    bourne::json input =
    {
        "top_logprobs", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["top_logprobs"] == output["top_logprobs"]);




}


void test_CreateChatCompletionRequest_max_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "max_tokens", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_tokens"] == output["max_tokens"]);




}


void test_CreateChatCompletionRequest_max_completion_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "max_completion_tokens", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_completion_tokens"] == output["max_completion_tokens"]);




}


void test_CreateChatCompletionRequest_n_is_converted_to_json()
{
    bourne::json input =
    {
        "n", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["n"] == output["n"]);




}





void test_CreateChatCompletionRequest_presence_penalty_is_converted_to_json()
{




}



void test_CreateChatCompletionRequest_seed_is_converted_to_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["seed"] == output["seed"]);




}


void test_CreateChatCompletionRequest_service_tier_is_converted_to_json()
{

    bourne::json input =
    {
        "service_tier", "hello"
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["service_tier"] == output["service_tier"]);



}



void test_CreateChatCompletionRequest_stream_is_converted_to_json()
{


    bourne::json input =
    {
        "stream", true
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream"] == output["stream"]);


}



void test_CreateChatCompletionRequest_temperature_is_converted_to_json()
{




}


void test_CreateChatCompletionRequest_top_p_is_converted_to_json()
{




}




void test_CreateChatCompletionRequest_parallel_tool_calls_is_converted_to_json()
{


    bourne::json input =
    {
        "parallel_tool_calls", true
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parallel_tool_calls"] == output["parallel_tool_calls"]);


}


void test_CreateChatCompletionRequest_user_is_converted_to_json()
{

    bourne::json input =
    {
        "user", "hello"
    };

    CreateChatCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user"] == output["user"]);



}




