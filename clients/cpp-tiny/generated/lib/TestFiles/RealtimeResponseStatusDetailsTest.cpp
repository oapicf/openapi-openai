
#include "RealtimeResponse_status_details.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeResponse_status_details_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeResponse_status_details obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeResponse_status_details_reason_is_assigned_from_json()
{


    bourne::json input =
    {
        "reason", "hello"
    };

    RealtimeResponse_status_details obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReason().c_str());






}




void test_RealtimeResponse_status_details_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeResponse_status_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeResponse_status_details_reason_is_converted_to_json()
{

    bourne::json input =
    {
        "reason", "hello"
    };

    RealtimeResponse_status_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["reason"] == output["reason"]);



}



