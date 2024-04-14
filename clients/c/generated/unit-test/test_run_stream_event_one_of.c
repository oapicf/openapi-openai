#ifndef run_stream_event_one_of_TEST
#define run_stream_event_one_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_stream_event_one_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_stream_event_one_of.h"
run_stream_event_one_of_t* instantiate_run_stream_event_one_of(int include_optional);

#include "test_run_object.c"


run_stream_event_one_of_t* instantiate_run_stream_event_one_of(int include_optional) {
  run_stream_event_one_of_t* run_stream_event_one_of = NULL;
  if (include_optional) {
    run_stream_event_one_of = run_stream_event_one_of_create(
      openai_api_run_stream_event_one_of_EVENT_thread.run.created,
       // false, not to have infinite recursion
      instantiate_run_object(0)
    );
  } else {
    run_stream_event_one_of = run_stream_event_one_of_create(
      openai_api_run_stream_event_one_of_EVENT_thread.run.created,
      NULL
    );
  }

  return run_stream_event_one_of;
}


#ifdef run_stream_event_one_of_MAIN

void test_run_stream_event_one_of(int include_optional) {
    run_stream_event_one_of_t* run_stream_event_one_of_1 = instantiate_run_stream_event_one_of(include_optional);

	cJSON* jsonrun_stream_event_one_of_1 = run_stream_event_one_of_convertToJSON(run_stream_event_one_of_1);
	printf("run_stream_event_one_of :\n%s\n", cJSON_Print(jsonrun_stream_event_one_of_1));
	run_stream_event_one_of_t* run_stream_event_one_of_2 = run_stream_event_one_of_parseFromJSON(jsonrun_stream_event_one_of_1);
	cJSON* jsonrun_stream_event_one_of_2 = run_stream_event_one_of_convertToJSON(run_stream_event_one_of_2);
	printf("repeating run_stream_event_one_of:\n%s\n", cJSON_Print(jsonrun_stream_event_one_of_2));
}

int main() {
  test_run_stream_event_one_of(1);
  test_run_stream_event_one_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_stream_event_one_of_MAIN
#endif // run_stream_event_one_of_TEST
