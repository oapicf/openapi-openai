
#include "RunStepDetailsToolCallsCodeOutputLogsObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepDetailsToolCallsCodeOutputLogsObject_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RunStepDetailsToolCallsCodeOutputLogsObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RunStepDetailsToolCallsCodeOutputLogsObject_logs_is_assigned_from_json()
{


    bourne::json input =
    {
        "logs", "hello"
    };

    RunStepDetailsToolCallsCodeOutputLogsObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLogs().c_str());






}



void test_RunStepDetailsToolCallsCodeOutputLogsObject_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RunStepDetailsToolCallsCodeOutputLogsObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RunStepDetailsToolCallsCodeOutputLogsObject_logs_is_converted_to_json()
{

    bourne::json input =
    {
        "logs", "hello"
    };

    RunStepDetailsToolCallsCodeOutputLogsObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["logs"] == output["logs"]);



}


