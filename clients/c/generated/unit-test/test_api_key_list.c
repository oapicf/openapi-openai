#ifndef api_key_list_TEST
#define api_key_list_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define api_key_list_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/api_key_list.h"
api_key_list_t* instantiate_api_key_list(int include_optional);



api_key_list_t* instantiate_api_key_list(int include_optional) {
  api_key_list_t* api_key_list = NULL;
  if (include_optional) {
    api_key_list = api_key_list_create(
      "list",
      list_createList(),
      false,
      "key_abc",
      "key_xyz"
    );
  } else {
    api_key_list = api_key_list_create(
      "list",
      list_createList(),
      false,
      "key_abc",
      "key_xyz"
    );
  }

  return api_key_list;
}


#ifdef api_key_list_MAIN

void test_api_key_list(int include_optional) {
    api_key_list_t* api_key_list_1 = instantiate_api_key_list(include_optional);

	cJSON* jsonapi_key_list_1 = api_key_list_convertToJSON(api_key_list_1);
	printf("api_key_list :\n%s\n", cJSON_Print(jsonapi_key_list_1));
	api_key_list_t* api_key_list_2 = api_key_list_parseFromJSON(jsonapi_key_list_1);
	cJSON* jsonapi_key_list_2 = api_key_list_convertToJSON(api_key_list_2);
	printf("repeating api_key_list:\n%s\n", cJSON_Print(jsonapi_key_list_2));
}

int main() {
  test_api_key_list(1);
  test_api_key_list(0);

  printf("Hello world \n");
  return 0;
}

#endif // api_key_list_MAIN
#endif // api_key_list_TEST
