#ifndef run_object_incomplete_details_TEST
#define run_object_incomplete_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_object_incomplete_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_object_incomplete_details.h"
run_object_incomplete_details_t* instantiate_run_object_incomplete_details(int include_optional);



run_object_incomplete_details_t* instantiate_run_object_incomplete_details(int include_optional) {
  run_object_incomplete_details_t* run_object_incomplete_details = NULL;
  if (include_optional) {
    run_object_incomplete_details = run_object_incomplete_details_create(
      openai_api_run_object_incomplete_details_REASON_max_completion_tokens
    );
  } else {
    run_object_incomplete_details = run_object_incomplete_details_create(
      openai_api_run_object_incomplete_details_REASON_max_completion_tokens
    );
  }

  return run_object_incomplete_details;
}


#ifdef run_object_incomplete_details_MAIN

void test_run_object_incomplete_details(int include_optional) {
    run_object_incomplete_details_t* run_object_incomplete_details_1 = instantiate_run_object_incomplete_details(include_optional);

	cJSON* jsonrun_object_incomplete_details_1 = run_object_incomplete_details_convertToJSON(run_object_incomplete_details_1);
	printf("run_object_incomplete_details :\n%s\n", cJSON_Print(jsonrun_object_incomplete_details_1));
	run_object_incomplete_details_t* run_object_incomplete_details_2 = run_object_incomplete_details_parseFromJSON(jsonrun_object_incomplete_details_1);
	cJSON* jsonrun_object_incomplete_details_2 = run_object_incomplete_details_convertToJSON(run_object_incomplete_details_2);
	printf("repeating run_object_incomplete_details:\n%s\n", cJSON_Print(jsonrun_object_incomplete_details_2));
}

int main() {
  test_run_object_incomplete_details(1);
  test_run_object_incomplete_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_object_incomplete_details_MAIN
#endif // run_object_incomplete_details_TEST
