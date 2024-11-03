#ifndef list_models_response_TEST
#define list_models_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_models_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_models_response.h"
list_models_response_t* instantiate_list_models_response(int include_optional);



list_models_response_t* instantiate_list_models_response(int include_optional) {
  list_models_response_t* list_models_response = NULL;
  if (include_optional) {
    list_models_response = list_models_response_create(
      openai_api_list_models_response_OBJECT_list,
      list_createList()
    );
  } else {
    list_models_response = list_models_response_create(
      openai_api_list_models_response_OBJECT_list,
      list_createList()
    );
  }

  return list_models_response;
}


#ifdef list_models_response_MAIN

void test_list_models_response(int include_optional) {
    list_models_response_t* list_models_response_1 = instantiate_list_models_response(include_optional);

	cJSON* jsonlist_models_response_1 = list_models_response_convertToJSON(list_models_response_1);
	printf("list_models_response :\n%s\n", cJSON_Print(jsonlist_models_response_1));
	list_models_response_t* list_models_response_2 = list_models_response_parseFromJSON(jsonlist_models_response_1);
	cJSON* jsonlist_models_response_2 = list_models_response_convertToJSON(list_models_response_2);
	printf("repeating list_models_response:\n%s\n", cJSON_Print(jsonlist_models_response_2));
}

int main() {
  test_list_models_response(1);
  test_list_models_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_models_response_MAIN
#endif // list_models_response_TEST
