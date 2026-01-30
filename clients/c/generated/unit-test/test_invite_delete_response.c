#ifndef invite_delete_response_TEST
#define invite_delete_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_delete_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_delete_response.h"
invite_delete_response_t* instantiate_invite_delete_response(int include_optional);



invite_delete_response_t* instantiate_invite_delete_response(int include_optional) {
  invite_delete_response_t* invite_delete_response = NULL;
  if (include_optional) {
    invite_delete_response = invite_delete_response_create(
      openai_api_invite_delete_response_OBJECT_organization.invite.deleted,
      "0",
      1
    );
  } else {
    invite_delete_response = invite_delete_response_create(
      openai_api_invite_delete_response_OBJECT_organization.invite.deleted,
      "0",
      1
    );
  }

  return invite_delete_response;
}


#ifdef invite_delete_response_MAIN

void test_invite_delete_response(int include_optional) {
    invite_delete_response_t* invite_delete_response_1 = instantiate_invite_delete_response(include_optional);

	cJSON* jsoninvite_delete_response_1 = invite_delete_response_convertToJSON(invite_delete_response_1);
	printf("invite_delete_response :\n%s\n", cJSON_Print(jsoninvite_delete_response_1));
	invite_delete_response_t* invite_delete_response_2 = invite_delete_response_parseFromJSON(jsoninvite_delete_response_1);
	cJSON* jsoninvite_delete_response_2 = invite_delete_response_convertToJSON(invite_delete_response_2);
	printf("repeating invite_delete_response:\n%s\n", cJSON_Print(jsoninvite_delete_response_2));
}

int main() {
  test_invite_delete_response(1);
  test_invite_delete_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_delete_response_MAIN
#endif // invite_delete_response_TEST
