#ifndef project_service_account_api_key_TEST
#define project_service_account_api_key_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_service_account_api_key_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_service_account_api_key.h"
project_service_account_api_key_t* instantiate_project_service_account_api_key(int include_optional);



project_service_account_api_key_t* instantiate_project_service_account_api_key(int include_optional) {
  project_service_account_api_key_t* project_service_account_api_key = NULL;
  if (include_optional) {
    project_service_account_api_key = project_service_account_api_key_create(
      openai_api_project_service_account_api_key_OBJECT_organization.project.service_account.api_key,
      "0",
      "0",
      56,
      "0"
    );
  } else {
    project_service_account_api_key = project_service_account_api_key_create(
      openai_api_project_service_account_api_key_OBJECT_organization.project.service_account.api_key,
      "0",
      "0",
      56,
      "0"
    );
  }

  return project_service_account_api_key;
}


#ifdef project_service_account_api_key_MAIN

void test_project_service_account_api_key(int include_optional) {
    project_service_account_api_key_t* project_service_account_api_key_1 = instantiate_project_service_account_api_key(include_optional);

	cJSON* jsonproject_service_account_api_key_1 = project_service_account_api_key_convertToJSON(project_service_account_api_key_1);
	printf("project_service_account_api_key :\n%s\n", cJSON_Print(jsonproject_service_account_api_key_1));
	project_service_account_api_key_t* project_service_account_api_key_2 = project_service_account_api_key_parseFromJSON(jsonproject_service_account_api_key_1);
	cJSON* jsonproject_service_account_api_key_2 = project_service_account_api_key_convertToJSON(project_service_account_api_key_2);
	printf("repeating project_service_account_api_key:\n%s\n", cJSON_Print(jsonproject_service_account_api_key_2));
}

int main() {
  test_project_service_account_api_key(1);
  test_project_service_account_api_key(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_service_account_api_key_MAIN
#endif // project_service_account_api_key_TEST
