#ifndef done_event_TEST
#define done_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define done_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/done_event.h"
done_event_t* instantiate_done_event(int include_optional);



done_event_t* instantiate_done_event(int include_optional) {
  done_event_t* done_event = NULL;
  if (include_optional) {
    done_event = done_event_create(
      openai_api_done_event_EVENT_done,
      openai_api_done_event_DATA_[DONE]
    );
  } else {
    done_event = done_event_create(
      openai_api_done_event_EVENT_done,
      openai_api_done_event_DATA_[DONE]
    );
  }

  return done_event;
}


#ifdef done_event_MAIN

void test_done_event(int include_optional) {
    done_event_t* done_event_1 = instantiate_done_event(include_optional);

	cJSON* jsondone_event_1 = done_event_convertToJSON(done_event_1);
	printf("done_event :\n%s\n", cJSON_Print(jsondone_event_1));
	done_event_t* done_event_2 = done_event_parseFromJSON(jsondone_event_1);
	cJSON* jsondone_event_2 = done_event_convertToJSON(done_event_2);
	printf("repeating done_event:\n%s\n", cJSON_Print(jsondone_event_2));
}

int main() {
  test_done_event(1);
  test_done_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // done_event_MAIN
#endif // done_event_TEST
