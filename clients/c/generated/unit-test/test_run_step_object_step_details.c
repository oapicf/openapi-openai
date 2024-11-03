#ifndef run_step_object_step_details_TEST
#define run_step_object_step_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_object_step_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_object_step_details.h"
run_step_object_step_details_t* instantiate_run_step_object_step_details(int include_optional);

#include "test_run_step_details_message_creation_object_message_creation.c"


run_step_object_step_details_t* instantiate_run_step_object_step_details(int include_optional) {
  run_step_object_step_details_t* run_step_object_step_details = NULL;
  if (include_optional) {
    run_step_object_step_details = run_step_object_step_details_create(
      openai_api_run_step_object_step_details_TYPE_message_creation,
       // false, not to have infinite recursion
      instantiate_run_step_details_message_creation_object_message_creation(0),
      list_createList()
    );
  } else {
    run_step_object_step_details = run_step_object_step_details_create(
      openai_api_run_step_object_step_details_TYPE_message_creation,
      NULL,
      list_createList()
    );
  }

  return run_step_object_step_details;
}


#ifdef run_step_object_step_details_MAIN

void test_run_step_object_step_details(int include_optional) {
    run_step_object_step_details_t* run_step_object_step_details_1 = instantiate_run_step_object_step_details(include_optional);

	cJSON* jsonrun_step_object_step_details_1 = run_step_object_step_details_convertToJSON(run_step_object_step_details_1);
	printf("run_step_object_step_details :\n%s\n", cJSON_Print(jsonrun_step_object_step_details_1));
	run_step_object_step_details_t* run_step_object_step_details_2 = run_step_object_step_details_parseFromJSON(jsonrun_step_object_step_details_1);
	cJSON* jsonrun_step_object_step_details_2 = run_step_object_step_details_convertToJSON(run_step_object_step_details_2);
	printf("repeating run_step_object_step_details:\n%s\n", cJSON_Print(jsonrun_step_object_step_details_2));
}

int main() {
  test_run_step_object_step_details(1);
  test_run_step_object_step_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_object_step_details_MAIN
#endif // run_step_object_step_details_TEST
