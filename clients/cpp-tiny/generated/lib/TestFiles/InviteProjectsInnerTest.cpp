
#include "Invite_projects_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Invite_projects_inner_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Invite_projects_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Invite_projects_inner_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    Invite_projects_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}



void test_Invite_projects_inner_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Invite_projects_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Invite_projects_inner_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    Invite_projects_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


