
#include "StaticChunkingStrategy.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_StaticChunkingStrategy_max_chunk_size_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_chunk_size_tokens", 1
    };

    StaticChunkingStrategy obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxChunkSizeTokens());








}


void test_StaticChunkingStrategy_chunk_overlap_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "chunk_overlap_tokens", 1
    };

    StaticChunkingStrategy obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getChunkOverlapTokens());








}



void test_StaticChunkingStrategy_max_chunk_size_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "max_chunk_size_tokens", 1
    };

    StaticChunkingStrategy obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_chunk_size_tokens"] == output["max_chunk_size_tokens"]);




}


void test_StaticChunkingStrategy_chunk_overlap_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "chunk_overlap_tokens", 1
    };

    StaticChunkingStrategy obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["chunk_overlap_tokens"] == output["chunk_overlap_tokens"]);




}


