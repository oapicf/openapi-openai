#ifndef run_step_details_message_creation_object_message_creation_TEST
#define run_step_details_message_creation_object_message_creation_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_details_message_creation_object_message_creation_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_details_message_creation_object_message_creation.h"
run_step_details_message_creation_object_message_creation_t* instantiate_run_step_details_message_creation_object_message_creation(int include_optional);



run_step_details_message_creation_object_message_creation_t* instantiate_run_step_details_message_creation_object_message_creation(int include_optional) {
  run_step_details_message_creation_object_message_creation_t* run_step_details_message_creation_object_message_creation = NULL;
  if (include_optional) {
    run_step_details_message_creation_object_message_creation = run_step_details_message_creation_object_message_creation_create(
      "0"
    );
  } else {
    run_step_details_message_creation_object_message_creation = run_step_details_message_creation_object_message_creation_create(
      "0"
    );
  }

  return run_step_details_message_creation_object_message_creation;
}


#ifdef run_step_details_message_creation_object_message_creation_MAIN

void test_run_step_details_message_creation_object_message_creation(int include_optional) {
    run_step_details_message_creation_object_message_creation_t* run_step_details_message_creation_object_message_creation_1 = instantiate_run_step_details_message_creation_object_message_creation(include_optional);

	cJSON* jsonrun_step_details_message_creation_object_message_creation_1 = run_step_details_message_creation_object_message_creation_convertToJSON(run_step_details_message_creation_object_message_creation_1);
	printf("run_step_details_message_creation_object_message_creation :\n%s\n", cJSON_Print(jsonrun_step_details_message_creation_object_message_creation_1));
	run_step_details_message_creation_object_message_creation_t* run_step_details_message_creation_object_message_creation_2 = run_step_details_message_creation_object_message_creation_parseFromJSON(jsonrun_step_details_message_creation_object_message_creation_1);
	cJSON* jsonrun_step_details_message_creation_object_message_creation_2 = run_step_details_message_creation_object_message_creation_convertToJSON(run_step_details_message_creation_object_message_creation_2);
	printf("repeating run_step_details_message_creation_object_message_creation:\n%s\n", cJSON_Print(jsonrun_step_details_message_creation_object_message_creation_2));
}

int main() {
  test_run_step_details_message_creation_object_message_creation(1);
  test_run_step_details_message_creation_object_message_creation(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_details_message_creation_object_message_creation_MAIN
#endif // run_step_details_message_creation_object_message_creation_TEST
