#ifndef run_stream_event_one_of_7_TEST
#define run_stream_event_one_of_7_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_stream_event_one_of_7_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_stream_event_one_of_7.h"
run_stream_event_one_of_7_t* instantiate_run_stream_event_one_of_7(int include_optional);

#include "test_run_object.c"


run_stream_event_one_of_7_t* instantiate_run_stream_event_one_of_7(int include_optional) {
  run_stream_event_one_of_7_t* run_stream_event_one_of_7 = NULL;
  if (include_optional) {
    run_stream_event_one_of_7 = run_stream_event_one_of_7_create(
      openai_api_run_stream_event_one_of_7_EVENT_thread.run.cancelling,
       // false, not to have infinite recursion
      instantiate_run_object(0)
    );
  } else {
    run_stream_event_one_of_7 = run_stream_event_one_of_7_create(
      openai_api_run_stream_event_one_of_7_EVENT_thread.run.cancelling,
      NULL
    );
  }

  return run_stream_event_one_of_7;
}


#ifdef run_stream_event_one_of_7_MAIN

void test_run_stream_event_one_of_7(int include_optional) {
    run_stream_event_one_of_7_t* run_stream_event_one_of_7_1 = instantiate_run_stream_event_one_of_7(include_optional);

	cJSON* jsonrun_stream_event_one_of_7_1 = run_stream_event_one_of_7_convertToJSON(run_stream_event_one_of_7_1);
	printf("run_stream_event_one_of_7 :\n%s\n", cJSON_Print(jsonrun_stream_event_one_of_7_1));
	run_stream_event_one_of_7_t* run_stream_event_one_of_7_2 = run_stream_event_one_of_7_parseFromJSON(jsonrun_stream_event_one_of_7_1);
	cJSON* jsonrun_stream_event_one_of_7_2 = run_stream_event_one_of_7_convertToJSON(run_stream_event_one_of_7_2);
	printf("repeating run_stream_event_one_of_7:\n%s\n", cJSON_Print(jsonrun_stream_event_one_of_7_2));
}

int main() {
  test_run_stream_event_one_of_7(1);
  test_run_stream_event_one_of_7(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_stream_event_one_of_7_MAIN
#endif // run_stream_event_one_of_7_TEST
