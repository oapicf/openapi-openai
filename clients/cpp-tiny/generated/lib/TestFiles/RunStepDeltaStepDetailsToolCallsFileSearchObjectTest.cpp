
#include "RunStepDeltaStepDetailsToolCallsFileSearchObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepDeltaStepDetailsToolCallsFileSearchObject_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "index", 1
    };

    RunStepDeltaStepDetailsToolCallsFileSearchObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIndex());








}


void test_RunStepDeltaStepDetailsToolCallsFileSearchObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    RunStepDeltaStepDetailsToolCallsFileSearchObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_RunStepDeltaStepDetailsToolCallsFileSearchObject_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RunStepDeltaStepDetailsToolCallsFileSearchObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_RunStepDeltaStepDetailsToolCallsFileSearchObject_index_is_converted_to_json()
{
    bourne::json input =
    {
        "index", 1
    };

    RunStepDeltaStepDetailsToolCallsFileSearchObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["index"] == output["index"]);




}


void test_RunStepDeltaStepDetailsToolCallsFileSearchObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    RunStepDeltaStepDetailsToolCallsFileSearchObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_RunStepDeltaStepDetailsToolCallsFileSearchObject_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RunStepDeltaStepDetailsToolCallsFileSearchObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



