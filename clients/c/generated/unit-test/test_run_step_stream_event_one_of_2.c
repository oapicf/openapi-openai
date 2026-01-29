#ifndef run_step_stream_event_one_of_2_TEST
#define run_step_stream_event_one_of_2_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_stream_event_one_of_2_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_stream_event_one_of_2.h"
run_step_stream_event_one_of_2_t* instantiate_run_step_stream_event_one_of_2(int include_optional);

#include "test_run_step_delta_object.c"


run_step_stream_event_one_of_2_t* instantiate_run_step_stream_event_one_of_2(int include_optional) {
  run_step_stream_event_one_of_2_t* run_step_stream_event_one_of_2 = NULL;
  if (include_optional) {
    run_step_stream_event_one_of_2 = run_step_stream_event_one_of_2_create(
      openai_api_run_step_stream_event_one_of_2_EVENT_thread.run.step.delta,
       // false, not to have infinite recursion
      instantiate_run_step_delta_object(0)
    );
  } else {
    run_step_stream_event_one_of_2 = run_step_stream_event_one_of_2_create(
      openai_api_run_step_stream_event_one_of_2_EVENT_thread.run.step.delta,
      NULL
    );
  }

  return run_step_stream_event_one_of_2;
}


#ifdef run_step_stream_event_one_of_2_MAIN

void test_run_step_stream_event_one_of_2(int include_optional) {
    run_step_stream_event_one_of_2_t* run_step_stream_event_one_of_2_1 = instantiate_run_step_stream_event_one_of_2(include_optional);

	cJSON* jsonrun_step_stream_event_one_of_2_1 = run_step_stream_event_one_of_2_convertToJSON(run_step_stream_event_one_of_2_1);
	printf("run_step_stream_event_one_of_2 :\n%s\n", cJSON_Print(jsonrun_step_stream_event_one_of_2_1));
	run_step_stream_event_one_of_2_t* run_step_stream_event_one_of_2_2 = run_step_stream_event_one_of_2_parseFromJSON(jsonrun_step_stream_event_one_of_2_1);
	cJSON* jsonrun_step_stream_event_one_of_2_2 = run_step_stream_event_one_of_2_convertToJSON(run_step_stream_event_one_of_2_2);
	printf("repeating run_step_stream_event_one_of_2:\n%s\n", cJSON_Print(jsonrun_step_stream_event_one_of_2_2));
}

int main() {
  test_run_step_stream_event_one_of_2(1);
  test_run_step_stream_event_one_of_2(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_stream_event_one_of_2_MAIN
#endif // run_step_stream_event_one_of_2_TEST
