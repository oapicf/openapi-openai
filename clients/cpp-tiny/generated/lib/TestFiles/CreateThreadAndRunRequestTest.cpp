
#include "CreateThreadAndRunRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateThreadAndRunRequest_assistant_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "assistant_id", "hello"
    };

    CreateThreadAndRunRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssistantId().c_str());






}




void test_CreateThreadAndRunRequest_instructions_is_assigned_from_json()
{


    bourne::json input =
    {
        "instructions", "hello"
    };

    CreateThreadAndRunRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInstructions().c_str());






}





void test_CreateThreadAndRunRequest_temperature_is_assigned_from_json()
{








}


void test_CreateThreadAndRunRequest_top_p_is_assigned_from_json()
{








}


void test_CreateThreadAndRunRequest_stream_is_assigned_from_json()
{




    bourne::json input =
    {
        "stream", true
    };

    CreateThreadAndRunRequest obj(input.dump());

    TEST_ASSERT(true == obj.isStream());




}


void test_CreateThreadAndRunRequest_max_prompt_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_prompt_tokens", 1
    };

    CreateThreadAndRunRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxPromptTokens());








}


void test_CreateThreadAndRunRequest_max_completion_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_completion_tokens", 1
    };

    CreateThreadAndRunRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxCompletionTokens());








}




void test_CreateThreadAndRunRequest_parallel_tool_calls_is_assigned_from_json()
{




    bourne::json input =
    {
        "parallel_tool_calls", true
    };

    CreateThreadAndRunRequest obj(input.dump());

    TEST_ASSERT(true == obj.isParallelToolCalls());




}




void test_CreateThreadAndRunRequest_assistant_id_is_converted_to_json()
{

    bourne::json input =
    {
        "assistant_id", "hello"
    };

    CreateThreadAndRunRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["assistant_id"] == output["assistant_id"]);



}




void test_CreateThreadAndRunRequest_instructions_is_converted_to_json()
{

    bourne::json input =
    {
        "instructions", "hello"
    };

    CreateThreadAndRunRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["instructions"] == output["instructions"]);



}





void test_CreateThreadAndRunRequest_temperature_is_converted_to_json()
{




}


void test_CreateThreadAndRunRequest_top_p_is_converted_to_json()
{




}


void test_CreateThreadAndRunRequest_stream_is_converted_to_json()
{


    bourne::json input =
    {
        "stream", true
    };

    CreateThreadAndRunRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream"] == output["stream"]);


}


void test_CreateThreadAndRunRequest_max_prompt_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "max_prompt_tokens", 1
    };

    CreateThreadAndRunRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_prompt_tokens"] == output["max_prompt_tokens"]);




}


void test_CreateThreadAndRunRequest_max_completion_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "max_completion_tokens", 1
    };

    CreateThreadAndRunRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_completion_tokens"] == output["max_completion_tokens"]);




}




void test_CreateThreadAndRunRequest_parallel_tool_calls_is_converted_to_json()
{


    bourne::json input =
    {
        "parallel_tool_calls", true
    };

    CreateThreadAndRunRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parallel_tool_calls"] == output["parallel_tool_calls"]);


}



