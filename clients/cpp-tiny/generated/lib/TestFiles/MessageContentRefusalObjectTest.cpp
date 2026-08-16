
#include "MessageContentRefusalObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MessageContentRefusalObject_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    MessageContentRefusalObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_MessageContentRefusalObject_refusal_is_assigned_from_json()
{


    bourne::json input =
    {
        "refusal", "hello"
    };

    MessageContentRefusalObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRefusal().c_str());






}



void test_MessageContentRefusalObject_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    MessageContentRefusalObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_MessageContentRefusalObject_refusal_is_converted_to_json()
{

    bourne::json input =
    {
        "refusal", "hello"
    };

    MessageContentRefusalObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refusal"] == output["refusal"]);



}


