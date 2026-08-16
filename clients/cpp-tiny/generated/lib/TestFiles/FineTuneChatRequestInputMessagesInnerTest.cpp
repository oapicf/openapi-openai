
#include "FineTuneChatRequestInput_messages_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FineTuneChatRequestInput_messages_inner_content_is_assigned_from_json()
{


    bourne::json input =
    {
        "content", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContent().c_str());






}


void test_FineTuneChatRequestInput_messages_inner_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}


void test_FineTuneChatRequestInput_messages_inner_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_FineTuneChatRequestInput_messages_inner_weight_is_assigned_from_json()
{
    bourne::json input =
    {
        "weight", 1
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWeight());








}


void test_FineTuneChatRequestInput_messages_inner_refusal_is_assigned_from_json()
{


    bourne::json input =
    {
        "refusal", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRefusal().c_str());






}





void test_FineTuneChatRequestInput_messages_inner_tool_call_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "tool_call_id", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToolCallId().c_str());






}



void test_FineTuneChatRequestInput_messages_inner_content_is_converted_to_json()
{

    bourne::json input =
    {
        "content", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content"] == output["content"]);



}


void test_FineTuneChatRequestInput_messages_inner_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


void test_FineTuneChatRequestInput_messages_inner_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_FineTuneChatRequestInput_messages_inner_weight_is_converted_to_json()
{
    bourne::json input =
    {
        "weight", 1
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["weight"] == output["weight"]);




}


void test_FineTuneChatRequestInput_messages_inner_refusal_is_converted_to_json()
{

    bourne::json input =
    {
        "refusal", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refusal"] == output["refusal"]);



}





void test_FineTuneChatRequestInput_messages_inner_tool_call_id_is_converted_to_json()
{

    bourne::json input =
    {
        "tool_call_id", "hello"
    };

    FineTuneChatRequestInput_messages_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tool_call_id"] == output["tool_call_id"]);



}


