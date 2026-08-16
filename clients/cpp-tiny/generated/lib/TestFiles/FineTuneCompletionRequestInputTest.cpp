
#include "FineTuneCompletionRequestInput.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FineTuneCompletionRequestInput_prompt_is_assigned_from_json()
{


    bourne::json input =
    {
        "prompt", "hello"
    };

    FineTuneCompletionRequestInput obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPrompt().c_str());






}


void test_FineTuneCompletionRequestInput_completion_is_assigned_from_json()
{


    bourne::json input =
    {
        "completion", "hello"
    };

    FineTuneCompletionRequestInput obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCompletion().c_str());






}



void test_FineTuneCompletionRequestInput_prompt_is_converted_to_json()
{

    bourne::json input =
    {
        "prompt", "hello"
    };

    FineTuneCompletionRequestInput obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["prompt"] == output["prompt"]);



}


void test_FineTuneCompletionRequestInput_completion_is_converted_to_json()
{

    bourne::json input =
    {
        "completion", "hello"
    };

    FineTuneCompletionRequestInput obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completion"] == output["completion"]);



}


