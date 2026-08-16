
#include "TruncationObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TruncationObject_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    TruncationObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_TruncationObject_last_messages_is_assigned_from_json()
{
    bourne::json input =
    {
        "last_messages", 1
    };

    TruncationObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLastMessages());








}



void test_TruncationObject_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    TruncationObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_TruncationObject_last_messages_is_converted_to_json()
{
    bourne::json input =
    {
        "last_messages", 1
    };

    TruncationObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["last_messages"] == output["last_messages"]);




}


