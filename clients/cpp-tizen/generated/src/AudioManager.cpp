#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "AudioManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


AudioManager::AudioManager()
{

}

AudioManager::~AudioManager()
{

}

static gboolean __AudioManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __AudioManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__AudioManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool createSpeechProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool createSpeechHelper(char * accessToken,
	std::shared_ptr<CreateSpeechRequest> createSpeechRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("CreateSpeechRequest")) {
		node = converttoJson(&createSpeechRequest, "CreateSpeechRequest", "");
	}
	
	char *jsonStr =  createSpeechRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/audio/speech");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AudioManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createSpeechProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (AudioManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createSpeechProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudioManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudioManager::createSpeechAsync(char * accessToken,
	std::shared_ptr<CreateSpeechRequest> createSpeechRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return createSpeechHelper(accessToken,
	createSpeechRequest, 
	handler, userData, true);
}

bool AudioManager::createSpeechSync(char * accessToken,
	std::shared_ptr<CreateSpeechRequest> createSpeechRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return createSpeechHelper(accessToken,
	createSpeechRequest, 
	handler, userData, false);
}

static bool createTranscriptionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateTranscription_200_response, Error, void* )
	= reinterpret_cast<void(*)(CreateTranscription_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateTranscription_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateTranscription_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateTranscription_200_response", "CreateTranscription_200_response");
			json_node_free(pJson);

			if ("CreateTranscription_200_response" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool createTranscriptionHelper(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string language, std::string prompt, AudioResponseFormat responseFormat, long long temperature, std::list<std::string> timestampGranularitiesLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(CreateTranscription_200_response, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/audio/transcriptions");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AudioManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createTranscriptionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (AudioManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createTranscriptionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudioManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudioManager::createTranscriptionAsync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string language, std::string prompt, AudioResponseFormat responseFormat, long long temperature, std::list<std::string> timestampGranularitiesLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(CreateTranscription_200_response, Error, void* )
	, void* userData)
{
	return createTranscriptionHelper(accessToken,
	file, model, language, prompt, responseFormat, temperature, timestampGranularitiesLeft_Square_BracketRight_Square_Bracket, 
	handler, userData, true);
}

bool AudioManager::createTranscriptionSync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string language, std::string prompt, AudioResponseFormat responseFormat, long long temperature, std::list<std::string> timestampGranularitiesLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(CreateTranscription_200_response, Error, void* )
	, void* userData)
{
	return createTranscriptionHelper(accessToken,
	file, model, language, prompt, responseFormat, temperature, timestampGranularitiesLeft_Square_BracketRight_Square_Bracket, 
	handler, userData, false);
}

static bool createTranslationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateTranslation_200_response, Error, void* )
	= reinterpret_cast<void(*)(CreateTranslation_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateTranslation_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateTranslation_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateTranslation_200_response", "CreateTranslation_200_response");
			json_node_free(pJson);

			if ("CreateTranslation_200_response" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool createTranslationHelper(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, AudioResponseFormat responseFormat, long long temperature, 
	void(* handler)(CreateTranslation_200_response, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/audio/translations");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AudioManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createTranslationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (AudioManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createTranslationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudioManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudioManager::createTranslationAsync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, AudioResponseFormat responseFormat, long long temperature, 
	void(* handler)(CreateTranslation_200_response, Error, void* )
	, void* userData)
{
	return createTranslationHelper(accessToken,
	file, model, prompt, responseFormat, temperature, 
	handler, userData, true);
}

bool AudioManager::createTranslationSync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, AudioResponseFormat responseFormat, long long temperature, 
	void(* handler)(CreateTranslation_200_response, Error, void* )
	, void* userData)
{
	return createTranslationHelper(accessToken,
	file, model, prompt, responseFormat, temperature, 
	handler, userData, false);
}

