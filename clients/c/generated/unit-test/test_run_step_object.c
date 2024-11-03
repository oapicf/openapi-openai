#ifndef run_step_object_TEST
#define run_step_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_object.h"
run_step_object_t* instantiate_run_step_object(int include_optional);

#include "test_run_step_object_step_details.c"
#include "test_run_step_object_last_error.c"
#include "test_run_step_completion_usage.c"


run_step_object_t* instantiate_run_step_object(int include_optional) {
  run_step_object_t* run_step_object = NULL;
  if (include_optional) {
    run_step_object = run_step_object_create(
      "0",
      openai_api_run_step_object_OBJECT_thread.run.step,
      56,
      "0",
      "0",
      "0",
      openai_api_run_step_object_TYPE_message_creation,
      openai_api_run_step_object_STATUS_in_progress,
       // false, not to have infinite recursion
      instantiate_run_step_object_step_details(0),
       // false, not to have infinite recursion
      instantiate_run_step_object_last_error(0),
      56,
      56,
      56,
      56,
      0,
       // false, not to have infinite recursion
      instantiate_run_step_completion_usage(0)
    );
  } else {
    run_step_object = run_step_object_create(
      "0",
      openai_api_run_step_object_OBJECT_thread.run.step,
      56,
      "0",
      "0",
      "0",
      openai_api_run_step_object_TYPE_message_creation,
      openai_api_run_step_object_STATUS_in_progress,
      NULL,
      NULL,
      56,
      56,
      56,
      56,
      0,
      NULL
    );
  }

  return run_step_object;
}


#ifdef run_step_object_MAIN

void test_run_step_object(int include_optional) {
    run_step_object_t* run_step_object_1 = instantiate_run_step_object(include_optional);

	cJSON* jsonrun_step_object_1 = run_step_object_convertToJSON(run_step_object_1);
	printf("run_step_object :\n%s\n", cJSON_Print(jsonrun_step_object_1));
	run_step_object_t* run_step_object_2 = run_step_object_parseFromJSON(jsonrun_step_object_1);
	cJSON* jsonrun_step_object_2 = run_step_object_convertToJSON(run_step_object_2);
	printf("repeating run_step_object:\n%s\n", cJSON_Print(jsonrun_step_object_2));
}

int main() {
  test_run_step_object(1);
  test_run_step_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_object_MAIN
#endif // run_step_object_TEST
