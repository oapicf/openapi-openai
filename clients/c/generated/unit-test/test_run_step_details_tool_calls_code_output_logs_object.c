#ifndef run_step_details_tool_calls_code_output_logs_object_TEST
#define run_step_details_tool_calls_code_output_logs_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_details_tool_calls_code_output_logs_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_details_tool_calls_code_output_logs_object.h"
run_step_details_tool_calls_code_output_logs_object_t* instantiate_run_step_details_tool_calls_code_output_logs_object(int include_optional);



run_step_details_tool_calls_code_output_logs_object_t* instantiate_run_step_details_tool_calls_code_output_logs_object(int include_optional) {
  run_step_details_tool_calls_code_output_logs_object_t* run_step_details_tool_calls_code_output_logs_object = NULL;
  if (include_optional) {
    run_step_details_tool_calls_code_output_logs_object = run_step_details_tool_calls_code_output_logs_object_create(
      openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_logs,
      "0"
    );
  } else {
    run_step_details_tool_calls_code_output_logs_object = run_step_details_tool_calls_code_output_logs_object_create(
      openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_logs,
      "0"
    );
  }

  return run_step_details_tool_calls_code_output_logs_object;
}


#ifdef run_step_details_tool_calls_code_output_logs_object_MAIN

void test_run_step_details_tool_calls_code_output_logs_object(int include_optional) {
    run_step_details_tool_calls_code_output_logs_object_t* run_step_details_tool_calls_code_output_logs_object_1 = instantiate_run_step_details_tool_calls_code_output_logs_object(include_optional);

	cJSON* jsonrun_step_details_tool_calls_code_output_logs_object_1 = run_step_details_tool_calls_code_output_logs_object_convertToJSON(run_step_details_tool_calls_code_output_logs_object_1);
	printf("run_step_details_tool_calls_code_output_logs_object :\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_code_output_logs_object_1));
	run_step_details_tool_calls_code_output_logs_object_t* run_step_details_tool_calls_code_output_logs_object_2 = run_step_details_tool_calls_code_output_logs_object_parseFromJSON(jsonrun_step_details_tool_calls_code_output_logs_object_1);
	cJSON* jsonrun_step_details_tool_calls_code_output_logs_object_2 = run_step_details_tool_calls_code_output_logs_object_convertToJSON(run_step_details_tool_calls_code_output_logs_object_2);
	printf("repeating run_step_details_tool_calls_code_output_logs_object:\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_code_output_logs_object_2));
}

int main() {
  test_run_step_details_tool_calls_code_output_logs_object(1);
  test_run_step_details_tool_calls_code_output_logs_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_details_tool_calls_code_output_logs_object_MAIN
#endif // run_step_details_tool_calls_code_output_logs_object_TEST
