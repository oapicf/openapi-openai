
#include "ProjectUserCreateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ProjectUserCreateRequest_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_id", "hello"
    };

    ProjectUserCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserId().c_str());






}


void test_ProjectUserCreateRequest_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    ProjectUserCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}



void test_ProjectUserCreateRequest_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "user_id", "hello"
    };

    ProjectUserCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_id"] == output["user_id"]);



}


void test_ProjectUserCreateRequest_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    ProjectUserCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


