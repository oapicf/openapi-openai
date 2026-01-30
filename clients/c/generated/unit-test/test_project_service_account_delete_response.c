#ifndef project_service_account_delete_response_TEST
#define project_service_account_delete_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_service_account_delete_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_service_account_delete_response.h"
project_service_account_delete_response_t* instantiate_project_service_account_delete_response(int include_optional);



project_service_account_delete_response_t* instantiate_project_service_account_delete_response(int include_optional) {
  project_service_account_delete_response_t* project_service_account_delete_response = NULL;
  if (include_optional) {
    project_service_account_delete_response = project_service_account_delete_response_create(
      openai_api_project_service_account_delete_response_OBJECT_organization.project.service_account.deleted,
      "0",
      1
    );
  } else {
    project_service_account_delete_response = project_service_account_delete_response_create(
      openai_api_project_service_account_delete_response_OBJECT_organization.project.service_account.deleted,
      "0",
      1
    );
  }

  return project_service_account_delete_response;
}


#ifdef project_service_account_delete_response_MAIN

void test_project_service_account_delete_response(int include_optional) {
    project_service_account_delete_response_t* project_service_account_delete_response_1 = instantiate_project_service_account_delete_response(include_optional);

	cJSON* jsonproject_service_account_delete_response_1 = project_service_account_delete_response_convertToJSON(project_service_account_delete_response_1);
	printf("project_service_account_delete_response :\n%s\n", cJSON_Print(jsonproject_service_account_delete_response_1));
	project_service_account_delete_response_t* project_service_account_delete_response_2 = project_service_account_delete_response_parseFromJSON(jsonproject_service_account_delete_response_1);
	cJSON* jsonproject_service_account_delete_response_2 = project_service_account_delete_response_convertToJSON(project_service_account_delete_response_2);
	printf("repeating project_service_account_delete_response:\n%s\n", cJSON_Print(jsonproject_service_account_delete_response_2));
}

int main() {
  test_project_service_account_delete_response(1);
  test_project_service_account_delete_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_service_account_delete_response_MAIN
#endif // project_service_account_delete_response_TEST
