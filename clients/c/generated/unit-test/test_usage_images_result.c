#ifndef usage_images_result_TEST
#define usage_images_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_images_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_images_result.h"
usage_images_result_t* instantiate_usage_images_result(int include_optional);



usage_images_result_t* instantiate_usage_images_result(int include_optional) {
  usage_images_result_t* usage_images_result = NULL;
  if (include_optional) {
    usage_images_result = usage_images_result_create(
      openai_api_usage_images_result_OBJECT_organization.usage.images.result,
      56,
      56,
      "0",
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    usage_images_result = usage_images_result_create(
      openai_api_usage_images_result_OBJECT_organization.usage.images.result,
      56,
      56,
      "0",
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  }

  return usage_images_result;
}


#ifdef usage_images_result_MAIN

void test_usage_images_result(int include_optional) {
    usage_images_result_t* usage_images_result_1 = instantiate_usage_images_result(include_optional);

	cJSON* jsonusage_images_result_1 = usage_images_result_convertToJSON(usage_images_result_1);
	printf("usage_images_result :\n%s\n", cJSON_Print(jsonusage_images_result_1));
	usage_images_result_t* usage_images_result_2 = usage_images_result_parseFromJSON(jsonusage_images_result_1);
	cJSON* jsonusage_images_result_2 = usage_images_result_convertToJSON(usage_images_result_2);
	printf("repeating usage_images_result:\n%s\n", cJSON_Print(jsonusage_images_result_2));
}

int main() {
  test_usage_images_result(1);
  test_usage_images_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_images_result_MAIN
#endif // usage_images_result_TEST
