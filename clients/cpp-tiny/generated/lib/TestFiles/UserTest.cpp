
#include "User.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_User_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    User obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_User_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    User obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_User_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    User obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_User_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "email", "hello"
    };

    User obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmail().c_str());






}


void test_User_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    User obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}


void test_User_added_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "added_at", 1
    };

    User obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAddedAt());








}



void test_User_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    User obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_User_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    User obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_User_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    User obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_User_email_is_converted_to_json()
{

    bourne::json input =
    {
        "email", "hello"
    };

    User obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email"] == output["email"]);



}


void test_User_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    User obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


void test_User_added_at_is_converted_to_json()
{
    bourne::json input =
    {
        "added_at", 1
    };

    User obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["added_at"] == output["added_at"]);




}


