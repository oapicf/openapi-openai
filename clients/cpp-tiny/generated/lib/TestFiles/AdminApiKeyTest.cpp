
#include "AdminApiKey.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdminApiKey_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    AdminApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_AdminApiKey_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AdminApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_AdminApiKey_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AdminApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_AdminApiKey_redacted_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "redacted_value", "hello"
    };

    AdminApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRedactedValue().c_str());






}


void test_AdminApiKey_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    AdminApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}


void test_AdminApiKey_created_at_is_assigned_from_json()
{






    bourne::json input =
    {
        "created_at", 1
    };

    AdminApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());


}




void test_AdminApiKey_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    AdminApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_AdminApiKey_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AdminApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_AdminApiKey_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AdminApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_AdminApiKey_redacted_value_is_converted_to_json()
{

    bourne::json input =
    {
        "redacted_value", "hello"
    };

    AdminApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["redacted_value"] == output["redacted_value"]);



}


void test_AdminApiKey_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    AdminApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


void test_AdminApiKey_created_at_is_converted_to_json()
{



    bourne::json input =
    {
        "created_at", 1
    };

    AdminApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);

}



