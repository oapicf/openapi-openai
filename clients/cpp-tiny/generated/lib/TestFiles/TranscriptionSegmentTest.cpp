
#include "TranscriptionSegment.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TranscriptionSegment_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    TranscriptionSegment obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_TranscriptionSegment_seek_is_assigned_from_json()
{
    bourne::json input =
    {
        "seek", 1
    };

    TranscriptionSegment obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSeek());








}


void test_TranscriptionSegment_start_is_assigned_from_json()
{








    bourne::json input =
    {
        "start", 1.0
    };

    TranscriptionSegment obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getStart());
}


void test_TranscriptionSegment_end_is_assigned_from_json()
{








    bourne::json input =
    {
        "end", 1.0
    };

    TranscriptionSegment obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getEnd());
}


void test_TranscriptionSegment_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    TranscriptionSegment obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}



void test_TranscriptionSegment_temperature_is_assigned_from_json()
{








    bourne::json input =
    {
        "temperature", 1.0
    };

    TranscriptionSegment obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getTemperature());
}


void test_TranscriptionSegment_avg_logprob_is_assigned_from_json()
{








    bourne::json input =
    {
        "avg_logprob", 1.0
    };

    TranscriptionSegment obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getAvgLogprob());
}


void test_TranscriptionSegment_compression_ratio_is_assigned_from_json()
{








    bourne::json input =
    {
        "compression_ratio", 1.0
    };

    TranscriptionSegment obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getCompressionRatio());
}


void test_TranscriptionSegment_no_speech_prob_is_assigned_from_json()
{








    bourne::json input =
    {
        "no_speech_prob", 1.0
    };

    TranscriptionSegment obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getNoSpeechProb());
}



void test_TranscriptionSegment_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    TranscriptionSegment obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_TranscriptionSegment_seek_is_converted_to_json()
{
    bourne::json input =
    {
        "seek", 1
    };

    TranscriptionSegment obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["seek"] == output["seek"]);




}


void test_TranscriptionSegment_start_is_converted_to_json()
{




    bourne::json input =
    {
        "start", 1.0
    };

    TranscriptionSegment obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start"] == output["start"]);
}


void test_TranscriptionSegment_end_is_converted_to_json()
{




    bourne::json input =
    {
        "end", 1.0
    };

    TranscriptionSegment obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end"] == output["end"]);
}


void test_TranscriptionSegment_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    TranscriptionSegment obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}



void test_TranscriptionSegment_temperature_is_converted_to_json()
{




    bourne::json input =
    {
        "temperature", 1.0
    };

    TranscriptionSegment obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["temperature"] == output["temperature"]);
}


void test_TranscriptionSegment_avg_logprob_is_converted_to_json()
{




    bourne::json input =
    {
        "avg_logprob", 1.0
    };

    TranscriptionSegment obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["avg_logprob"] == output["avg_logprob"]);
}


void test_TranscriptionSegment_compression_ratio_is_converted_to_json()
{




    bourne::json input =
    {
        "compression_ratio", 1.0
    };

    TranscriptionSegment obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["compression_ratio"] == output["compression_ratio"]);
}


void test_TranscriptionSegment_no_speech_prob_is_converted_to_json()
{




    bourne::json input =
    {
        "no_speech_prob", 1.0
    };

    TranscriptionSegment obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["no_speech_prob"] == output["no_speech_prob"]);
}


