
#include "ChatCompletionRequestMessage.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChatCompletionRequestMessage_content_is_assigned_from_json()
{


    bourne::json input =
    {
        "content", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContent().c_str());






}


void test_ChatCompletionRequestMessage_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}


void test_ChatCompletionRequestMessage_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_ChatCompletionRequestMessage_refusal_is_assigned_from_json()
{


    bourne::json input =
    {
        "refusal", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRefusal().c_str());






}





void test_ChatCompletionRequestMessage_tool_call_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "tool_call_id", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToolCallId().c_str());






}



void test_ChatCompletionRequestMessage_content_is_converted_to_json()
{

    bourne::json input =
    {
        "content", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content"] == output["content"]);



}


void test_ChatCompletionRequestMessage_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


void test_ChatCompletionRequestMessage_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_ChatCompletionRequestMessage_refusal_is_converted_to_json()
{

    bourne::json input =
    {
        "refusal", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refusal"] == output["refusal"]);



}





void test_ChatCompletionRequestMessage_tool_call_id_is_converted_to_json()
{

    bourne::json input =
    {
        "tool_call_id", "hello"
    };

    ChatCompletionRequestMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tool_call_id"] == output["tool_call_id"]);



}


