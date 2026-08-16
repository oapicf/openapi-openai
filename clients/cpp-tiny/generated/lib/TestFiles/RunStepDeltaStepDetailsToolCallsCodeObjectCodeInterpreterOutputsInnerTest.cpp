
#include "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "index", 1
    };

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIndex());








}


void test_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_logs_is_assigned_from_json()
{


    bourne::json input =
    {
        "logs", "hello"
    };

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLogs().c_str());






}




void test_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_index_is_converted_to_json()
{
    bourne::json input =
    {
        "index", 1
    };

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["index"] == output["index"]);




}


void test_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_logs_is_converted_to_json()
{

    bourne::json input =
    {
        "logs", "hello"
    };

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["logs"] == output["logs"]);



}



