
#include "Model.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Model_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Model obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Model_created_is_assigned_from_json()
{
    bourne::json input =
    {
        "created", 1
    };

    Model obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreated());








}


void test_Model_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    Model obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_Model_owned_by_is_assigned_from_json()
{


    bourne::json input =
    {
        "owned_by", "hello"
    };

    Model obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOwnedBy().c_str());






}



void test_Model_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Model obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Model_created_is_converted_to_json()
{
    bourne::json input =
    {
        "created", 1
    };

    Model obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created"] == output["created"]);




}


void test_Model_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    Model obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_Model_owned_by_is_converted_to_json()
{

    bourne::json input =
    {
        "owned_by", "hello"
    };

    Model obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["owned_by"] == output["owned_by"]);



}


