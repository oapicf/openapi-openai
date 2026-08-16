
#include "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_input_is_assigned_from_json()
{


    bourne::json input =
    {
        "input", "hello"
    };

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInput().c_str());






}




void test_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_input_is_converted_to_json()
{

    bourne::json input =
    {
        "input", "hello"
    };

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input"] == output["input"]);



}



