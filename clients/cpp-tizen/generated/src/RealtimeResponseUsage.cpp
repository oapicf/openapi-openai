#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeResponse_usage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeResponse_usage::RealtimeResponse_usage()
{
	//__init();
}

RealtimeResponse_usage::~RealtimeResponse_usage()
{
	//__cleanup();
}

void
RealtimeResponse_usage::__init()
{
	//total_tokens = int(0);
	//input_tokens = int(0);
	//output_tokens = int(0);
	//input_token_details = new RealtimeResponse_usage_input_token_details();
	//output_token_details = new RealtimeResponse_usage_output_token_details();
}

void
RealtimeResponse_usage::__cleanup()
{
	//if(total_tokens != NULL) {
	//
	//delete total_tokens;
	//total_tokens = NULL;
	//}
	//if(input_tokens != NULL) {
	//
	//delete input_tokens;
	//input_tokens = NULL;
	//}
	//if(output_tokens != NULL) {
	//
	//delete output_tokens;
	//output_tokens = NULL;
	//}
	//if(input_token_details != NULL) {
	//
	//delete input_token_details;
	//input_token_details = NULL;
	//}
	//if(output_token_details != NULL) {
	//
	//delete output_token_details;
	//output_token_details = NULL;
	//}
	//
}

void
RealtimeResponse_usage::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *total_tokensKey = "total_tokens";
	node = json_object_get_member(pJsonObject, total_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *input_tokensKey = "input_tokens";
	node = json_object_get_member(pJsonObject, input_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&input_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *output_tokensKey = "output_tokens";
	node = json_object_get_member(pJsonObject, output_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&output_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *input_token_detailsKey = "input_token_details";
	node = json_object_get_member(pJsonObject, input_token_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeResponse_usage_input_token_details")) {
			jsonToValue(&input_token_details, node, "RealtimeResponse_usage_input_token_details", "RealtimeResponse_usage_input_token_details");
		} else {
			
			RealtimeResponse_usage_input_token_details* obj = static_cast<RealtimeResponse_usage_input_token_details*> (&input_token_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *output_token_detailsKey = "output_token_details";
	node = json_object_get_member(pJsonObject, output_token_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeResponse_usage_output_token_details")) {
			jsonToValue(&output_token_details, node, "RealtimeResponse_usage_output_token_details", "RealtimeResponse_usage_output_token_details");
		} else {
			
			RealtimeResponse_usage_output_token_details* obj = static_cast<RealtimeResponse_usage_output_token_details*> (&output_token_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeResponse_usage::RealtimeResponse_usage(char* json)
{
	this->fromJson(json);
}

char*
RealtimeResponse_usage::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getTotalTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *total_tokensKey = "total_tokens";
	json_object_set_member(pJsonObject, total_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getInputTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *input_tokensKey = "input_tokens";
	json_object_set_member(pJsonObject, input_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getOutputTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *output_tokensKey = "output_tokens";
	json_object_set_member(pJsonObject, output_tokensKey, node);
	if (isprimitive("RealtimeResponse_usage_input_token_details")) {
		RealtimeResponse_usage_input_token_details obj = getInputTokenDetails();
		node = converttoJson(&obj, "RealtimeResponse_usage_input_token_details", "");
	}
	else {
		
		RealtimeResponse_usage_input_token_details obj = static_cast<RealtimeResponse_usage_input_token_details> (getInputTokenDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *input_token_detailsKey = "input_token_details";
	json_object_set_member(pJsonObject, input_token_detailsKey, node);
	if (isprimitive("RealtimeResponse_usage_output_token_details")) {
		RealtimeResponse_usage_output_token_details obj = getOutputTokenDetails();
		node = converttoJson(&obj, "RealtimeResponse_usage_output_token_details", "");
	}
	else {
		
		RealtimeResponse_usage_output_token_details obj = static_cast<RealtimeResponse_usage_output_token_details> (getOutputTokenDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *output_token_detailsKey = "output_token_details";
	json_object_set_member(pJsonObject, output_token_detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
RealtimeResponse_usage::getTotalTokens()
{
	return total_tokens;
}

void
RealtimeResponse_usage::setTotalTokens(int  total_tokens)
{
	this->total_tokens = total_tokens;
}

int
RealtimeResponse_usage::getInputTokens()
{
	return input_tokens;
}

void
RealtimeResponse_usage::setInputTokens(int  input_tokens)
{
	this->input_tokens = input_tokens;
}

int
RealtimeResponse_usage::getOutputTokens()
{
	return output_tokens;
}

void
RealtimeResponse_usage::setOutputTokens(int  output_tokens)
{
	this->output_tokens = output_tokens;
}

RealtimeResponse_usage_input_token_details
RealtimeResponse_usage::getInputTokenDetails()
{
	return input_token_details;
}

void
RealtimeResponse_usage::setInputTokenDetails(RealtimeResponse_usage_input_token_details  input_token_details)
{
	this->input_token_details = input_token_details;
}

RealtimeResponse_usage_output_token_details
RealtimeResponse_usage::getOutputTokenDetails()
{
	return output_token_details;
}

void
RealtimeResponse_usage::setOutputTokenDetails(RealtimeResponse_usage_output_token_details  output_token_details)
{
	this->output_token_details = output_token_details;
}


