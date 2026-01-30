#ifndef usage_time_bucket_result_inner_TEST
#define usage_time_bucket_result_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_time_bucket_result_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_time_bucket_result_inner.h"
usage_time_bucket_result_inner_t* instantiate_usage_time_bucket_result_inner(int include_optional);

#include "test_costs_result_amount.c"


usage_time_bucket_result_inner_t* instantiate_usage_time_bucket_result_inner(int include_optional) {
  usage_time_bucket_result_inner_t* usage_time_bucket_result_inner = NULL;
  if (include_optional) {
    usage_time_bucket_result_inner = usage_time_bucket_result_inner_create(
      openai_api_usage_time_bucket_result_inner_OBJECT_organization.costs.result,
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
      1,
      56,
      "0",
      "0",
      56,
      56,
      56,
      56,
       // false, not to have infinite recursion
      instantiate_costs_result_amount(0),
      "0"
    );
  } else {
    usage_time_bucket_result_inner = usage_time_bucket_result_inner_create(
      openai_api_usage_time_bucket_result_inner_OBJECT_organization.costs.result,
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
      1,
      56,
      "0",
      "0",
      56,
      56,
      56,
      56,
      NULL,
      "0"
    );
  }

  return usage_time_bucket_result_inner;
}


#ifdef usage_time_bucket_result_inner_MAIN

void test_usage_time_bucket_result_inner(int include_optional) {
    usage_time_bucket_result_inner_t* usage_time_bucket_result_inner_1 = instantiate_usage_time_bucket_result_inner(include_optional);

	cJSON* jsonusage_time_bucket_result_inner_1 = usage_time_bucket_result_inner_convertToJSON(usage_time_bucket_result_inner_1);
	printf("usage_time_bucket_result_inner :\n%s\n", cJSON_Print(jsonusage_time_bucket_result_inner_1));
	usage_time_bucket_result_inner_t* usage_time_bucket_result_inner_2 = usage_time_bucket_result_inner_parseFromJSON(jsonusage_time_bucket_result_inner_1);
	cJSON* jsonusage_time_bucket_result_inner_2 = usage_time_bucket_result_inner_convertToJSON(usage_time_bucket_result_inner_2);
	printf("repeating usage_time_bucket_result_inner:\n%s\n", cJSON_Print(jsonusage_time_bucket_result_inner_2));
}

int main() {
  test_usage_time_bucket_result_inner(1);
  test_usage_time_bucket_result_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_time_bucket_result_inner_MAIN
#endif // usage_time_bucket_result_inner_TEST
