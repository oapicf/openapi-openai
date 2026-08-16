
#include "MessageStreamEvent_oneOf.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MessageStreamEvent_oneOf_event_is_assigned_from_json()
{


    bourne::json input =
    {
        "event", "hello"
    };

    MessageStreamEvent_oneOf obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEvent().c_str());






}




void test_MessageStreamEvent_oneOf_event_is_converted_to_json()
{

    bourne::json input =
    {
        "event", "hello"
    };

    MessageStreamEvent_oneOf obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event"] == output["event"]);



}



