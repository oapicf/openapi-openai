
#include "FineTuneChatCompletionRequestAssistantMessage.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_FineTuneChatCompletionRequestAssistantMessage_refusal_is_assigned_from_json()
{


    bourne::json input =
    {
        "refusal", "hello"
    };

    FineTuneChatCompletionRequestAssistantMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRefusal().c_str());






}


void test_FineTuneChatCompletionRequestAssistantMessage_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    FineTuneChatCompletionRequestAssistantMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}


void test_FineTuneChatCompletionRequestAssistantMessage_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    FineTuneChatCompletionRequestAssistantMessage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_FineTuneChatCompletionRequestAssistantMessage_weight_is_assigned_from_json()
{
    bourne::json input =
    {
        "weight", 1
    };

    FineTuneChatCompletionRequestAssistantMessage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWeight());








}




void test_FineTuneChatCompletionRequestAssistantMessage_refusal_is_converted_to_json()
{

    bourne::json input =
    {
        "refusal", "hello"
    };

    FineTuneChatCompletionRequestAssistantMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refusal"] == output["refusal"]);



}


void test_FineTuneChatCompletionRequestAssistantMessage_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    FineTuneChatCompletionRequestAssistantMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


void test_FineTuneChatCompletionRequestAssistantMessage_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    FineTuneChatCompletionRequestAssistantMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}





void test_FineTuneChatCompletionRequestAssistantMessage_weight_is_converted_to_json()
{
    bourne::json input =
    {
        "weight", 1
    };

    FineTuneChatCompletionRequestAssistantMessage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["weight"] == output["weight"]);




}


