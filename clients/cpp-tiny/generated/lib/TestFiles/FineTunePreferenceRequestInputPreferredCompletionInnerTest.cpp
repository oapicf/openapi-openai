
#include "FineTunePreferenceRequestInput_preferred_completion_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_FineTunePreferenceRequestInput_preferred_completion_inner_refusal_is_assigned_from_json()
{


    bourne::json input =
    {
        "refusal", "hello"
    };

    FineTunePreferenceRequestInput_preferred_completion_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRefusal().c_str());






}


void test_FineTunePreferenceRequestInput_preferred_completion_inner_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    FineTunePreferenceRequestInput_preferred_completion_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}


void test_FineTunePreferenceRequestInput_preferred_completion_inner_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    FineTunePreferenceRequestInput_preferred_completion_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}







void test_FineTunePreferenceRequestInput_preferred_completion_inner_refusal_is_converted_to_json()
{

    bourne::json input =
    {
        "refusal", "hello"
    };

    FineTunePreferenceRequestInput_preferred_completion_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refusal"] == output["refusal"]);



}


void test_FineTunePreferenceRequestInput_preferred_completion_inner_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    FineTunePreferenceRequestInput_preferred_completion_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


void test_FineTunePreferenceRequestInput_preferred_completion_inner_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    FineTunePreferenceRequestInput_preferred_completion_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}





