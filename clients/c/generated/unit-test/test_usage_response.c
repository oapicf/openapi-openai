#ifndef usage_response_TEST
#define usage_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_response.h"
usage_response_t* instantiate_usage_response(int include_optional);



usage_response_t* instantiate_usage_response(int include_optional) {
  usage_response_t* usage_response = NULL;
  if (include_optional) {
    usage_response = usage_response_create(
      openai_api_usage_response_OBJECT_page,
      list_createList(),
      1,
      "0"
    );
  } else {
    usage_response = usage_response_create(
      openai_api_usage_response_OBJECT_page,
      list_createList(),
      1,
      "0"
    );
  }

  return usage_response;
}


#ifdef usage_response_MAIN

void test_usage_response(int include_optional) {
    usage_response_t* usage_response_1 = instantiate_usage_response(include_optional);

	cJSON* jsonusage_response_1 = usage_response_convertToJSON(usage_response_1);
	printf("usage_response :\n%s\n", cJSON_Print(jsonusage_response_1));
	usage_response_t* usage_response_2 = usage_response_parseFromJSON(jsonusage_response_1);
	cJSON* jsonusage_response_2 = usage_response_convertToJSON(usage_response_2);
	printf("repeating usage_response:\n%s\n", cJSON_Print(jsonusage_response_2));
}

int main() {
  test_usage_response(1);
  test_usage_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_response_MAIN
#endif // usage_response_TEST
