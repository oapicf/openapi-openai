#ifndef run_step_stream_event_one_of_1_TEST
#define run_step_stream_event_one_of_1_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_stream_event_one_of_1_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_stream_event_one_of_1.h"
run_step_stream_event_one_of_1_t* instantiate_run_step_stream_event_one_of_1(int include_optional);

#include "test_run_step_object.c"


run_step_stream_event_one_of_1_t* instantiate_run_step_stream_event_one_of_1(int include_optional) {
  run_step_stream_event_one_of_1_t* run_step_stream_event_one_of_1 = NULL;
  if (include_optional) {
    run_step_stream_event_one_of_1 = run_step_stream_event_one_of_1_create(
      openai_api_run_step_stream_event_one_of_1_EVENT_thread.run.step.in_progress,
       // false, not to have infinite recursion
      instantiate_run_step_object(0)
    );
  } else {
    run_step_stream_event_one_of_1 = run_step_stream_event_one_of_1_create(
      openai_api_run_step_stream_event_one_of_1_EVENT_thread.run.step.in_progress,
      NULL
    );
  }

  return run_step_stream_event_one_of_1;
}


#ifdef run_step_stream_event_one_of_1_MAIN

void test_run_step_stream_event_one_of_1(int include_optional) {
    run_step_stream_event_one_of_1_t* run_step_stream_event_one_of_1_1 = instantiate_run_step_stream_event_one_of_1(include_optional);

	cJSON* jsonrun_step_stream_event_one_of_1_1 = run_step_stream_event_one_of_1_convertToJSON(run_step_stream_event_one_of_1_1);
	printf("run_step_stream_event_one_of_1 :\n%s\n", cJSON_Print(jsonrun_step_stream_event_one_of_1_1));
	run_step_stream_event_one_of_1_t* run_step_stream_event_one_of_1_2 = run_step_stream_event_one_of_1_parseFromJSON(jsonrun_step_stream_event_one_of_1_1);
	cJSON* jsonrun_step_stream_event_one_of_1_2 = run_step_stream_event_one_of_1_convertToJSON(run_step_stream_event_one_of_1_2);
	printf("repeating run_step_stream_event_one_of_1:\n%s\n", cJSON_Print(jsonrun_step_stream_event_one_of_1_2));
}

int main() {
  test_run_step_stream_event_one_of_1(1);
  test_run_step_stream_event_one_of_1(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_stream_event_one_of_1_MAIN
#endif // run_step_stream_event_one_of_1_TEST
