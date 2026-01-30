#ifndef invite_request_TEST
#define invite_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_request.h"
invite_request_t* instantiate_invite_request(int include_optional);



invite_request_t* instantiate_invite_request(int include_optional) {
  invite_request_t* invite_request = NULL;
  if (include_optional) {
    invite_request = invite_request_create(
      "0",
      openai_api_invite_request_ROLE_reader,
      list_createList()
    );
  } else {
    invite_request = invite_request_create(
      "0",
      openai_api_invite_request_ROLE_reader,
      list_createList()
    );
  }

  return invite_request;
}


#ifdef invite_request_MAIN

void test_invite_request(int include_optional) {
    invite_request_t* invite_request_1 = instantiate_invite_request(include_optional);

	cJSON* jsoninvite_request_1 = invite_request_convertToJSON(invite_request_1);
	printf("invite_request :\n%s\n", cJSON_Print(jsoninvite_request_1));
	invite_request_t* invite_request_2 = invite_request_parseFromJSON(jsoninvite_request_1);
	cJSON* jsoninvite_request_2 = invite_request_convertToJSON(invite_request_2);
	printf("repeating invite_request:\n%s\n", cJSON_Print(jsoninvite_request_2));
}

int main() {
  test_invite_request(1);
  test_invite_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_request_MAIN
#endif // invite_request_TEST
