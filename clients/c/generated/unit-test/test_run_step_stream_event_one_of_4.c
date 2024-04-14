#ifndef run_step_stream_event_one_of_4_TEST
#define run_step_stream_event_one_of_4_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_stream_event_one_of_4_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_stream_event_one_of_4.h"
run_step_stream_event_one_of_4_t* instantiate_run_step_stream_event_one_of_4(int include_optional);

#include "test_run_step_object.c"


run_step_stream_event_one_of_4_t* instantiate_run_step_stream_event_one_of_4(int include_optional) {
  run_step_stream_event_one_of_4_t* run_step_stream_event_one_of_4 = NULL;
  if (include_optional) {
    run_step_stream_event_one_of_4 = run_step_stream_event_one_of_4_create(
      openai_api_run_step_stream_event_one_of_4_EVENT_thread.run.step.failed,
       // false, not to have infinite recursion
      instantiate_run_step_object(0)
    );
  } else {
    run_step_stream_event_one_of_4 = run_step_stream_event_one_of_4_create(
      openai_api_run_step_stream_event_one_of_4_EVENT_thread.run.step.failed,
      NULL
    );
  }

  return run_step_stream_event_one_of_4;
}


#ifdef run_step_stream_event_one_of_4_MAIN

void test_run_step_stream_event_one_of_4(int include_optional) {
    run_step_stream_event_one_of_4_t* run_step_stream_event_one_of_4_1 = instantiate_run_step_stream_event_one_of_4(include_optional);

	cJSON* jsonrun_step_stream_event_one_of_4_1 = run_step_stream_event_one_of_4_convertToJSON(run_step_stream_event_one_of_4_1);
	printf("run_step_stream_event_one_of_4 :\n%s\n", cJSON_Print(jsonrun_step_stream_event_one_of_4_1));
	run_step_stream_event_one_of_4_t* run_step_stream_event_one_of_4_2 = run_step_stream_event_one_of_4_parseFromJSON(jsonrun_step_stream_event_one_of_4_1);
	cJSON* jsonrun_step_stream_event_one_of_4_2 = run_step_stream_event_one_of_4_convertToJSON(run_step_stream_event_one_of_4_2);
	printf("repeating run_step_stream_event_one_of_4:\n%s\n", cJSON_Print(jsonrun_step_stream_event_one_of_4_2));
}

int main() {
  test_run_step_stream_event_one_of_4(1);
  test_run_step_stream_event_one_of_4(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_stream_event_one_of_4_MAIN
#endif // run_step_stream_event_one_of_4_TEST
