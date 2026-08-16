
#include "ThreadStreamEvent.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ThreadStreamEvent_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "enabled", true
    };

    ThreadStreamEvent obj(input.dump());

    TEST_ASSERT(true == obj.isEnabled());




}


void test_ThreadStreamEvent_event_is_assigned_from_json()
{


    bourne::json input =
    {
        "event", "hello"
    };

    ThreadStreamEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEvent().c_str());






}




void test_ThreadStreamEvent_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "enabled", true
    };

    ThreadStreamEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["enabled"] == output["enabled"]);


}


void test_ThreadStreamEvent_event_is_converted_to_json()
{

    bourne::json input =
    {
        "event", "hello"
    };

    ThreadStreamEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event"] == output["event"]);



}



