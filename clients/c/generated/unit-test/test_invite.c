#ifndef invite_TEST
#define invite_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite.h"
invite_t* instantiate_invite(int include_optional);



invite_t* instantiate_invite(int include_optional) {
  invite_t* invite = NULL;
  if (include_optional) {
    invite = invite_create(
      openai_api_invite_OBJECT_organization.invite,
      "0",
      "0",
      openai_api_invite_ROLE_owner,
      openai_api_invite_STATUS_accepted,
      56,
      56,
      56,
      list_createList()
    );
  } else {
    invite = invite_create(
      openai_api_invite_OBJECT_organization.invite,
      "0",
      "0",
      openai_api_invite_ROLE_owner,
      openai_api_invite_STATUS_accepted,
      56,
      56,
      56,
      list_createList()
    );
  }

  return invite;
}


#ifdef invite_MAIN

void test_invite(int include_optional) {
    invite_t* invite_1 = instantiate_invite(include_optional);

	cJSON* jsoninvite_1 = invite_convertToJSON(invite_1);
	printf("invite :\n%s\n", cJSON_Print(jsoninvite_1));
	invite_t* invite_2 = invite_parseFromJSON(jsoninvite_1);
	cJSON* jsoninvite_2 = invite_convertToJSON(invite_2);
	printf("repeating invite:\n%s\n", cJSON_Print(jsoninvite_2));
}

int main() {
  test_invite(1);
  test_invite(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_MAIN
#endif // invite_TEST
