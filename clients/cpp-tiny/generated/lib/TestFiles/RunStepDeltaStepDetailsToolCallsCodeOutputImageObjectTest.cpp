
#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "index", 1
    };

    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIndex());








}


void test_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_index_is_converted_to_json()
{
    bourne::json input =
    {
        "index", 1
    };

    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["index"] == output["index"]);




}


void test_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



