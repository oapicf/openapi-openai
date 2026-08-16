
#include "RunStepDetailsToolCallsFunctionObject_function.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepDetailsToolCallsFunctionObject_function_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    RunStepDetailsToolCallsFunctionObject_function obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_RunStepDetailsToolCallsFunctionObject_function_arguments_is_assigned_from_json()
{


    bourne::json input =
    {
        "arguments", "hello"
    };

    RunStepDetailsToolCallsFunctionObject_function obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getArguments().c_str());






}


void test_RunStepDetailsToolCallsFunctionObject_function_output_is_assigned_from_json()
{


    bourne::json input =
    {
        "output", "hello"
    };

    RunStepDetailsToolCallsFunctionObject_function obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOutput().c_str());






}



void test_RunStepDetailsToolCallsFunctionObject_function_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    RunStepDetailsToolCallsFunctionObject_function obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_RunStepDetailsToolCallsFunctionObject_function_arguments_is_converted_to_json()
{

    bourne::json input =
    {
        "arguments", "hello"
    };

    RunStepDetailsToolCallsFunctionObject_function obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["arguments"] == output["arguments"]);



}


void test_RunStepDetailsToolCallsFunctionObject_function_output_is_converted_to_json()
{

    bourne::json input =
    {
        "output", "hello"
    };

    RunStepDetailsToolCallsFunctionObject_function obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output"] == output["output"]);



}


