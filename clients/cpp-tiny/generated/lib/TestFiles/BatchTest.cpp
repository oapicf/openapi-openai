
#include "Batch.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Batch_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Batch_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_Batch_endpoint_is_assigned_from_json()
{


    bourne::json input =
    {
        "endpoint", "hello"
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEndpoint().c_str());






}



void test_Batch_input_file_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "input_file_id", "hello"
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInputFileId().c_str());






}


void test_Batch_completion_window_is_assigned_from_json()
{


    bourne::json input =
    {
        "completion_window", "hello"
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCompletionWindow().c_str());






}


void test_Batch_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_Batch_output_file_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "output_file_id", "hello"
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOutputFileId().c_str());






}


void test_Batch_error_file_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "error_file_id", "hello"
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getErrorFileId().c_str());






}


void test_Batch_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_Batch_in_progress_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "in_progress_at", 1
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInProgressAt());








}


void test_Batch_expires_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiresAt());








}


void test_Batch_finalizing_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "finalizing_at", 1
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFinalizingAt());








}


void test_Batch_completed_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "completed_at", 1
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCompletedAt());








}


void test_Batch_failed_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "failed_at", 1
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFailedAt());








}


void test_Batch_expired_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "expired_at", 1
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiredAt());








}


void test_Batch_cancelling_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "cancelling_at", 1
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCancellingAt());








}


void test_Batch_cancelled_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "cancelled_at", 1
    };

    Batch obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCancelledAt());








}





void test_Batch_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Batch_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_Batch_endpoint_is_converted_to_json()
{

    bourne::json input =
    {
        "endpoint", "hello"
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["endpoint"] == output["endpoint"]);



}



void test_Batch_input_file_id_is_converted_to_json()
{

    bourne::json input =
    {
        "input_file_id", "hello"
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_file_id"] == output["input_file_id"]);



}


void test_Batch_completion_window_is_converted_to_json()
{

    bourne::json input =
    {
        "completion_window", "hello"
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completion_window"] == output["completion_window"]);



}


void test_Batch_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_Batch_output_file_id_is_converted_to_json()
{

    bourne::json input =
    {
        "output_file_id", "hello"
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_file_id"] == output["output_file_id"]);



}


void test_Batch_error_file_id_is_converted_to_json()
{

    bourne::json input =
    {
        "error_file_id", "hello"
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["error_file_id"] == output["error_file_id"]);



}


void test_Batch_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_Batch_in_progress_at_is_converted_to_json()
{
    bourne::json input =
    {
        "in_progress_at", 1
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["in_progress_at"] == output["in_progress_at"]);




}


void test_Batch_expires_at_is_converted_to_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expires_at"] == output["expires_at"]);




}


void test_Batch_finalizing_at_is_converted_to_json()
{
    bourne::json input =
    {
        "finalizing_at", 1
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["finalizing_at"] == output["finalizing_at"]);




}


void test_Batch_completed_at_is_converted_to_json()
{
    bourne::json input =
    {
        "completed_at", 1
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completed_at"] == output["completed_at"]);




}


void test_Batch_failed_at_is_converted_to_json()
{
    bourne::json input =
    {
        "failed_at", 1
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["failed_at"] == output["failed_at"]);




}


void test_Batch_expired_at_is_converted_to_json()
{
    bourne::json input =
    {
        "expired_at", 1
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expired_at"] == output["expired_at"]);




}


void test_Batch_cancelling_at_is_converted_to_json()
{
    bourne::json input =
    {
        "cancelling_at", 1
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cancelling_at"] == output["cancelling_at"]);




}


void test_Batch_cancelled_at_is_converted_to_json()
{
    bourne::json input =
    {
        "cancelled_at", 1
    };

    Batch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cancelled_at"] == output["cancelled_at"]);




}




