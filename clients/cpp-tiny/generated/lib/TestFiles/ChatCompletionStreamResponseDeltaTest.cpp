
#include "ChatCompletionStreamResponseDelta.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChatCompletionStreamResponseDelta_content_is_assigned_from_json()
{


    bourne::json input =
    {
        "content", "hello"
    };

    ChatCompletionStreamResponseDelta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContent().c_str());






}




void test_ChatCompletionStreamResponseDelta_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    ChatCompletionStreamResponseDelta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}


void test_ChatCompletionStreamResponseDelta_refusal_is_assigned_from_json()
{


    bourne::json input =
    {
        "refusal", "hello"
    };

    ChatCompletionStreamResponseDelta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRefusal().c_str());






}



void test_ChatCompletionStreamResponseDelta_content_is_converted_to_json()
{

    bourne::json input =
    {
        "content", "hello"
    };

    ChatCompletionStreamResponseDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content"] == output["content"]);



}




void test_ChatCompletionStreamResponseDelta_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    ChatCompletionStreamResponseDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


void test_ChatCompletionStreamResponseDelta_refusal_is_converted_to_json()
{

    bourne::json input =
    {
        "refusal", "hello"
    };

    ChatCompletionStreamResponseDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refusal"] == output["refusal"]);



}


