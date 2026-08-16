
#include "AdminApiKey_owner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdminApiKey_owner_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    AdminApiKey_owner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_AdminApiKey_owner_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AdminApiKey_owner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_AdminApiKey_owner_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AdminApiKey_owner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_AdminApiKey_owner_created_at_is_assigned_from_json()
{






    bourne::json input =
    {
        "created_at", 1
    };

    AdminApiKey_owner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());


}


void test_AdminApiKey_owner_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    AdminApiKey_owner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}



void test_AdminApiKey_owner_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    AdminApiKey_owner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_AdminApiKey_owner_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AdminApiKey_owner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_AdminApiKey_owner_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AdminApiKey_owner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_AdminApiKey_owner_created_at_is_converted_to_json()
{



    bourne::json input =
    {
        "created_at", 1
    };

    AdminApiKey_owner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);

}


void test_AdminApiKey_owner_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    AdminApiKey_owner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


