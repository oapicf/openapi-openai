
#include "RealtimeClientEventResponseCreate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeClientEventResponseCreate_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeClientEventResponseCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_RealtimeClientEventResponseCreate_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeClientEventResponseCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_RealtimeClientEventResponseCreate_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeClientEventResponseCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_RealtimeClientEventResponseCreate_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeClientEventResponseCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



