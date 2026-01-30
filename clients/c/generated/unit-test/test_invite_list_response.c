#ifndef invite_list_response_TEST
#define invite_list_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_list_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_list_response.h"
invite_list_response_t* instantiate_invite_list_response(int include_optional);



invite_list_response_t* instantiate_invite_list_response(int include_optional) {
  invite_list_response_t* invite_list_response = NULL;
  if (include_optional) {
    invite_list_response = invite_list_response_create(
      openai_api_invite_list_response_OBJECT_list,
      list_createList(),
      "0",
      "0",
      1
    );
  } else {
    invite_list_response = invite_list_response_create(
      openai_api_invite_list_response_OBJECT_list,
      list_createList(),
      "0",
      "0",
      1
    );
  }

  return invite_list_response;
}


#ifdef invite_list_response_MAIN

void test_invite_list_response(int include_optional) {
    invite_list_response_t* invite_list_response_1 = instantiate_invite_list_response(include_optional);

	cJSON* jsoninvite_list_response_1 = invite_list_response_convertToJSON(invite_list_response_1);
	printf("invite_list_response :\n%s\n", cJSON_Print(jsoninvite_list_response_1));
	invite_list_response_t* invite_list_response_2 = invite_list_response_parseFromJSON(jsoninvite_list_response_1);
	cJSON* jsoninvite_list_response_2 = invite_list_response_convertToJSON(invite_list_response_2);
	printf("repeating invite_list_response:\n%s\n", cJSON_Print(jsoninvite_list_response_2));
}

int main() {
  test_invite_list_response(1);
  test_invite_list_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_list_response_MAIN
#endif // invite_list_response_TEST
