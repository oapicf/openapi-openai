#ifndef run_object_last_error_TEST
#define run_object_last_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_object_last_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_object_last_error.h"
run_object_last_error_t* instantiate_run_object_last_error(int include_optional);



run_object_last_error_t* instantiate_run_object_last_error(int include_optional) {
  run_object_last_error_t* run_object_last_error = NULL;
  if (include_optional) {
    run_object_last_error = run_object_last_error_create(
      openai_api_run_object_last_error_CODE_server_error,
      "0"
    );
  } else {
    run_object_last_error = run_object_last_error_create(
      openai_api_run_object_last_error_CODE_server_error,
      "0"
    );
  }

  return run_object_last_error;
}


#ifdef run_object_last_error_MAIN

void test_run_object_last_error(int include_optional) {
    run_object_last_error_t* run_object_last_error_1 = instantiate_run_object_last_error(include_optional);

	cJSON* jsonrun_object_last_error_1 = run_object_last_error_convertToJSON(run_object_last_error_1);
	printf("run_object_last_error :\n%s\n", cJSON_Print(jsonrun_object_last_error_1));
	run_object_last_error_t* run_object_last_error_2 = run_object_last_error_parseFromJSON(jsonrun_object_last_error_1);
	cJSON* jsonrun_object_last_error_2 = run_object_last_error_convertToJSON(run_object_last_error_2);
	printf("repeating run_object_last_error:\n%s\n", cJSON_Print(jsonrun_object_last_error_2));
}

int main() {
  test_run_object_last_error(1);
  test_run_object_last_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_object_last_error_MAIN
#endif // run_object_last_error_TEST
