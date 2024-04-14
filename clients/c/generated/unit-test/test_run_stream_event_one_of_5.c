#ifndef run_stream_event_one_of_5_TEST
#define run_stream_event_one_of_5_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_stream_event_one_of_5_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_stream_event_one_of_5.h"
run_stream_event_one_of_5_t* instantiate_run_stream_event_one_of_5(int include_optional);

#include "test_run_object.c"


run_stream_event_one_of_5_t* instantiate_run_stream_event_one_of_5(int include_optional) {
  run_stream_event_one_of_5_t* run_stream_event_one_of_5 = NULL;
  if (include_optional) {
    run_stream_event_one_of_5 = run_stream_event_one_of_5_create(
      openai_api_run_stream_event_one_of_5_EVENT_thread.run.failed,
       // false, not to have infinite recursion
      instantiate_run_object(0)
    );
  } else {
    run_stream_event_one_of_5 = run_stream_event_one_of_5_create(
      openai_api_run_stream_event_one_of_5_EVENT_thread.run.failed,
      NULL
    );
  }

  return run_stream_event_one_of_5;
}


#ifdef run_stream_event_one_of_5_MAIN

void test_run_stream_event_one_of_5(int include_optional) {
    run_stream_event_one_of_5_t* run_stream_event_one_of_5_1 = instantiate_run_stream_event_one_of_5(include_optional);

	cJSON* jsonrun_stream_event_one_of_5_1 = run_stream_event_one_of_5_convertToJSON(run_stream_event_one_of_5_1);
	printf("run_stream_event_one_of_5 :\n%s\n", cJSON_Print(jsonrun_stream_event_one_of_5_1));
	run_stream_event_one_of_5_t* run_stream_event_one_of_5_2 = run_stream_event_one_of_5_parseFromJSON(jsonrun_stream_event_one_of_5_1);
	cJSON* jsonrun_stream_event_one_of_5_2 = run_stream_event_one_of_5_convertToJSON(run_stream_event_one_of_5_2);
	printf("repeating run_stream_event_one_of_5:\n%s\n", cJSON_Print(jsonrun_stream_event_one_of_5_2));
}

int main() {
  test_run_stream_event_one_of_5(1);
  test_run_stream_event_one_of_5(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_stream_event_one_of_5_MAIN
#endif // run_stream_event_one_of_5_TEST
