
#include "TranscriptionWord.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TranscriptionWord_word_is_assigned_from_json()
{


    bourne::json input =
    {
        "word", "hello"
    };

    TranscriptionWord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWord().c_str());






}


void test_TranscriptionWord_start_is_assigned_from_json()
{








    bourne::json input =
    {
        "start", 1.0
    };

    TranscriptionWord obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getStart());
}


void test_TranscriptionWord_end_is_assigned_from_json()
{








    bourne::json input =
    {
        "end", 1.0
    };

    TranscriptionWord obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getEnd());
}



void test_TranscriptionWord_word_is_converted_to_json()
{

    bourne::json input =
    {
        "word", "hello"
    };

    TranscriptionWord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["word"] == output["word"]);



}


void test_TranscriptionWord_start_is_converted_to_json()
{




    bourne::json input =
    {
        "start", 1.0
    };

    TranscriptionWord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start"] == output["start"]);
}


void test_TranscriptionWord_end_is_converted_to_json()
{




    bourne::json input =
    {
        "end", 1.0
    };

    TranscriptionWord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end"] == output["end"]);
}


