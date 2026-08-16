
#include "VectorStoreFileBatchObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VectorStoreFileBatchObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    VectorStoreFileBatchObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_VectorStoreFileBatchObject_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    VectorStoreFileBatchObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_VectorStoreFileBatchObject_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    VectorStoreFileBatchObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_VectorStoreFileBatchObject_vector_store_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "vector_store_id", "hello"
    };

    VectorStoreFileBatchObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVectorStoreId().c_str());






}


void test_VectorStoreFileBatchObject_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    VectorStoreFileBatchObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}




void test_VectorStoreFileBatchObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    VectorStoreFileBatchObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_VectorStoreFileBatchObject_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    VectorStoreFileBatchObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_VectorStoreFileBatchObject_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    VectorStoreFileBatchObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_VectorStoreFileBatchObject_vector_store_id_is_converted_to_json()
{

    bourne::json input =
    {
        "vector_store_id", "hello"
    };

    VectorStoreFileBatchObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vector_store_id"] == output["vector_store_id"]);



}


void test_VectorStoreFileBatchObject_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    VectorStoreFileBatchObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}



