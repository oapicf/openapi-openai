#ifndef project_user_update_request_TEST
#define project_user_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_user_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_user_update_request.h"
project_user_update_request_t* instantiate_project_user_update_request(int include_optional);



project_user_update_request_t* instantiate_project_user_update_request(int include_optional) {
  project_user_update_request_t* project_user_update_request = NULL;
  if (include_optional) {
    project_user_update_request = project_user_update_request_create(
      openai_api_project_user_update_request_ROLE_owner
    );
  } else {
    project_user_update_request = project_user_update_request_create(
      openai_api_project_user_update_request_ROLE_owner
    );
  }

  return project_user_update_request;
}


#ifdef project_user_update_request_MAIN

void test_project_user_update_request(int include_optional) {
    project_user_update_request_t* project_user_update_request_1 = instantiate_project_user_update_request(include_optional);

	cJSON* jsonproject_user_update_request_1 = project_user_update_request_convertToJSON(project_user_update_request_1);
	printf("project_user_update_request :\n%s\n", cJSON_Print(jsonproject_user_update_request_1));
	project_user_update_request_t* project_user_update_request_2 = project_user_update_request_parseFromJSON(jsonproject_user_update_request_1);
	cJSON* jsonproject_user_update_request_2 = project_user_update_request_convertToJSON(project_user_update_request_2);
	printf("repeating project_user_update_request:\n%s\n", cJSON_Print(jsonproject_user_update_request_2));
}

int main() {
  test_project_user_update_request(1);
  test_project_user_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_user_update_request_MAIN
#endif // project_user_update_request_TEST
