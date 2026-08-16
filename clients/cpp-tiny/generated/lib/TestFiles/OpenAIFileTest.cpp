
#include "OpenAIFile.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OpenAIFile_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    OpenAIFile obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_OpenAIFile_bytes_is_assigned_from_json()
{
    bourne::json input =
    {
        "bytes", 1
    };

    OpenAIFile obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBytes());








}


void test_OpenAIFile_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    OpenAIFile obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_OpenAIFile_filename_is_assigned_from_json()
{


    bourne::json input =
    {
        "filename", "hello"
    };

    OpenAIFile obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFilename().c_str());






}


void test_OpenAIFile_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    OpenAIFile obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_OpenAIFile_purpose_is_assigned_from_json()
{


    bourne::json input =
    {
        "purpose", "hello"
    };

    OpenAIFile obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPurpose().c_str());






}


void test_OpenAIFile_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    OpenAIFile obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_OpenAIFile_status_details_is_assigned_from_json()
{


    bourne::json input =
    {
        "status_details", "hello"
    };

    OpenAIFile obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatusDetails().c_str());






}



void test_OpenAIFile_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    OpenAIFile obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_OpenAIFile_bytes_is_converted_to_json()
{
    bourne::json input =
    {
        "bytes", 1
    };

    OpenAIFile obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bytes"] == output["bytes"]);




}


void test_OpenAIFile_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    OpenAIFile obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_OpenAIFile_filename_is_converted_to_json()
{

    bourne::json input =
    {
        "filename", "hello"
    };

    OpenAIFile obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["filename"] == output["filename"]);



}


void test_OpenAIFile_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    OpenAIFile obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_OpenAIFile_purpose_is_converted_to_json()
{

    bourne::json input =
    {
        "purpose", "hello"
    };

    OpenAIFile obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["purpose"] == output["purpose"]);



}


void test_OpenAIFile_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    OpenAIFile obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_OpenAIFile_status_details_is_converted_to_json()
{

    bourne::json input =
    {
        "status_details", "hello"
    };

    OpenAIFile obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status_details"] == output["status_details"]);



}


