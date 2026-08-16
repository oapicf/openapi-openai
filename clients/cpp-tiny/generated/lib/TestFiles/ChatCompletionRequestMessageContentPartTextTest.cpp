
#include "ChatCompletionRequestMessageContentPartText.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChatCompletionRequestMessageContentPartText_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    ChatCompletionRequestMessageContentPartText obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_ChatCompletionRequestMessageContentPartText_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    ChatCompletionRequestMessageContentPartText obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}



void test_ChatCompletionRequestMessageContentPartText_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    ChatCompletionRequestMessageContentPartText obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_ChatCompletionRequestMessageContentPartText_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    ChatCompletionRequestMessageContentPartText obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}


