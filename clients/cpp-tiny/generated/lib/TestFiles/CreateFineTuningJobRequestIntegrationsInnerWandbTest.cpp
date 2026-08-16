
#include "CreateFineTuningJobRequest_integrations_inner_wandb.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateFineTuningJobRequest_integrations_inner_wandb_project_is_assigned_from_json()
{


    bourne::json input =
    {
        "project", "hello"
    };

    CreateFineTuningJobRequest_integrations_inner_wandb obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProject().c_str());






}


void test_CreateFineTuningJobRequest_integrations_inner_wandb_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CreateFineTuningJobRequest_integrations_inner_wandb obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_CreateFineTuningJobRequest_integrations_inner_wandb_entity_is_assigned_from_json()
{


    bourne::json input =
    {
        "entity", "hello"
    };

    CreateFineTuningJobRequest_integrations_inner_wandb obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEntity().c_str());






}




void test_CreateFineTuningJobRequest_integrations_inner_wandb_project_is_converted_to_json()
{

    bourne::json input =
    {
        "project", "hello"
    };

    CreateFineTuningJobRequest_integrations_inner_wandb obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["project"] == output["project"]);



}


void test_CreateFineTuningJobRequest_integrations_inner_wandb_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CreateFineTuningJobRequest_integrations_inner_wandb obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_CreateFineTuningJobRequest_integrations_inner_wandb_entity_is_converted_to_json()
{

    bourne::json input =
    {
        "entity", "hello"
    };

    CreateFineTuningJobRequest_integrations_inner_wandb obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["entity"] == output["entity"]);



}



