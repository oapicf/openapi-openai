
#include "FineTuningJob.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FineTuningJob_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_FineTuningJob_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}



void test_FineTuningJob_fine_tuned_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "fine_tuned_model", "hello"
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFineTunedModel().c_str());






}


void test_FineTuningJob_finished_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "finished_at", 1
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFinishedAt());








}



void test_FineTuningJob_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}


void test_FineTuningJob_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_FineTuningJob_organization_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "organization_id", "hello"
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrganizationId().c_str());






}



void test_FineTuningJob_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_FineTuningJob_trained_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "trained_tokens", 1
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTrainedTokens());








}


void test_FineTuningJob_training_file_is_assigned_from_json()
{


    bourne::json input =
    {
        "training_file", "hello"
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTrainingFile().c_str());






}


void test_FineTuningJob_validation_file_is_assigned_from_json()
{


    bourne::json input =
    {
        "validation_file", "hello"
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValidationFile().c_str());






}



void test_FineTuningJob_seed_is_assigned_from_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSeed());








}


void test_FineTuningJob_estimated_finish_is_assigned_from_json()
{
    bourne::json input =
    {
        "estimated_finish", 1
    };

    FineTuningJob obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEstimatedFinish());








}




void test_FineTuningJob_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_FineTuningJob_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}



void test_FineTuningJob_fine_tuned_model_is_converted_to_json()
{

    bourne::json input =
    {
        "fine_tuned_model", "hello"
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fine_tuned_model"] == output["fine_tuned_model"]);



}


void test_FineTuningJob_finished_at_is_converted_to_json()
{
    bourne::json input =
    {
        "finished_at", 1
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["finished_at"] == output["finished_at"]);




}



void test_FineTuningJob_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


void test_FineTuningJob_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_FineTuningJob_organization_id_is_converted_to_json()
{

    bourne::json input =
    {
        "organization_id", "hello"
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["organization_id"] == output["organization_id"]);



}



void test_FineTuningJob_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_FineTuningJob_trained_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "trained_tokens", 1
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["trained_tokens"] == output["trained_tokens"]);




}


void test_FineTuningJob_training_file_is_converted_to_json()
{

    bourne::json input =
    {
        "training_file", "hello"
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["training_file"] == output["training_file"]);



}


void test_FineTuningJob_validation_file_is_converted_to_json()
{

    bourne::json input =
    {
        "validation_file", "hello"
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["validation_file"] == output["validation_file"]);



}



void test_FineTuningJob_seed_is_converted_to_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["seed"] == output["seed"]);




}


void test_FineTuningJob_estimated_finish_is_converted_to_json()
{
    bourne::json input =
    {
        "estimated_finish", 1
    };

    FineTuningJob obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["estimated_finish"] == output["estimated_finish"]);




}



