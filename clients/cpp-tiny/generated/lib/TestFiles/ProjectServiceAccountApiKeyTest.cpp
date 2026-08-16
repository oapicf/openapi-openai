
#include "ProjectServiceAccountApiKey.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ProjectServiceAccountApiKey_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    ProjectServiceAccountApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_ProjectServiceAccountApiKey_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    ProjectServiceAccountApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}


void test_ProjectServiceAccountApiKey_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ProjectServiceAccountApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_ProjectServiceAccountApiKey_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    ProjectServiceAccountApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_ProjectServiceAccountApiKey_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    ProjectServiceAccountApiKey obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_ProjectServiceAccountApiKey_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    ProjectServiceAccountApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_ProjectServiceAccountApiKey_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    ProjectServiceAccountApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


void test_ProjectServiceAccountApiKey_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ProjectServiceAccountApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_ProjectServiceAccountApiKey_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    ProjectServiceAccountApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_ProjectServiceAccountApiKey_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    ProjectServiceAccountApiKey obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


