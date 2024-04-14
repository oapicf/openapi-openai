#ifndef run_stream_event_one_of_8_TEST
#define run_stream_event_one_of_8_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_stream_event_one_of_8_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_stream_event_one_of_8.h"
run_stream_event_one_of_8_t* instantiate_run_stream_event_one_of_8(int include_optional);

#include "test_run_object.c"


run_stream_event_one_of_8_t* instantiate_run_stream_event_one_of_8(int include_optional) {
  run_stream_event_one_of_8_t* run_stream_event_one_of_8 = NULL;
  if (include_optional) {
    run_stream_event_one_of_8 = run_stream_event_one_of_8_create(
      openai_api_run_stream_event_one_of_8_EVENT_thread.run.expired,
       // false, not to have infinite recursion
      instantiate_run_object(0)
    );
  } else {
    run_stream_event_one_of_8 = run_stream_event_one_of_8_create(
      openai_api_run_stream_event_one_of_8_EVENT_thread.run.expired,
      NULL
    );
  }

  return run_stream_event_one_of_8;
}


#ifdef run_stream_event_one_of_8_MAIN

void test_run_stream_event_one_of_8(int include_optional) {
    run_stream_event_one_of_8_t* run_stream_event_one_of_8_1 = instantiate_run_stream_event_one_of_8(include_optional);

	cJSON* jsonrun_stream_event_one_of_8_1 = run_stream_event_one_of_8_convertToJSON(run_stream_event_one_of_8_1);
	printf("run_stream_event_one_of_8 :\n%s\n", cJSON_Print(jsonrun_stream_event_one_of_8_1));
	run_stream_event_one_of_8_t* run_stream_event_one_of_8_2 = run_stream_event_one_of_8_parseFromJSON(jsonrun_stream_event_one_of_8_1);
	cJSON* jsonrun_stream_event_one_of_8_2 = run_stream_event_one_of_8_convertToJSON(run_stream_event_one_of_8_2);
	printf("repeating run_stream_event_one_of_8:\n%s\n", cJSON_Print(jsonrun_stream_event_one_of_8_2));
}

int main() {
  test_run_stream_event_one_of_8(1);
  test_run_stream_event_one_of_8(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_stream_event_one_of_8_MAIN
#endif // run_stream_event_one_of_8_TEST
