
#include "ChatCompletionRequestToolMessage.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChatCompletionRequestToolMessage_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    ChatCompletionRequestToolMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}



void test_ChatCompletionRequestToolMessage_tool_call_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "tool_call_id", "hello"
    };

    ChatCompletionRequestToolMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToolCallId().c_str());






}



void test_ChatCompletionRequestToolMessage_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    ChatCompletionRequestToolMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}



void test_ChatCompletionRequestToolMessage_tool_call_id_is_converted_to_json()
{

    bourne::json input =
    {
        "tool_call_id", "hello"
    };

    ChatCompletionRequestToolMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tool_call_id"] == output["tool_call_id"]);



}


