
#include "UserRoleUpdateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UserRoleUpdateRequest_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    UserRoleUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}



void test_UserRoleUpdateRequest_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    UserRoleUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


