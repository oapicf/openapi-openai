
#include "BatchRequestOutput_error.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BatchRequestOutput_error_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "code", "hello"
    };

    BatchRequestOutput_error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCode().c_str());






}


void test_BatchRequestOutput_error_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    BatchRequestOutput_error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}



void test_BatchRequestOutput_error_code_is_converted_to_json()
{

    bourne::json input =
    {
        "code", "hello"
    };

    BatchRequestOutput_error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);



}


void test_BatchRequestOutput_error_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    BatchRequestOutput_error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


