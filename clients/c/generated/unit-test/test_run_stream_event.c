#ifndef run_stream_event_TEST
#define run_stream_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_stream_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_stream_event.h"
run_stream_event_t* instantiate_run_stream_event(int include_optional);

#include "test_run_object.c"


run_stream_event_t* instantiate_run_stream_event(int include_optional) {
  run_stream_event_t* run_stream_event = NULL;
  if (include_optional) {
    run_stream_event = run_stream_event_create(
      openai_api_run_stream_event_EVENT_thread.run.expired,
       // false, not to have infinite recursion
      instantiate_run_object(0)
    );
  } else {
    run_stream_event = run_stream_event_create(
      openai_api_run_stream_event_EVENT_thread.run.expired,
      NULL
    );
  }

  return run_stream_event;
}


#ifdef run_stream_event_MAIN

void test_run_stream_event(int include_optional) {
    run_stream_event_t* run_stream_event_1 = instantiate_run_stream_event(include_optional);

	cJSON* jsonrun_stream_event_1 = run_stream_event_convertToJSON(run_stream_event_1);
	printf("run_stream_event :\n%s\n", cJSON_Print(jsonrun_stream_event_1));
	run_stream_event_t* run_stream_event_2 = run_stream_event_parseFromJSON(jsonrun_stream_event_1);
	cJSON* jsonrun_stream_event_2 = run_stream_event_convertToJSON(run_stream_event_2);
	printf("repeating run_stream_event:\n%s\n", cJSON_Print(jsonrun_stream_event_2));
}

int main() {
  test_run_stream_event(1);
  test_run_stream_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_stream_event_MAIN
#endif // run_stream_event_TEST
