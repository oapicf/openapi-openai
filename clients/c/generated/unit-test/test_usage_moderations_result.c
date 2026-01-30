#ifndef usage_moderations_result_TEST
#define usage_moderations_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_moderations_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_moderations_result.h"
usage_moderations_result_t* instantiate_usage_moderations_result(int include_optional);



usage_moderations_result_t* instantiate_usage_moderations_result(int include_optional) {
  usage_moderations_result_t* usage_moderations_result = NULL;
  if (include_optional) {
    usage_moderations_result = usage_moderations_result_create(
      openai_api_usage_moderations_result_OBJECT_organization.usage.moderations.result,
      56,
      56,
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    usage_moderations_result = usage_moderations_result_create(
      openai_api_usage_moderations_result_OBJECT_organization.usage.moderations.result,
      56,
      56,
      "0",
      "0",
      "0",
      "0"
    );
  }

  return usage_moderations_result;
}


#ifdef usage_moderations_result_MAIN

void test_usage_moderations_result(int include_optional) {
    usage_moderations_result_t* usage_moderations_result_1 = instantiate_usage_moderations_result(include_optional);

	cJSON* jsonusage_moderations_result_1 = usage_moderations_result_convertToJSON(usage_moderations_result_1);
	printf("usage_moderations_result :\n%s\n", cJSON_Print(jsonusage_moderations_result_1));
	usage_moderations_result_t* usage_moderations_result_2 = usage_moderations_result_parseFromJSON(jsonusage_moderations_result_1);
	cJSON* jsonusage_moderations_result_2 = usage_moderations_result_convertToJSON(usage_moderations_result_2);
	printf("repeating usage_moderations_result:\n%s\n", cJSON_Print(jsonusage_moderations_result_2));
}

int main() {
  test_usage_moderations_result(1);
  test_usage_moderations_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_moderations_result_MAIN
#endif // usage_moderations_result_TEST
