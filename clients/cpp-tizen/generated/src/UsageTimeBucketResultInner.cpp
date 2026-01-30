#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UsageTimeBucket_result_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UsageTimeBucket_result_inner::UsageTimeBucket_result_inner()
{
	//__init();
}

UsageTimeBucket_result_inner::~UsageTimeBucket_result_inner()
{
	//__cleanup();
}

void
UsageTimeBucket_result_inner::__init()
{
	//object = std::string();
	//input_tokens = int(0);
	//input_cached_tokens = int(0);
	//output_tokens = int(0);
	//input_audio_tokens = int(0);
	//output_audio_tokens = int(0);
	//num_model_requests = int(0);
	//project_id = std::string();
	//user_id = std::string();
	//api_key_id = std::string();
	//model = std::string();
	//batch = bool(false);
	//images = int(0);
	//source = std::string();
	//size = std::string();
	//characters = int(0);
	//seconds = int(0);
	//usage_bytes = int(0);
	//sessions = int(0);
	//amount = new CostsResult_amount();
	//line_item = std::string();
}

void
UsageTimeBucket_result_inner::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(input_tokens != NULL) {
	//
	//delete input_tokens;
	//input_tokens = NULL;
	//}
	//if(input_cached_tokens != NULL) {
	//
	//delete input_cached_tokens;
	//input_cached_tokens = NULL;
	//}
	//if(output_tokens != NULL) {
	//
	//delete output_tokens;
	//output_tokens = NULL;
	//}
	//if(input_audio_tokens != NULL) {
	//
	//delete input_audio_tokens;
	//input_audio_tokens = NULL;
	//}
	//if(output_audio_tokens != NULL) {
	//
	//delete output_audio_tokens;
	//output_audio_tokens = NULL;
	//}
	//if(num_model_requests != NULL) {
	//
	//delete num_model_requests;
	//num_model_requests = NULL;
	//}
	//if(project_id != NULL) {
	//
	//delete project_id;
	//project_id = NULL;
	//}
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//if(api_key_id != NULL) {
	//
	//delete api_key_id;
	//api_key_id = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(batch != NULL) {
	//
	//delete batch;
	//batch = NULL;
	//}
	//if(images != NULL) {
	//
	//delete images;
	//images = NULL;
	//}
	//if(source != NULL) {
	//
	//delete source;
	//source = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//if(characters != NULL) {
	//
	//delete characters;
	//characters = NULL;
	//}
	//if(seconds != NULL) {
	//
	//delete seconds;
	//seconds = NULL;
	//}
	//if(usage_bytes != NULL) {
	//
	//delete usage_bytes;
	//usage_bytes = NULL;
	//}
	//if(sessions != NULL) {
	//
	//delete sessions;
	//sessions = NULL;
	//}
	//if(amount != NULL) {
	//
	//delete amount;
	//amount = NULL;
	//}
	//if(line_item != NULL) {
	//
	//delete line_item;
	//line_item = NULL;
	//}
	//
}

void
UsageTimeBucket_result_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
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
	const gchar *input_cached_tokensKey = "input_cached_tokens";
	node = json_object_get_member(pJsonObject, input_cached_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&input_cached_tokens, node, "int", "");
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
	const gchar *input_audio_tokensKey = "input_audio_tokens";
	node = json_object_get_member(pJsonObject, input_audio_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&input_audio_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *output_audio_tokensKey = "output_audio_tokens";
	node = json_object_get_member(pJsonObject, output_audio_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&output_audio_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *num_model_requestsKey = "num_model_requests";
	node = json_object_get_member(pJsonObject, num_model_requestsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&num_model_requests, node, "int", "");
		} else {
			
		}
	}
	const gchar *project_idKey = "project_id";
	node = json_object_get_member(pJsonObject, project_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&project_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *api_key_idKey = "api_key_id";
	node = json_object_get_member(pJsonObject, api_key_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&api_key_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&model, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *batchKey = "batch";
	node = json_object_get_member(pJsonObject, batchKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&batch, node, "bool", "");
		} else {
			
		}
	}
	const gchar *imagesKey = "images";
	node = json_object_get_member(pJsonObject, imagesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&images, node, "int", "");
		} else {
			
		}
	}
	const gchar *sourceKey = "source";
	node = json_object_get_member(pJsonObject, sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&size, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *charactersKey = "characters";
	node = json_object_get_member(pJsonObject, charactersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&characters, node, "int", "");
		} else {
			
		}
	}
	const gchar *secondsKey = "seconds";
	node = json_object_get_member(pJsonObject, secondsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&seconds, node, "int", "");
		} else {
			
		}
	}
	const gchar *usage_bytesKey = "usage_bytes";
	node = json_object_get_member(pJsonObject, usage_bytesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&usage_bytes, node, "int", "");
		} else {
			
		}
	}
	const gchar *sessionsKey = "sessions";
	node = json_object_get_member(pJsonObject, sessionsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sessions, node, "int", "");
		} else {
			
		}
	}
	const gchar *amountKey = "amount";
	node = json_object_get_member(pJsonObject, amountKey);
	if (node !=NULL) {
	

		if (isprimitive("CostsResult_amount")) {
			jsonToValue(&amount, node, "CostsResult_amount", "CostsResult_amount");
		} else {
			
			CostsResult_amount* obj = static_cast<CostsResult_amount*> (&amount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *line_itemKey = "line_item";
	node = json_object_get_member(pJsonObject, line_itemKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&line_item, node, "std::string", "");
		} else {
			
		}
	}
}

UsageTimeBucket_result_inner::UsageTimeBucket_result_inner(char* json)
{
	this->fromJson(json);
}

char*
UsageTimeBucket_result_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("int")) {
		int obj = getInputTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *input_tokensKey = "input_tokens";
	json_object_set_member(pJsonObject, input_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getInputCachedTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *input_cached_tokensKey = "input_cached_tokens";
	json_object_set_member(pJsonObject, input_cached_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getOutputTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *output_tokensKey = "output_tokens";
	json_object_set_member(pJsonObject, output_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getInputAudioTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *input_audio_tokensKey = "input_audio_tokens";
	json_object_set_member(pJsonObject, input_audio_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getOutputAudioTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *output_audio_tokensKey = "output_audio_tokens";
	json_object_set_member(pJsonObject, output_audio_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getNumModelRequests();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *num_model_requestsKey = "num_model_requests";
	json_object_set_member(pJsonObject, num_model_requestsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProjectId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *project_idKey = "project_id";
	json_object_set_member(pJsonObject, project_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getApiKeyId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *api_key_idKey = "api_key_id";
	json_object_set_member(pJsonObject, api_key_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("bool")) {
		bool obj = getBatch();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *batchKey = "batch";
	json_object_set_member(pJsonObject, batchKey, node);
	if (isprimitive("int")) {
		int obj = getImages();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *imagesKey = "images";
	json_object_set_member(pJsonObject, imagesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sourceKey = "source";
	json_object_set_member(pJsonObject, sourceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSize();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("int")) {
		int obj = getCharacters();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *charactersKey = "characters";
	json_object_set_member(pJsonObject, charactersKey, node);
	if (isprimitive("int")) {
		int obj = getSeconds();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *secondsKey = "seconds";
	json_object_set_member(pJsonObject, secondsKey, node);
	if (isprimitive("int")) {
		int obj = getUsageBytes();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *usage_bytesKey = "usage_bytes";
	json_object_set_member(pJsonObject, usage_bytesKey, node);
	if (isprimitive("int")) {
		int obj = getSessions();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sessionsKey = "sessions";
	json_object_set_member(pJsonObject, sessionsKey, node);
	if (isprimitive("CostsResult_amount")) {
		CostsResult_amount obj = getAmount();
		node = converttoJson(&obj, "CostsResult_amount", "");
	}
	else {
		
		CostsResult_amount obj = static_cast<CostsResult_amount> (getAmount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *amountKey = "amount";
	json_object_set_member(pJsonObject, amountKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLineItem();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *line_itemKey = "line_item";
	json_object_set_member(pJsonObject, line_itemKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UsageTimeBucket_result_inner::getObject()
{
	return object;
}

void
UsageTimeBucket_result_inner::setObject(std::string  object)
{
	this->object = object;
}

int
UsageTimeBucket_result_inner::getInputTokens()
{
	return input_tokens;
}

void
UsageTimeBucket_result_inner::setInputTokens(int  input_tokens)
{
	this->input_tokens = input_tokens;
}

int
UsageTimeBucket_result_inner::getInputCachedTokens()
{
	return input_cached_tokens;
}

void
UsageTimeBucket_result_inner::setInputCachedTokens(int  input_cached_tokens)
{
	this->input_cached_tokens = input_cached_tokens;
}

int
UsageTimeBucket_result_inner::getOutputTokens()
{
	return output_tokens;
}

void
UsageTimeBucket_result_inner::setOutputTokens(int  output_tokens)
{
	this->output_tokens = output_tokens;
}

int
UsageTimeBucket_result_inner::getInputAudioTokens()
{
	return input_audio_tokens;
}

void
UsageTimeBucket_result_inner::setInputAudioTokens(int  input_audio_tokens)
{
	this->input_audio_tokens = input_audio_tokens;
}

int
UsageTimeBucket_result_inner::getOutputAudioTokens()
{
	return output_audio_tokens;
}

void
UsageTimeBucket_result_inner::setOutputAudioTokens(int  output_audio_tokens)
{
	this->output_audio_tokens = output_audio_tokens;
}

int
UsageTimeBucket_result_inner::getNumModelRequests()
{
	return num_model_requests;
}

void
UsageTimeBucket_result_inner::setNumModelRequests(int  num_model_requests)
{
	this->num_model_requests = num_model_requests;
}

std::string
UsageTimeBucket_result_inner::getProjectId()
{
	return project_id;
}

void
UsageTimeBucket_result_inner::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}

std::string
UsageTimeBucket_result_inner::getUserId()
{
	return user_id;
}

void
UsageTimeBucket_result_inner::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
UsageTimeBucket_result_inner::getApiKeyId()
{
	return api_key_id;
}

void
UsageTimeBucket_result_inner::setApiKeyId(std::string  api_key_id)
{
	this->api_key_id = api_key_id;
}

std::string
UsageTimeBucket_result_inner::getModel()
{
	return model;
}

void
UsageTimeBucket_result_inner::setModel(std::string  model)
{
	this->model = model;
}

bool
UsageTimeBucket_result_inner::getBatch()
{
	return batch;
}

void
UsageTimeBucket_result_inner::setBatch(bool  batch)
{
	this->batch = batch;
}

int
UsageTimeBucket_result_inner::getImages()
{
	return images;
}

void
UsageTimeBucket_result_inner::setImages(int  images)
{
	this->images = images;
}

std::string
UsageTimeBucket_result_inner::getSource()
{
	return source;
}

void
UsageTimeBucket_result_inner::setSource(std::string  source)
{
	this->source = source;
}

std::string
UsageTimeBucket_result_inner::getSize()
{
	return size;
}

void
UsageTimeBucket_result_inner::setSize(std::string  size)
{
	this->size = size;
}

int
UsageTimeBucket_result_inner::getCharacters()
{
	return characters;
}

void
UsageTimeBucket_result_inner::setCharacters(int  characters)
{
	this->characters = characters;
}

int
UsageTimeBucket_result_inner::getSeconds()
{
	return seconds;
}

void
UsageTimeBucket_result_inner::setSeconds(int  seconds)
{
	this->seconds = seconds;
}

int
UsageTimeBucket_result_inner::getUsageBytes()
{
	return usage_bytes;
}

void
UsageTimeBucket_result_inner::setUsageBytes(int  usage_bytes)
{
	this->usage_bytes = usage_bytes;
}

int
UsageTimeBucket_result_inner::getSessions()
{
	return sessions;
}

void
UsageTimeBucket_result_inner::setSessions(int  sessions)
{
	this->sessions = sessions;
}

CostsResult_amount
UsageTimeBucket_result_inner::getAmount()
{
	return amount;
}

void
UsageTimeBucket_result_inner::setAmount(CostsResult_amount  amount)
{
	this->amount = amount;
}

std::string
UsageTimeBucket_result_inner::getLineItem()
{
	return line_item;
}

void
UsageTimeBucket_result_inner::setLineItem(std::string  line_item)
{
	this->line_item = line_item;
}


