#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionTokenLogprob_top_logprobs_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionTokenLogprob_top_logprobs_inner::ChatCompletionTokenLogprob_top_logprobs_inner()
{
	//__init();
}

ChatCompletionTokenLogprob_top_logprobs_inner::~ChatCompletionTokenLogprob_top_logprobs_inner()
{
	//__cleanup();
}

void
ChatCompletionTokenLogprob_top_logprobs_inner::__init()
{
	//token = std::string();
	//logprob = double(0);
	//new std::list()std::list> bytes;
}

void
ChatCompletionTokenLogprob_top_logprobs_inner::__cleanup()
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
	//
}

void
ChatCompletionTokenLogprob_top_logprobs_inner::fromJson(char* jsonStr)
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
}

ChatCompletionTokenLogprob_top_logprobs_inner::ChatCompletionTokenLogprob_top_logprobs_inner(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionTokenLogprob_top_logprobs_inner::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionTokenLogprob_top_logprobs_inner::getToken()
{
	return token;
}

void
ChatCompletionTokenLogprob_top_logprobs_inner::setToken(std::string  token)
{
	this->token = token;
}

long long
ChatCompletionTokenLogprob_top_logprobs_inner::getLogprob()
{
	return logprob;
}

void
ChatCompletionTokenLogprob_top_logprobs_inner::setLogprob(long long  logprob)
{
	this->logprob = logprob;
}

std::list<int>
ChatCompletionTokenLogprob_top_logprobs_inner::getBytes()
{
	return bytes;
}

void
ChatCompletionTokenLogprob_top_logprobs_inner::setBytes(std::list <int> bytes)
{
	this->bytes = bytes;
}


