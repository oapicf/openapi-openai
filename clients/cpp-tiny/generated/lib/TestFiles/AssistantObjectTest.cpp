
#include "AssistantObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AssistantObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AssistantObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_AssistantObject_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    AssistantObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_AssistantObject_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    AssistantObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_AssistantObject_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AssistantObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_AssistantObject_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    AssistantObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_AssistantObject_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    AssistantObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}


void test_AssistantObject_instructions_is_assigned_from_json()
{


    bourne::json input =
    {
        "instructions", "hello"
    };

    AssistantObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInstructions().c_str());






}





void test_AssistantObject_temperature_is_assigned_from_json()
{








}


void test_AssistantObject_top_p_is_assigned_from_json()
{








}




void test_AssistantObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AssistantObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_AssistantObject_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    AssistantObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_AssistantObject_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    AssistantObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_AssistantObject_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AssistantObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_AssistantObject_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    AssistantObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_AssistantObject_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    AssistantObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


void test_AssistantObject_instructions_is_converted_to_json()
{

    bourne::json input =
    {
        "instructions", "hello"
    };

    AssistantObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["instructions"] == output["instructions"]);



}





void test_AssistantObject_temperature_is_converted_to_json()
{




}


void test_AssistantObject_top_p_is_converted_to_json()
{




}



