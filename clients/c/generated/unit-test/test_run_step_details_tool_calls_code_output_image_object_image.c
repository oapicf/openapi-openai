#ifndef run_step_details_tool_calls_code_output_image_object_image_TEST
#define run_step_details_tool_calls_code_output_image_object_image_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_details_tool_calls_code_output_image_object_image_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_details_tool_calls_code_output_image_object_image.h"
run_step_details_tool_calls_code_output_image_object_image_t* instantiate_run_step_details_tool_calls_code_output_image_object_image(int include_optional);



run_step_details_tool_calls_code_output_image_object_image_t* instantiate_run_step_details_tool_calls_code_output_image_object_image(int include_optional) {
  run_step_details_tool_calls_code_output_image_object_image_t* run_step_details_tool_calls_code_output_image_object_image = NULL;
  if (include_optional) {
    run_step_details_tool_calls_code_output_image_object_image = run_step_details_tool_calls_code_output_image_object_image_create(
      "0"
    );
  } else {
    run_step_details_tool_calls_code_output_image_object_image = run_step_details_tool_calls_code_output_image_object_image_create(
      "0"
    );
  }

  return run_step_details_tool_calls_code_output_image_object_image;
}


#ifdef run_step_details_tool_calls_code_output_image_object_image_MAIN

void test_run_step_details_tool_calls_code_output_image_object_image(int include_optional) {
    run_step_details_tool_calls_code_output_image_object_image_t* run_step_details_tool_calls_code_output_image_object_image_1 = instantiate_run_step_details_tool_calls_code_output_image_object_image(include_optional);

	cJSON* jsonrun_step_details_tool_calls_code_output_image_object_image_1 = run_step_details_tool_calls_code_output_image_object_image_convertToJSON(run_step_details_tool_calls_code_output_image_object_image_1);
	printf("run_step_details_tool_calls_code_output_image_object_image :\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_code_output_image_object_image_1));
	run_step_details_tool_calls_code_output_image_object_image_t* run_step_details_tool_calls_code_output_image_object_image_2 = run_step_details_tool_calls_code_output_image_object_image_parseFromJSON(jsonrun_step_details_tool_calls_code_output_image_object_image_1);
	cJSON* jsonrun_step_details_tool_calls_code_output_image_object_image_2 = run_step_details_tool_calls_code_output_image_object_image_convertToJSON(run_step_details_tool_calls_code_output_image_object_image_2);
	printf("repeating run_step_details_tool_calls_code_output_image_object_image:\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_code_output_image_object_image_2));
}

int main() {
  test_run_step_details_tool_calls_code_output_image_object_image(1);
  test_run_step_details_tool_calls_code_output_image_object_image(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_details_tool_calls_code_output_image_object_image_MAIN
#endif // run_step_details_tool_calls_code_output_image_object_image_TEST
