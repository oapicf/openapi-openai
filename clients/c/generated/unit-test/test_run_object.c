#ifndef run_object_TEST
#define run_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_object.h"
run_object_t* instantiate_run_object(int include_optional);

#include "test_run_object_required_action.c"
#include "test_run_object_last_error.c"
#include "test_run_object_incomplete_details.c"
#include "test_run_completion_usage.c"
#include "test_truncation_object.c"
#include "test_assistants_api_tool_choice_option.c"
#include "test_assistants_api_response_format_option.c"


run_object_t* instantiate_run_object(int include_optional) {
  run_object_t* run_object = NULL;
  if (include_optional) {
    run_object = run_object_create(
      "0",
      openai_api_run_object_OBJECT_thread.run,
      56,
      "0",
      "0",
      openai_api_run_object_STATUS_queued,
       // false, not to have infinite recursion
      instantiate_run_object_required_action(0),
       // false, not to have infinite recursion
      instantiate_run_object_last_error(0),
      56,
      56,
      56,
      56,
      56,
       // false, not to have infinite recursion
      instantiate_run_object_incomplete_details(0),
      "0",
      "0",
      list_createList(),
      list_createList(),
      0,
       // false, not to have infinite recursion
      instantiate_run_completion_usage(0),
      1.337,
      256,
      256,
       // false, not to have infinite recursion
      instantiate_truncation_object(0),
      null,
      null
    );
  } else {
    run_object = run_object_create(
      "0",
      openai_api_run_object_OBJECT_thread.run,
      56,
      "0",
      "0",
      openai_api_run_object_STATUS_queued,
      NULL,
      NULL,
      56,
      56,
      56,
      56,
      56,
      NULL,
      "0",
      "0",
      list_createList(),
      list_createList(),
      0,
      NULL,
      1.337,
      256,
      256,
      NULL,
      null,
      null
    );
  }

  return run_object;
}


#ifdef run_object_MAIN

void test_run_object(int include_optional) {
    run_object_t* run_object_1 = instantiate_run_object(include_optional);

	cJSON* jsonrun_object_1 = run_object_convertToJSON(run_object_1);
	printf("run_object :\n%s\n", cJSON_Print(jsonrun_object_1));
	run_object_t* run_object_2 = run_object_parseFromJSON(jsonrun_object_1);
	cJSON* jsonrun_object_2 = run_object_convertToJSON(run_object_2);
	printf("repeating run_object:\n%s\n", cJSON_Print(jsonrun_object_2));
}

int main() {
  test_run_object(1);
  test_run_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_object_MAIN
#endif // run_object_TEST
