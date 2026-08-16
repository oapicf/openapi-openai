
#include "CreateUploadRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateUploadRequest_filename_is_assigned_from_json()
{


    bourne::json input =
    {
        "filename", "hello"
    };

    CreateUploadRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFilename().c_str());






}


void test_CreateUploadRequest_purpose_is_assigned_from_json()
{


    bourne::json input =
    {
        "purpose", "hello"
    };

    CreateUploadRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPurpose().c_str());






}


void test_CreateUploadRequest_bytes_is_assigned_from_json()
{
    bourne::json input =
    {
        "bytes", 1
    };

    CreateUploadRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBytes());








}


void test_CreateUploadRequest_mime_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "mime_type", "hello"
    };

    CreateUploadRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMimeType().c_str());






}



void test_CreateUploadRequest_filename_is_converted_to_json()
{

    bourne::json input =
    {
        "filename", "hello"
    };

    CreateUploadRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["filename"] == output["filename"]);



}


void test_CreateUploadRequest_purpose_is_converted_to_json()
{

    bourne::json input =
    {
        "purpose", "hello"
    };

    CreateUploadRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["purpose"] == output["purpose"]);



}


void test_CreateUploadRequest_bytes_is_converted_to_json()
{
    bourne::json input =
    {
        "bytes", 1
    };

    CreateUploadRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bytes"] == output["bytes"]);




}


void test_CreateUploadRequest_mime_type_is_converted_to_json()
{

    bourne::json input =
    {
        "mime_type", "hello"
    };

    CreateUploadRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["mime_type"] == output["mime_type"]);



}


