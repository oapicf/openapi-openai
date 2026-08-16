
#include "RealtimeResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    RealtimeResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_RealtimeResponse_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    RealtimeResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_RealtimeResponse_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    RealtimeResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}







void test_RealtimeResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    RealtimeResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_RealtimeResponse_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    RealtimeResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_RealtimeResponse_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    RealtimeResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}






