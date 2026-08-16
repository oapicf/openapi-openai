
#include "BatchRequestOutput.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BatchRequestOutput_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    BatchRequestOutput obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_BatchRequestOutput_custom_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_id", "hello"
    };

    BatchRequestOutput obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomId().c_str());






}





void test_BatchRequestOutput_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    BatchRequestOutput obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_BatchRequestOutput_custom_id_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_id", "hello"
    };

    BatchRequestOutput obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_id"] == output["custom_id"]);



}




