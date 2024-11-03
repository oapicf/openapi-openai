#ifndef run_completion_usage_TEST
#define run_completion_usage_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_completion_usage_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_completion_usage.h"
run_completion_usage_t* instantiate_run_completion_usage(int include_optional);



run_completion_usage_t* instantiate_run_completion_usage(int include_optional) {
  run_completion_usage_t* run_completion_usage = NULL;
  if (include_optional) {
    run_completion_usage = run_completion_usage_create(
      56,
      56,
      56
    );
  } else {
    run_completion_usage = run_completion_usage_create(
      56,
      56,
      56
    );
  }

  return run_completion_usage;
}


#ifdef run_completion_usage_MAIN

void test_run_completion_usage(int include_optional) {
    run_completion_usage_t* run_completion_usage_1 = instantiate_run_completion_usage(include_optional);

	cJSON* jsonrun_completion_usage_1 = run_completion_usage_convertToJSON(run_completion_usage_1);
	printf("run_completion_usage :\n%s\n", cJSON_Print(jsonrun_completion_usage_1));
	run_completion_usage_t* run_completion_usage_2 = run_completion_usage_parseFromJSON(jsonrun_completion_usage_1);
	cJSON* jsonrun_completion_usage_2 = run_completion_usage_convertToJSON(run_completion_usage_2);
	printf("repeating run_completion_usage:\n%s\n", cJSON_Print(jsonrun_completion_usage_2));
}

int main() {
  test_run_completion_usage(1);
  test_run_completion_usage(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_completion_usage_MAIN
#endif // run_completion_usage_TEST
