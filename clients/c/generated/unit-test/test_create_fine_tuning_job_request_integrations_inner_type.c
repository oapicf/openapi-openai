#ifndef create_fine_tuning_job_request_integrations_inner_type_TEST
#define create_fine_tuning_job_request_integrations_inner_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_fine_tuning_job_request_integrations_inner_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_fine_tuning_job_request_integrations_inner_type.h"
create_fine_tuning_job_request_integrations_inner_type_t* instantiate_create_fine_tuning_job_request_integrations_inner_type(int include_optional);



create_fine_tuning_job_request_integrations_inner_type_t* instantiate_create_fine_tuning_job_request_integrations_inner_type(int include_optional) {
  create_fine_tuning_job_request_integrations_inner_type_t* create_fine_tuning_job_request_integrations_inner_type = NULL;
  if (include_optional) {
    create_fine_tuning_job_request_integrations_inner_type = create_fine_tuning_job_request_integrations_inner_type_create(
    );
  } else {
    create_fine_tuning_job_request_integrations_inner_type = create_fine_tuning_job_request_integrations_inner_type_create(
    );
  }

  return create_fine_tuning_job_request_integrations_inner_type;
}


#ifdef create_fine_tuning_job_request_integrations_inner_type_MAIN

void test_create_fine_tuning_job_request_integrations_inner_type(int include_optional) {
    create_fine_tuning_job_request_integrations_inner_type_t* create_fine_tuning_job_request_integrations_inner_type_1 = instantiate_create_fine_tuning_job_request_integrations_inner_type(include_optional);

	cJSON* jsoncreate_fine_tuning_job_request_integrations_inner_type_1 = create_fine_tuning_job_request_integrations_inner_type_convertToJSON(create_fine_tuning_job_request_integrations_inner_type_1);
	printf("create_fine_tuning_job_request_integrations_inner_type :\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_integrations_inner_type_1));
	create_fine_tuning_job_request_integrations_inner_type_t* create_fine_tuning_job_request_integrations_inner_type_2 = create_fine_tuning_job_request_integrations_inner_type_parseFromJSON(jsoncreate_fine_tuning_job_request_integrations_inner_type_1);
	cJSON* jsoncreate_fine_tuning_job_request_integrations_inner_type_2 = create_fine_tuning_job_request_integrations_inner_type_convertToJSON(create_fine_tuning_job_request_integrations_inner_type_2);
	printf("repeating create_fine_tuning_job_request_integrations_inner_type:\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_integrations_inner_type_2));
}

int main() {
  test_create_fine_tuning_job_request_integrations_inner_type(1);
  test_create_fine_tuning_job_request_integrations_inner_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_fine_tuning_job_request_integrations_inner_type_MAIN
#endif // create_fine_tuning_job_request_integrations_inner_type_TEST
