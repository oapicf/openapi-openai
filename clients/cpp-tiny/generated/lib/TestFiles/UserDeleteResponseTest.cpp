
#include "UserDeleteResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UserDeleteResponse_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    UserDeleteResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_UserDeleteResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    UserDeleteResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_UserDeleteResponse_deleted_is_assigned_from_json()
{




    bourne::json input =
    {
        "deleted", true
    };

    UserDeleteResponse obj(input.dump());

    TEST_ASSERT(true == obj.isDeleted());




}



void test_UserDeleteResponse_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    UserDeleteResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_UserDeleteResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    UserDeleteResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_UserDeleteResponse_deleted_is_converted_to_json()
{


    bourne::json input =
    {
        "deleted", true
    };

    UserDeleteResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deleted"] == output["deleted"]);


}


