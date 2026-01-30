#ifndef user_list_response_TEST
#define user_list_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_list_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_list_response.h"
user_list_response_t* instantiate_user_list_response(int include_optional);



user_list_response_t* instantiate_user_list_response(int include_optional) {
  user_list_response_t* user_list_response = NULL;
  if (include_optional) {
    user_list_response = user_list_response_create(
      openai_api_user_list_response_OBJECT_list,
      list_createList(),
      "0",
      "0",
      1
    );
  } else {
    user_list_response = user_list_response_create(
      openai_api_user_list_response_OBJECT_list,
      list_createList(),
      "0",
      "0",
      1
    );
  }

  return user_list_response;
}


#ifdef user_list_response_MAIN

void test_user_list_response(int include_optional) {
    user_list_response_t* user_list_response_1 = instantiate_user_list_response(include_optional);

	cJSON* jsonuser_list_response_1 = user_list_response_convertToJSON(user_list_response_1);
	printf("user_list_response :\n%s\n", cJSON_Print(jsonuser_list_response_1));
	user_list_response_t* user_list_response_2 = user_list_response_parseFromJSON(jsonuser_list_response_1);
	cJSON* jsonuser_list_response_2 = user_list_response_convertToJSON(user_list_response_2);
	printf("repeating user_list_response:\n%s\n", cJSON_Print(jsonuser_list_response_2));
}

int main() {
  test_user_list_response(1);
  test_user_list_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_list_response_MAIN
#endif // user_list_response_TEST
