#ifndef project_update_request_TEST
#define project_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_update_request.h"
project_update_request_t* instantiate_project_update_request(int include_optional);



project_update_request_t* instantiate_project_update_request(int include_optional) {
  project_update_request_t* project_update_request = NULL;
  if (include_optional) {
    project_update_request = project_update_request_create(
      "0"
    );
  } else {
    project_update_request = project_update_request_create(
      "0"
    );
  }

  return project_update_request;
}


#ifdef project_update_request_MAIN

void test_project_update_request(int include_optional) {
    project_update_request_t* project_update_request_1 = instantiate_project_update_request(include_optional);

	cJSON* jsonproject_update_request_1 = project_update_request_convertToJSON(project_update_request_1);
	printf("project_update_request :\n%s\n", cJSON_Print(jsonproject_update_request_1));
	project_update_request_t* project_update_request_2 = project_update_request_parseFromJSON(jsonproject_update_request_1);
	cJSON* jsonproject_update_request_2 = project_update_request_convertToJSON(project_update_request_2);
	printf("repeating project_update_request:\n%s\n", cJSON_Print(jsonproject_update_request_2));
}

int main() {
  test_project_update_request(1);
  test_project_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_update_request_MAIN
#endif // project_update_request_TEST
