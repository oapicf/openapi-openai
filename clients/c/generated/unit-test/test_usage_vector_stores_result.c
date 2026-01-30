#ifndef usage_vector_stores_result_TEST
#define usage_vector_stores_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_vector_stores_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_vector_stores_result.h"
usage_vector_stores_result_t* instantiate_usage_vector_stores_result(int include_optional);



usage_vector_stores_result_t* instantiate_usage_vector_stores_result(int include_optional) {
  usage_vector_stores_result_t* usage_vector_stores_result = NULL;
  if (include_optional) {
    usage_vector_stores_result = usage_vector_stores_result_create(
      openai_api_usage_vector_stores_result_OBJECT_organization.usage.vector_stores.result,
      56,
      "0"
    );
  } else {
    usage_vector_stores_result = usage_vector_stores_result_create(
      openai_api_usage_vector_stores_result_OBJECT_organization.usage.vector_stores.result,
      56,
      "0"
    );
  }

  return usage_vector_stores_result;
}


#ifdef usage_vector_stores_result_MAIN

void test_usage_vector_stores_result(int include_optional) {
    usage_vector_stores_result_t* usage_vector_stores_result_1 = instantiate_usage_vector_stores_result(include_optional);

	cJSON* jsonusage_vector_stores_result_1 = usage_vector_stores_result_convertToJSON(usage_vector_stores_result_1);
	printf("usage_vector_stores_result :\n%s\n", cJSON_Print(jsonusage_vector_stores_result_1));
	usage_vector_stores_result_t* usage_vector_stores_result_2 = usage_vector_stores_result_parseFromJSON(jsonusage_vector_stores_result_1);
	cJSON* jsonusage_vector_stores_result_2 = usage_vector_stores_result_convertToJSON(usage_vector_stores_result_2);
	printf("repeating usage_vector_stores_result:\n%s\n", cJSON_Print(jsonusage_vector_stores_result_2));
}

int main() {
  test_usage_vector_stores_result(1);
  test_usage_vector_stores_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_vector_stores_result_MAIN
#endif // usage_vector_stores_result_TEST
