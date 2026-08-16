
#include "SubmitToolOutputsRunRequest_tool_outputs_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SubmitToolOutputsRunRequest_tool_outputs_inner_tool_call_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "tool_call_id", "hello"
    };

    SubmitToolOutputsRunRequest_tool_outputs_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToolCallId().c_str());






}


void test_SubmitToolOutputsRunRequest_tool_outputs_inner_output_is_assigned_from_json()
{


    bourne::json input =
    {
        "output", "hello"
    };

    SubmitToolOutputsRunRequest_tool_outputs_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOutput().c_str());






}



void test_SubmitToolOutputsRunRequest_tool_outputs_inner_tool_call_id_is_converted_to_json()
{

    bourne::json input =
    {
        "tool_call_id", "hello"
    };

    SubmitToolOutputsRunRequest_tool_outputs_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tool_call_id"] == output["tool_call_id"]);



}


void test_SubmitToolOutputsRunRequest_tool_outputs_inner_output_is_converted_to_json()
{

    bourne::json input =
    {
        "output", "hello"
    };

    SubmitToolOutputsRunRequest_tool_outputs_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output"] == output["output"]);



}


