#ifndef project_api_key_TEST
#define project_api_key_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_api_key_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_api_key.h"
project_api_key_t* instantiate_project_api_key(int include_optional);

#include "test_project_api_key_owner.c"


project_api_key_t* instantiate_project_api_key(int include_optional) {
  project_api_key_t* project_api_key = NULL;
  if (include_optional) {
    project_api_key = project_api_key_create(
      openai_api_project_api_key_OBJECT_organization.project.api_key,
      "0",
      "0",
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_project_api_key_owner(0)
    );
  } else {
    project_api_key = project_api_key_create(
      openai_api_project_api_key_OBJECT_organization.project.api_key,
      "0",
      "0",
      56,
      "0",
      NULL
    );
  }

  return project_api_key;
}


#ifdef project_api_key_MAIN

void test_project_api_key(int include_optional) {
    project_api_key_t* project_api_key_1 = instantiate_project_api_key(include_optional);

	cJSON* jsonproject_api_key_1 = project_api_key_convertToJSON(project_api_key_1);
	printf("project_api_key :\n%s\n", cJSON_Print(jsonproject_api_key_1));
	project_api_key_t* project_api_key_2 = project_api_key_parseFromJSON(jsonproject_api_key_1);
	cJSON* jsonproject_api_key_2 = project_api_key_convertToJSON(project_api_key_2);
	printf("repeating project_api_key:\n%s\n", cJSON_Print(jsonproject_api_key_2));
}

int main() {
  test_project_api_key(1);
  test_project_api_key(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_api_key_MAIN
#endif // project_api_key_TEST
