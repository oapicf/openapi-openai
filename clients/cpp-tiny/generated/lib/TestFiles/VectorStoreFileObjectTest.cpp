
#include "VectorStoreFileObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VectorStoreFileObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    VectorStoreFileObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_VectorStoreFileObject_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    VectorStoreFileObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_VectorStoreFileObject_usage_bytes_is_assigned_from_json()
{
    bourne::json input =
    {
        "usage_bytes", 1
    };

    VectorStoreFileObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUsageBytes());








}


void test_VectorStoreFileObject_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    VectorStoreFileObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_VectorStoreFileObject_vector_store_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "vector_store_id", "hello"
    };

    VectorStoreFileObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVectorStoreId().c_str());






}


void test_VectorStoreFileObject_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    VectorStoreFileObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}





void test_VectorStoreFileObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    VectorStoreFileObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_VectorStoreFileObject_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    VectorStoreFileObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_VectorStoreFileObject_usage_bytes_is_converted_to_json()
{
    bourne::json input =
    {
        "usage_bytes", 1
    };

    VectorStoreFileObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["usage_bytes"] == output["usage_bytes"]);




}


void test_VectorStoreFileObject_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    VectorStoreFileObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_VectorStoreFileObject_vector_store_id_is_converted_to_json()
{

    bourne::json input =
    {
        "vector_store_id", "hello"
    };

    VectorStoreFileObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vector_store_id"] == output["vector_store_id"]);



}


void test_VectorStoreFileObject_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    VectorStoreFileObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}




