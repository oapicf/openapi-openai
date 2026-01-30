#ifndef usage_embeddings_result_TEST
#define usage_embeddings_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_embeddings_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_embeddings_result.h"
usage_embeddings_result_t* instantiate_usage_embeddings_result(int include_optional);



usage_embeddings_result_t* instantiate_usage_embeddings_result(int include_optional) {
  usage_embeddings_result_t* usage_embeddings_result = NULL;
  if (include_optional) {
    usage_embeddings_result = usage_embeddings_result_create(
      openai_api_usage_embeddings_result_OBJECT_organization.usage.embeddings.result,
      56,
      56,
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    usage_embeddings_result = usage_embeddings_result_create(
      openai_api_usage_embeddings_result_OBJECT_organization.usage.embeddings.result,
      56,
      56,
      "0",
      "0",
      "0",
      "0"
    );
  }

  return usage_embeddings_result;
}


#ifdef usage_embeddings_result_MAIN

void test_usage_embeddings_result(int include_optional) {
    usage_embeddings_result_t* usage_embeddings_result_1 = instantiate_usage_embeddings_result(include_optional);

	cJSON* jsonusage_embeddings_result_1 = usage_embeddings_result_convertToJSON(usage_embeddings_result_1);
	printf("usage_embeddings_result :\n%s\n", cJSON_Print(jsonusage_embeddings_result_1));
	usage_embeddings_result_t* usage_embeddings_result_2 = usage_embeddings_result_parseFromJSON(jsonusage_embeddings_result_1);
	cJSON* jsonusage_embeddings_result_2 = usage_embeddings_result_convertToJSON(usage_embeddings_result_2);
	printf("repeating usage_embeddings_result:\n%s\n", cJSON_Print(jsonusage_embeddings_result_2));
}

int main() {
  test_usage_embeddings_result(1);
  test_usage_embeddings_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_embeddings_result_MAIN
#endif // usage_embeddings_result_TEST
