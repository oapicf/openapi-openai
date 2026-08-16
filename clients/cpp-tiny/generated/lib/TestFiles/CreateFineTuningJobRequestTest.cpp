
#include "CreateFineTuningJobRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CreateFineTuningJobRequest_training_file_is_assigned_from_json()
{


    bourne::json input =
    {
        "training_file", "hello"
    };

    CreateFineTuningJobRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTrainingFile().c_str());






}



void test_CreateFineTuningJobRequest_suffix_is_assigned_from_json()
{


    bourne::json input =
    {
        "suffix", "hello"
    };

    CreateFineTuningJobRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSuffix().c_str());






}


void test_CreateFineTuningJobRequest_validation_file_is_assigned_from_json()
{


    bourne::json input =
    {
        "validation_file", "hello"
    };

    CreateFineTuningJobRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValidationFile().c_str());






}



void test_CreateFineTuningJobRequest_seed_is_assigned_from_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    CreateFineTuningJobRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSeed());








}





void test_CreateFineTuningJobRequest_training_file_is_converted_to_json()
{

    bourne::json input =
    {
        "training_file", "hello"
    };

    CreateFineTuningJobRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["training_file"] == output["training_file"]);



}



void test_CreateFineTuningJobRequest_suffix_is_converted_to_json()
{

    bourne::json input =
    {
        "suffix", "hello"
    };

    CreateFineTuningJobRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["suffix"] == output["suffix"]);



}


void test_CreateFineTuningJobRequest_validation_file_is_converted_to_json()
{

    bourne::json input =
    {
        "validation_file", "hello"
    };

    CreateFineTuningJobRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["validation_file"] == output["validation_file"]);



}



void test_CreateFineTuningJobRequest_seed_is_converted_to_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    CreateFineTuningJobRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["seed"] == output["seed"]);




}



