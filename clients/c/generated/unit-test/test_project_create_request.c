#ifndef project_create_request_TEST
#define project_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_create_request.h"
project_create_request_t* instantiate_project_create_request(int include_optional);



project_create_request_t* instantiate_project_create_request(int include_optional) {
  project_create_request_t* project_create_request = NULL;
  if (include_optional) {
    project_create_request = project_create_request_create(
      "0"
    );
  } else {
    project_create_request = project_create_request_create(
      "0"
    );
  }

  return project_create_request;
}


#ifdef project_create_request_MAIN

void test_project_create_request(int include_optional) {
    project_create_request_t* project_create_request_1 = instantiate_project_create_request(include_optional);

	cJSON* jsonproject_create_request_1 = project_create_request_convertToJSON(project_create_request_1);
	printf("project_create_request :\n%s\n", cJSON_Print(jsonproject_create_request_1));
	project_create_request_t* project_create_request_2 = project_create_request_parseFromJSON(jsonproject_create_request_1);
	cJSON* jsonproject_create_request_2 = project_create_request_convertToJSON(project_create_request_2);
	printf("repeating project_create_request:\n%s\n", cJSON_Print(jsonproject_create_request_2));
}

int main() {
  test_project_create_request(1);
  test_project_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_create_request_MAIN
#endif // project_create_request_TEST
