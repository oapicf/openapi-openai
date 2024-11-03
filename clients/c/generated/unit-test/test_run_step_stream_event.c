#ifndef run_step_stream_event_TEST
#define run_step_stream_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_stream_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_stream_event.h"
run_step_stream_event_t* instantiate_run_step_stream_event(int include_optional);

#include "test_run_step_object.c"


run_step_stream_event_t* instantiate_run_step_stream_event(int include_optional) {
  run_step_stream_event_t* run_step_stream_event = NULL;
  if (include_optional) {
    run_step_stream_event = run_step_stream_event_create(
      openai_api_run_step_stream_event_EVENT_thread.run.step.expired,
       // false, not to have infinite recursion
      instantiate_run_step_object(0)
    );
  } else {
    run_step_stream_event = run_step_stream_event_create(
      openai_api_run_step_stream_event_EVENT_thread.run.step.expired,
      NULL
    );
  }

  return run_step_stream_event;
}


#ifdef run_step_stream_event_MAIN

void test_run_step_stream_event(int include_optional) {
    run_step_stream_event_t* run_step_stream_event_1 = instantiate_run_step_stream_event(include_optional);

	cJSON* jsonrun_step_stream_event_1 = run_step_stream_event_convertToJSON(run_step_stream_event_1);
	printf("run_step_stream_event :\n%s\n", cJSON_Print(jsonrun_step_stream_event_1));
	run_step_stream_event_t* run_step_stream_event_2 = run_step_stream_event_parseFromJSON(jsonrun_step_stream_event_1);
	cJSON* jsonrun_step_stream_event_2 = run_step_stream_event_convertToJSON(run_step_stream_event_2);
	printf("repeating run_step_stream_event:\n%s\n", cJSON_Print(jsonrun_step_stream_event_2));
}

int main() {
  test_run_step_stream_event(1);
  test_run_step_stream_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_stream_event_MAIN
#endif // run_step_stream_event_TEST
