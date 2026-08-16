
#include "ProjectRateLimitUpdateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ProjectRateLimitUpdateRequest_max_requests_per_1_minute_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_requests_per_1_minute", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxRequestsPer1Minute());








}


void test_ProjectRateLimitUpdateRequest_max_tokens_per_1_minute_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_tokens_per_1_minute", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxTokensPer1Minute());








}


void test_ProjectRateLimitUpdateRequest_max_images_per_1_minute_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_images_per_1_minute", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxImagesPer1Minute());








}


void test_ProjectRateLimitUpdateRequest_max_audio_megabytes_per_1_minute_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_audio_megabytes_per_1_minute", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxAudioMegabytesPer1Minute());








}


void test_ProjectRateLimitUpdateRequest_max_requests_per_1_day_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_requests_per_1_day", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxRequestsPer1Day());








}


void test_ProjectRateLimitUpdateRequest_batch_1_day_max_input_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "batch_1_day_max_input_tokens", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBatch1DayMaxInputTokens());








}



void test_ProjectRateLimitUpdateRequest_max_requests_per_1_minute_is_converted_to_json()
{
    bourne::json input =
    {
        "max_requests_per_1_minute", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_requests_per_1_minute"] == output["max_requests_per_1_minute"]);




}


void test_ProjectRateLimitUpdateRequest_max_tokens_per_1_minute_is_converted_to_json()
{
    bourne::json input =
    {
        "max_tokens_per_1_minute", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_tokens_per_1_minute"] == output["max_tokens_per_1_minute"]);




}


void test_ProjectRateLimitUpdateRequest_max_images_per_1_minute_is_converted_to_json()
{
    bourne::json input =
    {
        "max_images_per_1_minute", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_images_per_1_minute"] == output["max_images_per_1_minute"]);




}


void test_ProjectRateLimitUpdateRequest_max_audio_megabytes_per_1_minute_is_converted_to_json()
{
    bourne::json input =
    {
        "max_audio_megabytes_per_1_minute", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_audio_megabytes_per_1_minute"] == output["max_audio_megabytes_per_1_minute"]);




}


void test_ProjectRateLimitUpdateRequest_max_requests_per_1_day_is_converted_to_json()
{
    bourne::json input =
    {
        "max_requests_per_1_day", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_requests_per_1_day"] == output["max_requests_per_1_day"]);




}


void test_ProjectRateLimitUpdateRequest_batch_1_day_max_input_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "batch_1_day_max_input_tokens", 1
    };

    ProjectRateLimitUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["batch_1_day_max_input_tokens"] == output["batch_1_day_max_input_tokens"]);




}


