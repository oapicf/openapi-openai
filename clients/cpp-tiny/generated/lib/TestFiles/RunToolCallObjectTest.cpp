
#include "RunToolCallObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunToolCallObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    RunToolCallObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_RunToolCallObject_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RunToolCallObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_RunToolCallObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    RunToolCallObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_RunToolCallObject_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RunToolCallObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



