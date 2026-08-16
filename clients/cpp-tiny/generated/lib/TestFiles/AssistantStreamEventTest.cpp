
#include "AssistantStreamEvent.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AssistantStreamEvent_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "enabled", true
    };

    AssistantStreamEvent obj(input.dump());

    TEST_ASSERT(true == obj.isEnabled());




}


void test_AssistantStreamEvent_event_is_assigned_from_json()
{


    bourne::json input =
    {
        "event", "hello"
    };

    AssistantStreamEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEvent().c_str());






}


void test_AssistantStreamEvent_data_is_assigned_from_json()
{


    bourne::json input =
    {
        "data", "hello"
    };

    AssistantStreamEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getData().c_str());






}



void test_AssistantStreamEvent_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "enabled", true
    };

    AssistantStreamEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["enabled"] == output["enabled"]);


}


void test_AssistantStreamEvent_event_is_converted_to_json()
{

    bourne::json input =
    {
        "event", "hello"
    };

    AssistantStreamEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event"] == output["event"]);



}


void test_AssistantStreamEvent_data_is_converted_to_json()
{

    bourne::json input =
    {
        "data", "hello"
    };

    AssistantStreamEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data"] == output["data"]);



}


