
#include "BatchRequestInput.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BatchRequestInput_custom_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_id", "hello"
    };

    BatchRequestInput obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomId().c_str());






}


void test_BatchRequestInput_method_is_assigned_from_json()
{


    bourne::json input =
    {
        "method", "hello"
    };

    BatchRequestInput obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMethod().c_str());






}


void test_BatchRequestInput_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    BatchRequestInput obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_BatchRequestInput_custom_id_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_id", "hello"
    };

    BatchRequestInput obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_id"] == output["custom_id"]);



}


void test_BatchRequestInput_method_is_converted_to_json()
{

    bourne::json input =
    {
        "method", "hello"
    };

    BatchRequestInput obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["method"] == output["method"]);



}


void test_BatchRequestInput_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    BatchRequestInput obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


