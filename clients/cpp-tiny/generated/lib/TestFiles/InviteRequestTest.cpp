
#include "InviteRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_InviteRequest_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "email", "hello"
    };

    InviteRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmail().c_str());






}


void test_InviteRequest_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    InviteRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}




void test_InviteRequest_email_is_converted_to_json()
{

    bourne::json input =
    {
        "email", "hello"
    };

    InviteRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email"] == output["email"]);



}


void test_InviteRequest_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    InviteRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}



