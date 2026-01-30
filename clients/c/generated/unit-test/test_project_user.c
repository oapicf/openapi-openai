#ifndef project_user_TEST
#define project_user_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_user_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_user.h"
project_user_t* instantiate_project_user(int include_optional);



project_user_t* instantiate_project_user(int include_optional) {
  project_user_t* project_user = NULL;
  if (include_optional) {
    project_user = project_user_create(
      openai_api_project_user_OBJECT_organization.project.user,
      "0",
      "0",
      "0",
      openai_api_project_user_ROLE_owner,
      56
    );
  } else {
    project_user = project_user_create(
      openai_api_project_user_OBJECT_organization.project.user,
      "0",
      "0",
      "0",
      openai_api_project_user_ROLE_owner,
      56
    );
  }

  return project_user;
}


#ifdef project_user_MAIN

void test_project_user(int include_optional) {
    project_user_t* project_user_1 = instantiate_project_user(include_optional);

	cJSON* jsonproject_user_1 = project_user_convertToJSON(project_user_1);
	printf("project_user :\n%s\n", cJSON_Print(jsonproject_user_1));
	project_user_t* project_user_2 = project_user_parseFromJSON(jsonproject_user_1);
	cJSON* jsonproject_user_2 = project_user_convertToJSON(project_user_2);
	printf("repeating project_user:\n%s\n", cJSON_Print(jsonproject_user_2));
}

int main() {
  test_project_user(1);
  test_project_user(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_user_MAIN
#endif // project_user_TEST
