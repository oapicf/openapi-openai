#ifndef response_format_json_object_TEST
#define response_format_json_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define response_format_json_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/response_format_json_object.h"
response_format_json_object_t* instantiate_response_format_json_object(int include_optional);



response_format_json_object_t* instantiate_response_format_json_object(int include_optional) {
  response_format_json_object_t* response_format_json_object = NULL;
  if (include_optional) {
    response_format_json_object = response_format_json_object_create(
      openai_api_response_format_json_object_TYPE_json_object
    );
  } else {
    response_format_json_object = response_format_json_object_create(
      openai_api_response_format_json_object_TYPE_json_object
    );
  }

  return response_format_json_object;
}


#ifdef response_format_json_object_MAIN

void test_response_format_json_object(int include_optional) {
    response_format_json_object_t* response_format_json_object_1 = instantiate_response_format_json_object(include_optional);

	cJSON* jsonresponse_format_json_object_1 = response_format_json_object_convertToJSON(response_format_json_object_1);
	printf("response_format_json_object :\n%s\n", cJSON_Print(jsonresponse_format_json_object_1));
	response_format_json_object_t* response_format_json_object_2 = response_format_json_object_parseFromJSON(jsonresponse_format_json_object_1);
	cJSON* jsonresponse_format_json_object_2 = response_format_json_object_convertToJSON(response_format_json_object_2);
	printf("repeating response_format_json_object:\n%s\n", cJSON_Print(jsonresponse_format_json_object_2));
}

int main() {
  test_response_format_json_object(1);
  test_response_format_json_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // response_format_json_object_MAIN
#endif // response_format_json_object_TEST
