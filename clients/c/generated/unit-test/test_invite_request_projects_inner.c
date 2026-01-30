#ifndef invite_request_projects_inner_TEST
#define invite_request_projects_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_request_projects_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_request_projects_inner.h"
invite_request_projects_inner_t* instantiate_invite_request_projects_inner(int include_optional);



invite_request_projects_inner_t* instantiate_invite_request_projects_inner(int include_optional) {
  invite_request_projects_inner_t* invite_request_projects_inner = NULL;
  if (include_optional) {
    invite_request_projects_inner = invite_request_projects_inner_create(
      "0",
      openai_api_invite_request_projects_inner_ROLE_member
    );
  } else {
    invite_request_projects_inner = invite_request_projects_inner_create(
      "0",
      openai_api_invite_request_projects_inner_ROLE_member
    );
  }

  return invite_request_projects_inner;
}


#ifdef invite_request_projects_inner_MAIN

void test_invite_request_projects_inner(int include_optional) {
    invite_request_projects_inner_t* invite_request_projects_inner_1 = instantiate_invite_request_projects_inner(include_optional);

	cJSON* jsoninvite_request_projects_inner_1 = invite_request_projects_inner_convertToJSON(invite_request_projects_inner_1);
	printf("invite_request_projects_inner :\n%s\n", cJSON_Print(jsoninvite_request_projects_inner_1));
	invite_request_projects_inner_t* invite_request_projects_inner_2 = invite_request_projects_inner_parseFromJSON(jsoninvite_request_projects_inner_1);
	cJSON* jsoninvite_request_projects_inner_2 = invite_request_projects_inner_convertToJSON(invite_request_projects_inner_2);
	printf("repeating invite_request_projects_inner:\n%s\n", cJSON_Print(jsoninvite_request_projects_inner_2));
}

int main() {
  test_invite_request_projects_inner(1);
  test_invite_request_projects_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_request_projects_inner_MAIN
#endif // invite_request_projects_inner_TEST
