
#include "Upload.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Upload_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Upload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Upload_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    Upload obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_Upload_filename_is_assigned_from_json()
{


    bourne::json input =
    {
        "filename", "hello"
    };

    Upload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFilename().c_str());






}


void test_Upload_bytes_is_assigned_from_json()
{
    bourne::json input =
    {
        "bytes", 1
    };

    Upload obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBytes());








}


void test_Upload_purpose_is_assigned_from_json()
{


    bourne::json input =
    {
        "purpose", "hello"
    };

    Upload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPurpose().c_str());






}


void test_Upload_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    Upload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_Upload_expires_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    Upload obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiresAt());








}


void test_Upload_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    Upload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}




void test_Upload_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Upload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Upload_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    Upload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_Upload_filename_is_converted_to_json()
{

    bourne::json input =
    {
        "filename", "hello"
    };

    Upload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["filename"] == output["filename"]);



}


void test_Upload_bytes_is_converted_to_json()
{
    bourne::json input =
    {
        "bytes", 1
    };

    Upload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bytes"] == output["bytes"]);




}


void test_Upload_purpose_is_converted_to_json()
{

    bourne::json input =
    {
        "purpose", "hello"
    };

    Upload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["purpose"] == output["purpose"]);



}


void test_Upload_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    Upload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_Upload_expires_at_is_converted_to_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    Upload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expires_at"] == output["expires_at"]);




}


void test_Upload_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    Upload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}



