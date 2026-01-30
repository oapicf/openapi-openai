#ifndef project_service_account_TEST
#define project_service_account_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_service_account_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_service_account.h"
project_service_account_t* instantiate_project_service_account(int include_optional);



project_service_account_t* instantiate_project_service_account(int include_optional) {
  project_service_account_t* project_service_account = NULL;
  if (include_optional) {
    project_service_account = project_service_account_create(
      openai_api_project_service_account_OBJECT_organization.project.service_account,
      "0",
      "0",
      openai_api_project_service_account_ROLE_owner,
      56
    );
  } else {
    project_service_account = project_service_account_create(
      openai_api_project_service_account_OBJECT_organization.project.service_account,
      "0",
      "0",
      openai_api_project_service_account_ROLE_owner,
      56
    );
  }

  return project_service_account;
}


#ifdef project_service_account_MAIN

void test_project_service_account(int include_optional) {
    project_service_account_t* project_service_account_1 = instantiate_project_service_account(include_optional);

	cJSON* jsonproject_service_account_1 = project_service_account_convertToJSON(project_service_account_1);
	printf("project_service_account :\n%s\n", cJSON_Print(jsonproject_service_account_1));
	project_service_account_t* project_service_account_2 = project_service_account_parseFromJSON(jsonproject_service_account_1);
	cJSON* jsonproject_service_account_2 = project_service_account_convertToJSON(project_service_account_2);
	printf("repeating project_service_account:\n%s\n", cJSON_Print(jsonproject_service_account_2));
}

int main() {
  test_project_service_account(1);
  test_project_service_account(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_service_account_MAIN
#endif // project_service_account_TEST
