#ifndef usage_completions_result_TEST
#define usage_completions_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_completions_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_completions_result.h"
usage_completions_result_t* instantiate_usage_completions_result(int include_optional);



usage_completions_result_t* instantiate_usage_completions_result(int include_optional) {
  usage_completions_result_t* usage_completions_result = NULL;
  if (include_optional) {
    usage_completions_result = usage_completions_result_create(
      openai_api_usage_completions_result_OBJECT_organization.usage.completions.result,
      56,
      56,
      56,
      56,
      56,
      56,
      "0",
      "0",
      "0",
      "0",
      1
    );
  } else {
    usage_completions_result = usage_completions_result_create(
      openai_api_usage_completions_result_OBJECT_organization.usage.completions.result,
      56,
      56,
      56,
      56,
      56,
      56,
      "0",
      "0",
      "0",
      "0",
      1
    );
  }

  return usage_completions_result;
}


#ifdef usage_completions_result_MAIN

void test_usage_completions_result(int include_optional) {
    usage_completions_result_t* usage_completions_result_1 = instantiate_usage_completions_result(include_optional);

	cJSON* jsonusage_completions_result_1 = usage_completions_result_convertToJSON(usage_completions_result_1);
	printf("usage_completions_result :\n%s\n", cJSON_Print(jsonusage_completions_result_1));
	usage_completions_result_t* usage_completions_result_2 = usage_completions_result_parseFromJSON(jsonusage_completions_result_1);
	cJSON* jsonusage_completions_result_2 = usage_completions_result_convertToJSON(usage_completions_result_2);
	printf("repeating usage_completions_result:\n%s\n", cJSON_Print(jsonusage_completions_result_2));
}

int main() {
  test_usage_completions_result(1);
  test_usage_completions_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_completions_result_MAIN
#endif // usage_completions_result_TEST
