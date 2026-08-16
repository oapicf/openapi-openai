
#include "FineTuningJob_error.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FineTuningJob_error_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "code", "hello"
    };

    FineTuningJob_error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCode().c_str());






}


void test_FineTuningJob_error_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    FineTuningJob_error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_FineTuningJob_error_param_is_assigned_from_json()
{


    bourne::json input =
    {
        "param", "hello"
    };

    FineTuningJob_error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParam().c_str());






}



void test_FineTuningJob_error_code_is_converted_to_json()
{

    bourne::json input =
    {
        "code", "hello"
    };

    FineTuningJob_error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);



}


void test_FineTuningJob_error_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    FineTuningJob_error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_FineTuningJob_error_param_is_converted_to_json()
{

    bourne::json input =
    {
        "param", "hello"
    };

    FineTuningJob_error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["param"] == output["param"]);



}


