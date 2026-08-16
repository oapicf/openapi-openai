
#include "ChatCompletionRequestFunctionMessage.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChatCompletionRequestFunctionMessage_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    ChatCompletionRequestFunctionMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}


void test_ChatCompletionRequestFunctionMessage_content_is_assigned_from_json()
{


    bourne::json input =
    {
        "content", "hello"
    };

    ChatCompletionRequestFunctionMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContent().c_str());






}


void test_ChatCompletionRequestFunctionMessage_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ChatCompletionRequestFunctionMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_ChatCompletionRequestFunctionMessage_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    ChatCompletionRequestFunctionMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


void test_ChatCompletionRequestFunctionMessage_content_is_converted_to_json()
{

    bourne::json input =
    {
        "content", "hello"
    };

    ChatCompletionRequestFunctionMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content"] == output["content"]);



}


void test_ChatCompletionRequestFunctionMessage_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ChatCompletionRequestFunctionMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


