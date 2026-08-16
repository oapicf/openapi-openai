
#include "FineTuningJobCheckpoint.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FineTuningJobCheckpoint_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    FineTuningJobCheckpoint obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_FineTuningJobCheckpoint_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    FineTuningJobCheckpoint obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_FineTuningJobCheckpoint_fine_tuned_model_checkpoint_is_assigned_from_json()
{


    bourne::json input =
    {
        "fine_tuned_model_checkpoint", "hello"
    };

    FineTuningJobCheckpoint obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFineTunedModelCheckpoint().c_str());






}


void test_FineTuningJobCheckpoint_step_number_is_assigned_from_json()
{
    bourne::json input =
    {
        "step_number", 1
    };

    FineTuningJobCheckpoint obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStepNumber());








}



void test_FineTuningJobCheckpoint_fine_tuning_job_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "fine_tuning_job_id", "hello"
    };

    FineTuningJobCheckpoint obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFineTuningJobId().c_str());






}


void test_FineTuningJobCheckpoint_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    FineTuningJobCheckpoint obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}



void test_FineTuningJobCheckpoint_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    FineTuningJobCheckpoint obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_FineTuningJobCheckpoint_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    FineTuningJobCheckpoint obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_FineTuningJobCheckpoint_fine_tuned_model_checkpoint_is_converted_to_json()
{

    bourne::json input =
    {
        "fine_tuned_model_checkpoint", "hello"
    };

    FineTuningJobCheckpoint obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fine_tuned_model_checkpoint"] == output["fine_tuned_model_checkpoint"]);



}


void test_FineTuningJobCheckpoint_step_number_is_converted_to_json()
{
    bourne::json input =
    {
        "step_number", 1
    };

    FineTuningJobCheckpoint obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["step_number"] == output["step_number"]);




}



void test_FineTuningJobCheckpoint_fine_tuning_job_id_is_converted_to_json()
{

    bourne::json input =
    {
        "fine_tuning_job_id", "hello"
    };

    FineTuningJobCheckpoint obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fine_tuning_job_id"] == output["fine_tuning_job_id"]);



}


void test_FineTuningJobCheckpoint_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    FineTuningJobCheckpoint obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


