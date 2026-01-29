#ifndef run_step_delta_object_delta_TEST
#define run_step_delta_object_delta_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_delta_object_delta_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_delta_object_delta.h"
run_step_delta_object_delta_t* instantiate_run_step_delta_object_delta(int include_optional);

#include "test_run_step_delta_object_delta_step_details.c"


run_step_delta_object_delta_t* instantiate_run_step_delta_object_delta(int include_optional) {
  run_step_delta_object_delta_t* run_step_delta_object_delta = NULL;
  if (include_optional) {
    run_step_delta_object_delta = run_step_delta_object_delta_create(
       // false, not to have infinite recursion
      instantiate_run_step_delta_object_delta_step_details(0)
    );
  } else {
    run_step_delta_object_delta = run_step_delta_object_delta_create(
      NULL
    );
  }

  return run_step_delta_object_delta;
}


#ifdef run_step_delta_object_delta_MAIN

void test_run_step_delta_object_delta(int include_optional) {
    run_step_delta_object_delta_t* run_step_delta_object_delta_1 = instantiate_run_step_delta_object_delta(include_optional);

	cJSON* jsonrun_step_delta_object_delta_1 = run_step_delta_object_delta_convertToJSON(run_step_delta_object_delta_1);
	printf("run_step_delta_object_delta :\n%s\n", cJSON_Print(jsonrun_step_delta_object_delta_1));
	run_step_delta_object_delta_t* run_step_delta_object_delta_2 = run_step_delta_object_delta_parseFromJSON(jsonrun_step_delta_object_delta_1);
	cJSON* jsonrun_step_delta_object_delta_2 = run_step_delta_object_delta_convertToJSON(run_step_delta_object_delta_2);
	printf("repeating run_step_delta_object_delta:\n%s\n", cJSON_Print(jsonrun_step_delta_object_delta_2));
}

int main() {
  test_run_step_delta_object_delta(1);
  test_run_step_delta_object_delta(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_delta_object_delta_MAIN
#endif // run_step_delta_object_delta_TEST
