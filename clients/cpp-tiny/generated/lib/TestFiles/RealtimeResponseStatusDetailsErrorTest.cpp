
#include "RealtimeResponse_status_details_error.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeResponse_status_details_error_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeResponse_status_details_error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeResponse_status_details_error_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "code", "hello"
    };

    RealtimeResponse_status_details_error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCode().c_str());






}



void test_RealtimeResponse_status_details_error_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeResponse_status_details_error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeResponse_status_details_error_code_is_converted_to_json()
{

    bourne::json input =
    {
        "code", "hello"
    };

    RealtimeResponse_status_details_error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);



}


