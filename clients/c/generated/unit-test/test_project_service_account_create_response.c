#ifndef project_service_account_create_response_TEST
#define project_service_account_create_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_service_account_create_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_service_account_create_response.h"
project_service_account_create_response_t* instantiate_project_service_account_create_response(int include_optional);

#include "test_project_service_account_api_key.c"


project_service_account_create_response_t* instantiate_project_service_account_create_response(int include_optional) {
  project_service_account_create_response_t* project_service_account_create_response = NULL;
  if (include_optional) {
    project_service_account_create_response = project_service_account_create_response_create(
      openai_api_project_service_account_create_response_OBJECT_organization.project.service_account,
      "0",
      "0",
      openai_api_project_service_account_create_response_ROLE_member,
      56,
       // false, not to have infinite recursion
      instantiate_project_service_account_api_key(0)
    );
  } else {
    project_service_account_create_response = project_service_account_create_response_create(
      openai_api_project_service_account_create_response_OBJECT_organization.project.service_account,
      "0",
      "0",
      openai_api_project_service_account_create_response_ROLE_member,
      56,
      NULL
    );
  }

  return project_service_account_create_response;
}


#ifdef project_service_account_create_response_MAIN

void test_project_service_account_create_response(int include_optional) {
    project_service_account_create_response_t* project_service_account_create_response_1 = instantiate_project_service_account_create_response(include_optional);

	cJSON* jsonproject_service_account_create_response_1 = project_service_account_create_response_convertToJSON(project_service_account_create_response_1);
	printf("project_service_account_create_response :\n%s\n", cJSON_Print(jsonproject_service_account_create_response_1));
	project_service_account_create_response_t* project_service_account_create_response_2 = project_service_account_create_response_parseFromJSON(jsonproject_service_account_create_response_1);
	cJSON* jsonproject_service_account_create_response_2 = project_service_account_create_response_convertToJSON(project_service_account_create_response_2);
	printf("repeating project_service_account_create_response:\n%s\n", cJSON_Print(jsonproject_service_account_create_response_2));
}

int main() {
  test_project_service_account_create_response(1);
  test_project_service_account_create_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_service_account_create_response_MAIN
#endif // project_service_account_create_response_TEST
