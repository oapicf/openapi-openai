#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionTokenLogprob.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionTokenLogprob::ChatCompletionTokenLogprob()
{
	//__init();
}

ChatCompletionTokenLogprob::~ChatCompletionTokenLogprob()
{
	//__cleanup();
}

void
ChatCompletionTokenLogprob::__init()
{
	//token = std::string();
	//logprob = double(0);
	//new std::list()std::list> bytes;
	//new std::list()std::list> top_logprobs;
}

void
ChatCompletionTokenLogprob::__cleanup()
{
	//if(token != NULL) {
	//
	//delete token;
	//token = NULL;
	//}
	//if(logprob != NULL) {
	//
	//delete logprob;
	//logprob = NULL;
	//}
	//if(bytes != NULL) {
	//bytes.RemoveAll(true);
	//delete bytes;
	//bytes = NULL;
	//}
	//if(top_logprobs != NULL) {
	//top_logprobs.RemoveAll(true);
	//delete top_logprobs;
	//top_logprobs = NULL;
	//}
	//
}

void
ChatCompletionTokenLogprob::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tokenKey = "token";
	node = json_object_get_member(pJsonObject, tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&token, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *logprobKey = "logprob";
	node = json_object_get_member(pJsonObject, logprobKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&logprob, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&logprob);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bytesKey = "bytes";
	node = json_object_get_member(pJsonObject, bytesKey);
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
			bytes = new_list;
		}
		
	}
	const gchar *top_logprobsKey = "top_logprobs";
	node = json_object_get_member(pJsonObject, top_logprobsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionTokenLogprob_top_logprobs_inner> new_list;
			ChatCompletionTokenLogprob_top_logprobs_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionTokenLogprob_top_logprobs_inner")) {
					jsonToValue(&inst, temp_json, "ChatCompletionTokenLogprob_top_logprobs_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			top_logprobs = new_list;
		}
		
	}
}

ChatCompletionTokenLogprob::ChatCompletionTokenLogprob(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionTokenLogprob::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tokenKey = "token";
	json_object_set_member(pJsonObject, tokenKey, node);
	if (isprimitive("long long")) {
		long long obj = getLogprob();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLogprob());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logprobKey = "logprob";
	json_object_set_member(pJsonObject, logprobKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getBytes());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getBytes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *bytesKey = "bytes";
	json_object_set_member(pJsonObject, bytesKey, node);
	if (isprimitive("ChatCompletionTokenLogprob_top_logprobs_inner")) {
		list<ChatCompletionTokenLogprob_top_logprobs_inner> new_list = static_cast<list <ChatCompletionTokenLogprob_top_logprobs_inner> > (getTopLogprobs());
		node = converttoJson(&new_list, "ChatCompletionTokenLogprob_top_logprobs_inner", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionTokenLogprob_top_logprobs_inner> new_list = static_cast<list <ChatCompletionTokenLogprob_top_logprobs_inner> > (getTopLogprobs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionTokenLogprob_top_logprobs_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionTokenLogprob_top_logprobs_inner obj = *it;
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

std::string
ChatCompletionTokenLogprob::getToken()
{
	return token;
}

void
ChatCompletionTokenLogprob::setToken(std::string  token)
{
	this->token = token;
}

long long
ChatCompletionTokenLogprob::getLogprob()
{
	return logprob;
}

void
ChatCompletionTokenLogprob::setLogprob(long long  logprob)
{
	this->logprob = logprob;
}

std::list<int>
ChatCompletionTokenLogprob::getBytes()
{
	return bytes;
}

void
ChatCompletionTokenLogprob::setBytes(std::list <int> bytes)
{
	this->bytes = bytes;
}

std::list<ChatCompletionTokenLogprob_top_logprobs_inner>
ChatCompletionTokenLogprob::getTopLogprobs()
{
	return top_logprobs;
}

void
ChatCompletionTokenLogprob::setTopLogprobs(std::list <ChatCompletionTokenLogprob_top_logprobs_inner> top_logprobs)
{
	this->top_logprobs = top_logprobs;
}


