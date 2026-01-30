#ifndef response_format_json_schema_json_schema_TEST
#define response_format_json_schema_json_schema_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define response_format_json_schema_json_schema_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/response_format_json_schema_json_schema.h"
response_format_json_schema_json_schema_t* instantiate_response_format_json_schema_json_schema(int include_optional);



response_format_json_schema_json_schema_t* instantiate_response_format_json_schema_json_schema(int include_optional) {
  response_format_json_schema_json_schema_t* response_format_json_schema_json_schema = NULL;
  if (include_optional) {
    response_format_json_schema_json_schema = response_format_json_schema_json_schema_create(
      "0",
      "0",
      list_createList(),
      1
    );
  } else {
    response_format_json_schema_json_schema = response_format_json_schema_json_schema_create(
      "0",
      "0",
      list_createList(),
      1
    );
  }

  return response_format_json_schema_json_schema;
}


#ifdef response_format_json_schema_json_schema_MAIN

void test_response_format_json_schema_json_schema(int include_optional) {
    response_format_json_schema_json_schema_t* response_format_json_schema_json_schema_1 = instantiate_response_format_json_schema_json_schema(include_optional);

	cJSON* jsonresponse_format_json_schema_json_schema_1 = response_format_json_schema_json_schema_convertToJSON(response_format_json_schema_json_schema_1);
	printf("response_format_json_schema_json_schema :\n%s\n", cJSON_Print(jsonresponse_format_json_schema_json_schema_1));
	response_format_json_schema_json_schema_t* response_format_json_schema_json_schema_2 = response_format_json_schema_json_schema_parseFromJSON(jsonresponse_format_json_schema_json_schema_1);
	cJSON* jsonresponse_format_json_schema_json_schema_2 = response_format_json_schema_json_schema_convertToJSON(response_format_json_schema_json_schema_2);
	printf("repeating response_format_json_schema_json_schema:\n%s\n", cJSON_Print(jsonresponse_format_json_schema_json_schema_2));
}

int main() {
  test_response_format_json_schema_json_schema(1);
  test_response_format_json_schema_json_schema(0);

  printf("Hello world \n");
  return 0;
}

#endif // response_format_json_schema_json_schema_MAIN
#endif // response_format_json_schema_json_schema_TEST
