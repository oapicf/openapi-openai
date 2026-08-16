
#include "UploadPart.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UploadPart_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    UploadPart obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_UploadPart_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    UploadPart obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_UploadPart_upload_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "upload_id", "hello"
    };

    UploadPart obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUploadId().c_str());






}


void test_UploadPart_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    UploadPart obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}



void test_UploadPart_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    UploadPart obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_UploadPart_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    UploadPart obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_UploadPart_upload_id_is_converted_to_json()
{

    bourne::json input =
    {
        "upload_id", "hello"
    };

    UploadPart obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["upload_id"] == output["upload_id"]);



}


void test_UploadPart_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    UploadPart obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


