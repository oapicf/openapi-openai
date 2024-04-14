#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateCompletionResponse_choices_inner_logprobs.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateCompletionResponse_choices_inner_logprobs::CreateCompletionResponse_choices_inner_logprobs()
{
	//__init();
}

CreateCompletionResponse_choices_inner_logprobs::~CreateCompletionResponse_choices_inner_logprobs()
{
	//__cleanup();
}

void
CreateCompletionResponse_choices_inner_logprobs::__init()
{
	//new std::list()std::list> text_offset;
	//new std::list()std::list> token_logprobs;
	//new std::list()std::list> tokens;
	//new std::list()std::list> top_logprobs;
}

void
CreateCompletionResponse_choices_inner_logprobs::__cleanup()
{
	//if(text_offset != NULL) {
	//text_offset.RemoveAll(true);
	//delete text_offset;
	//text_offset = NULL;
	//}
	//if(token_logprobs != NULL) {
	//token_logprobs.RemoveAll(true);
	//delete token_logprobs;
	//token_logprobs = NULL;
	//}
	//if(tokens != NULL) {
	//tokens.RemoveAll(true);
	//delete tokens;
	//tokens = NULL;
	//}
	//if(top_logprobs != NULL) {
	//top_logprobs.RemoveAll(true);
	//delete top_logprobs;
	//top_logprobs = NULL;
	//}
	//
}

void
CreateCompletionResponse_choices_inner_logprobs::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *text_offsetKey = "text_offset";
	node = json_object_get_member(pJsonObject, text_offsetKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			text_offset = new_list;
		}
		
	}
	const gchar *token_logprobsKey = "token_logprobs";
	node = json_object_get_member(pJsonObject, token_logprobsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			token_logprobs = new_list;
		}
		
	}
	const gchar *tokensKey = "tokens";
	node = json_object_get_member(pJsonObject, tokensKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			tokens = new_list;
		}
		
	}
	const gchar *top_logprobsKey = "top_logprobs";
	node = json_object_get_member(pJsonObject, top_logprobsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::map> new_list;
			std::map inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::map")) {
					jsonToValue(&inst, temp_json, "std::map", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			top_logprobs = new_list;
		}
		
	}
}

CreateCompletionResponse_choices_inner_logprobs::CreateCompletionResponse_choices_inner_logprobs(char* json)
{
	this->fromJson(json);
}

char*
CreateCompletionResponse_choices_inner_logprobs::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getTextOffset());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getTextOffset());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *text_offsetKey = "text_offset";
	json_object_set_member(pJsonObject, text_offsetKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getTokenLogprobs());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getTokenLogprobs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<long long>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			long long obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *token_logprobsKey = "token_logprobs";
	json_object_set_member(pJsonObject, token_logprobsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getTokens());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getTokens());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *tokensKey = "tokens";
	json_object_set_member(pJsonObject, tokensKey, node);
	if (isprimitive("std::map")) {
		list<std::map> new_list = static_cast<list <std::map> > (getTopLogprobs());
		node = converttoJson(&new_list, "std::map", "array");
	} else {
		node = json_node_alloc();
		list<std::map> new_list = static_cast<list <std::map> > (getTopLogprobs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<std::map>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			std::map obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *top_logprobsKey = "top_logprobs";
	json_object_set_member(pJsonObject, top_logprobsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<int>
CreateCompletionResponse_choices_inner_logprobs::getTextOffset()
{
	return text_offset;
}

void
CreateCompletionResponse_choices_inner_logprobs::setTextOffset(std::list <int> text_offset)
{
	this->text_offset = text_offset;
}

std::list<long long>
CreateCompletionResponse_choices_inner_logprobs::getTokenLogprobs()
{
	return token_logprobs;
}

void
CreateCompletionResponse_choices_inner_logprobs::setTokenLogprobs(std::list <long long> token_logprobs)
{
	this->token_logprobs = token_logprobs;
}

std::list<std::string>
CreateCompletionResponse_choices_inner_logprobs::getTokens()
{
	return tokens;
}

void
CreateCompletionResponse_choices_inner_logprobs::setTokens(std::list <std::string> tokens)
{
	this->tokens = tokens;
}

std::list<std::map>
CreateCompletionResponse_choices_inner_logprobs::getTopLogprobs()
{
	return top_logprobs;
}

void
CreateCompletionResponse_choices_inner_logprobs::setTopLogprobs(std::list <std::map> top_logprobs)
{
	this->top_logprobs = top_logprobs;
}


