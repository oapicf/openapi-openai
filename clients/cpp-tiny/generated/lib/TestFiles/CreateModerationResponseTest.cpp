
#include "CreateModerationResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateModerationResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CreateModerationResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CreateModerationResponse_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    CreateModerationResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}




void test_CreateModerationResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CreateModerationResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CreateModerationResponse_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    CreateModerationResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}



