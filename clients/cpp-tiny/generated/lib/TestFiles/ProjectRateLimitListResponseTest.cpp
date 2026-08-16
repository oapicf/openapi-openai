
#include "ProjectRateLimitListResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ProjectRateLimitListResponse_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    ProjectRateLimitListResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}



void test_ProjectRateLimitListResponse_first_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "first_id", "hello"
    };

    ProjectRateLimitListResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFirstId().c_str());






}


void test_ProjectRateLimitListResponse_last_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "last_id", "hello"
    };

    ProjectRateLimitListResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLastId().c_str());






}


void test_ProjectRateLimitListResponse_has_more_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_more", true
    };

    ProjectRateLimitListResponse obj(input.dump());

    TEST_ASSERT(true == obj.isHasMore());




}



void test_ProjectRateLimitListResponse_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    ProjectRateLimitListResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}



void test_ProjectRateLimitListResponse_first_id_is_converted_to_json()
{

    bourne::json input =
    {
        "first_id", "hello"
    };

    ProjectRateLimitListResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["first_id"] == output["first_id"]);



}


void test_ProjectRateLimitListResponse_last_id_is_converted_to_json()
{

    bourne::json input =
    {
        "last_id", "hello"
    };

    ProjectRateLimitListResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["last_id"] == output["last_id"]);



}


void test_ProjectRateLimitListResponse_has_more_is_converted_to_json()
{


    bourne::json input =
    {
        "has_more", true
    };

    ProjectRateLimitListResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_more"] == output["has_more"]);


}


