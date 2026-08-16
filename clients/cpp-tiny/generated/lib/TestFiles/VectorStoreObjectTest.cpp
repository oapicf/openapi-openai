
#include "VectorStoreObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VectorStoreObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    VectorStoreObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_VectorStoreObject_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    VectorStoreObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_VectorStoreObject_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    VectorStoreObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_VectorStoreObject_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    VectorStoreObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_VectorStoreObject_usage_bytes_is_assigned_from_json()
{
    bourne::json input =
    {
        "usage_bytes", 1
    };

    VectorStoreObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUsageBytes());








}



void test_VectorStoreObject_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    VectorStoreObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}



void test_VectorStoreObject_expires_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    VectorStoreObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiresAt());








}


void test_VectorStoreObject_last_active_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "last_active_at", 1
    };

    VectorStoreObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLastActiveAt());








}




void test_VectorStoreObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    VectorStoreObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_VectorStoreObject_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    VectorStoreObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_VectorStoreObject_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    VectorStoreObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_VectorStoreObject_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    VectorStoreObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_VectorStoreObject_usage_bytes_is_converted_to_json()
{
    bourne::json input =
    {
        "usage_bytes", 1
    };

    VectorStoreObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["usage_bytes"] == output["usage_bytes"]);




}



void test_VectorStoreObject_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    VectorStoreObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}



void test_VectorStoreObject_expires_at_is_converted_to_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    VectorStoreObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expires_at"] == output["expires_at"]);




}


void test_VectorStoreObject_last_active_at_is_converted_to_json()
{
    bourne::json input =
    {
        "last_active_at", 1
    };

    VectorStoreObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["last_active_at"] == output["last_active_at"]);




}



