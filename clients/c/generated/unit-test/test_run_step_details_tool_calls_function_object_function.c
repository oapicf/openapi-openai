#ifndef run_step_details_tool_calls_function_object_function_TEST
#define run_step_details_tool_calls_function_object_function_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_details_tool_calls_function_object_function_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_details_tool_calls_function_object_function.h"
run_step_details_tool_calls_function_object_function_t* instantiate_run_step_details_tool_calls_function_object_function(int include_optional);



run_step_details_tool_calls_function_object_function_t* instantiate_run_step_details_tool_calls_function_object_function(int include_optional) {
  run_step_details_tool_calls_function_object_function_t* run_step_details_tool_calls_function_object_function = NULL;
  if (include_optional) {
    run_step_details_tool_calls_function_object_function = run_step_details_tool_calls_function_object_function_create(
      "0",
      "0",
      "0"
    );
  } else {
    run_step_details_tool_calls_function_object_function = run_step_details_tool_calls_function_object_function_create(
      "0",
      "0",
      "0"
    );
  }

  return run_step_details_tool_calls_function_object_function;
}


#ifdef run_step_details_tool_calls_function_object_function_MAIN

void test_run_step_details_tool_calls_function_object_function(int include_optional) {
    run_step_details_tool_calls_function_object_function_t* run_step_details_tool_calls_function_object_function_1 = instantiate_run_step_details_tool_calls_function_object_function(include_optional);

	cJSON* jsonrun_step_details_tool_calls_function_object_function_1 = run_step_details_tool_calls_function_object_function_convertToJSON(run_step_details_tool_calls_function_object_function_1);
	printf("run_step_details_tool_calls_function_object_function :\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_function_object_function_1));
	run_step_details_tool_calls_function_object_function_t* run_step_details_tool_calls_function_object_function_2 = run_step_details_tool_calls_function_object_function_parseFromJSON(jsonrun_step_details_tool_calls_function_object_function_1);
	cJSON* jsonrun_step_details_tool_calls_function_object_function_2 = run_step_details_tool_calls_function_object_function_convertToJSON(run_step_details_tool_calls_function_object_function_2);
	printf("repeating run_step_details_tool_calls_function_object_function:\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_function_object_function_2));
}

int main() {
  test_run_step_details_tool_calls_function_object_function(1);
  test_run_step_details_tool_calls_function_object_function(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_details_tool_calls_function_object_function_MAIN
#endif // run_step_details_tool_calls_function_object_function_TEST
