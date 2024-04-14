#ifndef run_step_details_tool_calls_code_object_code_interpreter_TEST
#define run_step_details_tool_calls_code_object_code_interpreter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_details_tool_calls_code_object_code_interpreter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_details_tool_calls_code_object_code_interpreter.h"
run_step_details_tool_calls_code_object_code_interpreter_t* instantiate_run_step_details_tool_calls_code_object_code_interpreter(int include_optional);



run_step_details_tool_calls_code_object_code_interpreter_t* instantiate_run_step_details_tool_calls_code_object_code_interpreter(int include_optional) {
  run_step_details_tool_calls_code_object_code_interpreter_t* run_step_details_tool_calls_code_object_code_interpreter = NULL;
  if (include_optional) {
    run_step_details_tool_calls_code_object_code_interpreter = run_step_details_tool_calls_code_object_code_interpreter_create(
      "0",
      list_createList()
    );
  } else {
    run_step_details_tool_calls_code_object_code_interpreter = run_step_details_tool_calls_code_object_code_interpreter_create(
      "0",
      list_createList()
    );
  }

  return run_step_details_tool_calls_code_object_code_interpreter;
}


#ifdef run_step_details_tool_calls_code_object_code_interpreter_MAIN

void test_run_step_details_tool_calls_code_object_code_interpreter(int include_optional) {
    run_step_details_tool_calls_code_object_code_interpreter_t* run_step_details_tool_calls_code_object_code_interpreter_1 = instantiate_run_step_details_tool_calls_code_object_code_interpreter(include_optional);

	cJSON* jsonrun_step_details_tool_calls_code_object_code_interpreter_1 = run_step_details_tool_calls_code_object_code_interpreter_convertToJSON(run_step_details_tool_calls_code_object_code_interpreter_1);
	printf("run_step_details_tool_calls_code_object_code_interpreter :\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_code_object_code_interpreter_1));
	run_step_details_tool_calls_code_object_code_interpreter_t* run_step_details_tool_calls_code_object_code_interpreter_2 = run_step_details_tool_calls_code_object_code_interpreter_parseFromJSON(jsonrun_step_details_tool_calls_code_object_code_interpreter_1);
	cJSON* jsonrun_step_details_tool_calls_code_object_code_interpreter_2 = run_step_details_tool_calls_code_object_code_interpreter_convertToJSON(run_step_details_tool_calls_code_object_code_interpreter_2);
	printf("repeating run_step_details_tool_calls_code_object_code_interpreter:\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_code_object_code_interpreter_2));
}

int main() {
  test_run_step_details_tool_calls_code_object_code_interpreter(1);
  test_run_step_details_tool_calls_code_object_code_interpreter(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_details_tool_calls_code_object_code_interpreter_MAIN
#endif // run_step_details_tool_calls_code_object_code_interpreter_TEST
