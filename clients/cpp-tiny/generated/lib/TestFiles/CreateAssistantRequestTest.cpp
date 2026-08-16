
#include "CreateAssistantRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CreateAssistantRequest_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CreateAssistantRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_CreateAssistantRequest_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CreateAssistantRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_CreateAssistantRequest_instructions_is_assigned_from_json()
{


    bourne::json input =
    {
        "instructions", "hello"
    };

    CreateAssistantRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInstructions().c_str());






}





void test_CreateAssistantRequest_temperature_is_assigned_from_json()
{








}


void test_CreateAssistantRequest_top_p_is_assigned_from_json()
{








}





void test_CreateAssistantRequest_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CreateAssistantRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_CreateAssistantRequest_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CreateAssistantRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_CreateAssistantRequest_instructions_is_converted_to_json()
{

    bourne::json input =
    {
        "instructions", "hello"
    };

    CreateAssistantRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["instructions"] == output["instructions"]);



}





void test_CreateAssistantRequest_temperature_is_converted_to_json()
{




}


void test_CreateAssistantRequest_top_p_is_converted_to_json()
{




}



