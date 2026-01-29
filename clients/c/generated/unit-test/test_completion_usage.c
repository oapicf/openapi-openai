#ifndef completion_usage_TEST
#define completion_usage_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define completion_usage_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/completion_usage.h"
completion_usage_t* instantiate_completion_usage(int include_optional);



completion_usage_t* instantiate_completion_usage(int include_optional) {
  completion_usage_t* completion_usage = NULL;
  if (include_optional) {
    completion_usage = completion_usage_create(
      56,
      56,
      56
    );
  } else {
    completion_usage = completion_usage_create(
      56,
      56,
      56
    );
  }

  return completion_usage;
}


#ifdef completion_usage_MAIN

void test_completion_usage(int include_optional) {
    completion_usage_t* completion_usage_1 = instantiate_completion_usage(include_optional);

	cJSON* jsoncompletion_usage_1 = completion_usage_convertToJSON(completion_usage_1);
	printf("completion_usage :\n%s\n", cJSON_Print(jsoncompletion_usage_1));
	completion_usage_t* completion_usage_2 = completion_usage_parseFromJSON(jsoncompletion_usage_1);
	cJSON* jsoncompletion_usage_2 = completion_usage_convertToJSON(completion_usage_2);
	printf("repeating completion_usage:\n%s\n", cJSON_Print(jsoncompletion_usage_2));
}

int main() {
  test_completion_usage(1);
  test_completion_usage(0);

  printf("Hello world \n");
  return 0;
}

#endif // completion_usage_MAIN
#endif // completion_usage_TEST
