
#include "AssistantToolsFileSearch_file_search.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AssistantToolsFileSearch_file_search_max_num_results_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_num_results", 1
    };

    AssistantToolsFileSearch_file_search obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxNumResults());








}




void test_AssistantToolsFileSearch_file_search_max_num_results_is_converted_to_json()
{
    bourne::json input =
    {
        "max_num_results", 1
    };

    AssistantToolsFileSearch_file_search obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_num_results"] == output["max_num_results"]);




}



