
#include "CreateBatch_request.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateBatch_request_input_file_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "input_file_id", "hello"
    };

    CreateBatch_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInputFileId().c_str());






}


void test_CreateBatch_request_endpoint_is_assigned_from_json()
{


    bourne::json input =
    {
        "endpoint", "hello"
    };

    CreateBatch_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEndpoint().c_str());






}


void test_CreateBatch_request_completion_window_is_assigned_from_json()
{


    bourne::json input =
    {
        "completion_window", "hello"
    };

    CreateBatch_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCompletionWindow().c_str());






}


void test_CreateBatch_request_metadata_is_assigned_from_json()
{








}



void test_CreateBatch_request_input_file_id_is_converted_to_json()
{

    bourne::json input =
    {
        "input_file_id", "hello"
    };

    CreateBatch_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_file_id"] == output["input_file_id"]);



}


void test_CreateBatch_request_endpoint_is_converted_to_json()
{

    bourne::json input =
    {
        "endpoint", "hello"
    };

    CreateBatch_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["endpoint"] == output["endpoint"]);



}


void test_CreateBatch_request_completion_window_is_converted_to_json()
{

    bourne::json input =
    {
        "completion_window", "hello"
    };

    CreateBatch_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completion_window"] == output["completion_window"]);



}


void test_CreateBatch_request_metadata_is_converted_to_json()
{




}


