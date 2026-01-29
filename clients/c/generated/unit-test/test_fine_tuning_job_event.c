#ifndef fine_tuning_job_event_TEST
#define fine_tuning_job_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tuning_job_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tuning_job_event.h"
fine_tuning_job_event_t* instantiate_fine_tuning_job_event(int include_optional);



fine_tuning_job_event_t* instantiate_fine_tuning_job_event(int include_optional) {
  fine_tuning_job_event_t* fine_tuning_job_event = NULL;
  if (include_optional) {
    fine_tuning_job_event = fine_tuning_job_event_create(
      "0",
      56,
      openai_api_fine_tuning_job_event_LEVEL_info,
      "0",
      openai_api_fine_tuning_job_event_OBJECT_fine_tuning.job.event
    );
  } else {
    fine_tuning_job_event = fine_tuning_job_event_create(
      "0",
      56,
      openai_api_fine_tuning_job_event_LEVEL_info,
      "0",
      openai_api_fine_tuning_job_event_OBJECT_fine_tuning.job.event
    );
  }

  return fine_tuning_job_event;
}


#ifdef fine_tuning_job_event_MAIN

void test_fine_tuning_job_event(int include_optional) {
    fine_tuning_job_event_t* fine_tuning_job_event_1 = instantiate_fine_tuning_job_event(include_optional);

	cJSON* jsonfine_tuning_job_event_1 = fine_tuning_job_event_convertToJSON(fine_tuning_job_event_1);
	printf("fine_tuning_job_event :\n%s\n", cJSON_Print(jsonfine_tuning_job_event_1));
	fine_tuning_job_event_t* fine_tuning_job_event_2 = fine_tuning_job_event_parseFromJSON(jsonfine_tuning_job_event_1);
	cJSON* jsonfine_tuning_job_event_2 = fine_tuning_job_event_convertToJSON(fine_tuning_job_event_2);
	printf("repeating fine_tuning_job_event:\n%s\n", cJSON_Print(jsonfine_tuning_job_event_2));
}

int main() {
  test_fine_tuning_job_event(1);
  test_fine_tuning_job_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tuning_job_event_MAIN
#endif // fine_tuning_job_event_TEST
