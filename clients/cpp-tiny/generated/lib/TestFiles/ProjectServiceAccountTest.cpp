
#include "ProjectServiceAccount.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ProjectServiceAccount_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    ProjectServiceAccount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_ProjectServiceAccount_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    ProjectServiceAccount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_ProjectServiceAccount_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ProjectServiceAccount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_ProjectServiceAccount_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    ProjectServiceAccount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}


void test_ProjectServiceAccount_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    ProjectServiceAccount obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}



void test_ProjectServiceAccount_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    ProjectServiceAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_ProjectServiceAccount_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    ProjectServiceAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_ProjectServiceAccount_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ProjectServiceAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_ProjectServiceAccount_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    ProjectServiceAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


void test_ProjectServiceAccount_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    ProjectServiceAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


