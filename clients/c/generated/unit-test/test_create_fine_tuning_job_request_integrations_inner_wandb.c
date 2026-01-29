#ifndef create_fine_tuning_job_request_integrations_inner_wandb_TEST
#define create_fine_tuning_job_request_integrations_inner_wandb_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_fine_tuning_job_request_integrations_inner_wandb_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_fine_tuning_job_request_integrations_inner_wandb.h"
create_fine_tuning_job_request_integrations_inner_wandb_t* instantiate_create_fine_tuning_job_request_integrations_inner_wandb(int include_optional);



create_fine_tuning_job_request_integrations_inner_wandb_t* instantiate_create_fine_tuning_job_request_integrations_inner_wandb(int include_optional) {
  create_fine_tuning_job_request_integrations_inner_wandb_t* create_fine_tuning_job_request_integrations_inner_wandb = NULL;
  if (include_optional) {
    create_fine_tuning_job_request_integrations_inner_wandb = create_fine_tuning_job_request_integrations_inner_wandb_create(
      "my-wandb-project",
      "0",
      "0",
      list_createList()
    );
  } else {
    create_fine_tuning_job_request_integrations_inner_wandb = create_fine_tuning_job_request_integrations_inner_wandb_create(
      "my-wandb-project",
      "0",
      "0",
      list_createList()
    );
  }

  return create_fine_tuning_job_request_integrations_inner_wandb;
}


#ifdef create_fine_tuning_job_request_integrations_inner_wandb_MAIN

void test_create_fine_tuning_job_request_integrations_inner_wandb(int include_optional) {
    create_fine_tuning_job_request_integrations_inner_wandb_t* create_fine_tuning_job_request_integrations_inner_wandb_1 = instantiate_create_fine_tuning_job_request_integrations_inner_wandb(include_optional);

	cJSON* jsoncreate_fine_tuning_job_request_integrations_inner_wandb_1 = create_fine_tuning_job_request_integrations_inner_wandb_convertToJSON(create_fine_tuning_job_request_integrations_inner_wandb_1);
	printf("create_fine_tuning_job_request_integrations_inner_wandb :\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_integrations_inner_wandb_1));
	create_fine_tuning_job_request_integrations_inner_wandb_t* create_fine_tuning_job_request_integrations_inner_wandb_2 = create_fine_tuning_job_request_integrations_inner_wandb_parseFromJSON(jsoncreate_fine_tuning_job_request_integrations_inner_wandb_1);
	cJSON* jsoncreate_fine_tuning_job_request_integrations_inner_wandb_2 = create_fine_tuning_job_request_integrations_inner_wandb_convertToJSON(create_fine_tuning_job_request_integrations_inner_wandb_2);
	printf("repeating create_fine_tuning_job_request_integrations_inner_wandb:\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_integrations_inner_wandb_2));
}

int main() {
  test_create_fine_tuning_job_request_integrations_inner_wandb(1);
  test_create_fine_tuning_job_request_integrations_inner_wandb(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_fine_tuning_job_request_integrations_inner_wandb_MAIN
#endif // create_fine_tuning_job_request_integrations_inner_wandb_TEST
