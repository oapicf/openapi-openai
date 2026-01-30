#ifndef project_api_key_owner_TEST
#define project_api_key_owner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_api_key_owner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_api_key_owner.h"
project_api_key_owner_t* instantiate_project_api_key_owner(int include_optional);

#include "test_project_user.c"
#include "test_project_service_account.c"


project_api_key_owner_t* instantiate_project_api_key_owner(int include_optional) {
  project_api_key_owner_t* project_api_key_owner = NULL;
  if (include_optional) {
    project_api_key_owner = project_api_key_owner_create(
      openai_api_project_api_key_owner_TYPE_user,
       // false, not to have infinite recursion
      instantiate_project_user(0),
       // false, not to have infinite recursion
      instantiate_project_service_account(0)
    );
  } else {
    project_api_key_owner = project_api_key_owner_create(
      openai_api_project_api_key_owner_TYPE_user,
      NULL,
      NULL
    );
  }

  return project_api_key_owner;
}


#ifdef project_api_key_owner_MAIN

void test_project_api_key_owner(int include_optional) {
    project_api_key_owner_t* project_api_key_owner_1 = instantiate_project_api_key_owner(include_optional);

	cJSON* jsonproject_api_key_owner_1 = project_api_key_owner_convertToJSON(project_api_key_owner_1);
	printf("project_api_key_owner :\n%s\n", cJSON_Print(jsonproject_api_key_owner_1));
	project_api_key_owner_t* project_api_key_owner_2 = project_api_key_owner_parseFromJSON(jsonproject_api_key_owner_1);
	cJSON* jsonproject_api_key_owner_2 = project_api_key_owner_convertToJSON(project_api_key_owner_2);
	printf("repeating project_api_key_owner:\n%s\n", cJSON_Print(jsonproject_api_key_owner_2));
}

int main() {
  test_project_api_key_owner(1);
  test_project_api_key_owner(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_api_key_owner_MAIN
#endif // project_api_key_owner_TEST
