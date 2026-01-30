#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "AuditLogsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


AuditLogsManager::AuditLogsManager()
{

}

AuditLogsManager::~AuditLogsManager()
{

}

static gboolean __AuditLogsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __AuditLogsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__AuditLogsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool listAuditLogsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListAuditLogsResponse, Error, void* )
	= reinterpret_cast<void(*)(ListAuditLogsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListAuditLogsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListAuditLogsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListAuditLogsResponse", "ListAuditLogsResponse");
			json_node_free(pJson);

			if ("ListAuditLogsResponse" == "std::string") {
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

static bool listAuditLogsHelper(char * accessToken,
	List_audit_logs_effective_at_parameter effectiveAt, std::list<std::string> projectIdsLeft_Square_BracketRight_Square_Bracket, std::list<AuditLogEventType> eventTypesLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorIdsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorEmailsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> resourceIdsLeft_Square_BracketRight_Square_Bracket, int limit, std::string after, std::string before, 
	void(* handler)(ListAuditLogsResponse, Error, void* )
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
	

	itemAtq = stringify(&effectiveAt, "List_audit_logs_effective_at_parameter");
	queryParams.insert(pair<string, string>("effective_at", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("effective_at");
	}

	for (std::list
	<std::string>::iterator queryIter = projectIdsLeft_Square_BracketRight_Square_Bracket.begin(); queryIter != projectIdsLeft_Square_BracketRight_Square_Bracket.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIdsLeft_Square_BracketRight_Square_Bracket", itemAt));
	}
	
	for (std::list
	<AuditLogEventType>::iterator queryIter = eventTypesLeft_Square_BracketRight_Square_Bracket.begin(); queryIter != eventTypesLeft_Square_BracketRight_Square_Bracket.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "AuditLogEventType");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("eventTypesLeft_Square_BracketRight_Square_Bracket", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = actorIdsLeft_Square_BracketRight_Square_Bracket.begin(); queryIter != actorIdsLeft_Square_BracketRight_Square_Bracket.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("actorIdsLeft_Square_BracketRight_Square_Bracket", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = actorEmailsLeft_Square_BracketRight_Square_Bracket.begin(); queryIter != actorEmailsLeft_Square_BracketRight_Square_Bracket.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("actorEmailsLeft_Square_BracketRight_Square_Bracket", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = resourceIdsLeft_Square_BracketRight_Square_Bracket.begin(); queryIter != resourceIdsLeft_Square_BracketRight_Square_Bracket.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("resourceIdsLeft_Square_BracketRight_Square_Bracket", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&after, "std::string");
	queryParams.insert(pair<string, string>("after", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("after");
	}


	itemAtq = stringify(&before, "std::string");
	queryParams.insert(pair<string, string>("before", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("before");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/audit_logs");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AuditLogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listAuditLogsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AuditLogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listAuditLogsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AuditLogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AuditLogsManager::listAuditLogsAsync(char * accessToken,
	List_audit_logs_effective_at_parameter effectiveAt, std::list<std::string> projectIdsLeft_Square_BracketRight_Square_Bracket, std::list<AuditLogEventType> eventTypesLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorIdsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorEmailsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> resourceIdsLeft_Square_BracketRight_Square_Bracket, int limit, std::string after, std::string before, 
	void(* handler)(ListAuditLogsResponse, Error, void* )
	, void* userData)
{
	return listAuditLogsHelper(accessToken,
	effectiveAt, projectIdsLeft_Square_BracketRight_Square_Bracket, eventTypesLeft_Square_BracketRight_Square_Bracket, actorIdsLeft_Square_BracketRight_Square_Bracket, actorEmailsLeft_Square_BracketRight_Square_Bracket, resourceIdsLeft_Square_BracketRight_Square_Bracket, limit, after, before, 
	handler, userData, true);
}

bool AuditLogsManager::listAuditLogsSync(char * accessToken,
	List_audit_logs_effective_at_parameter effectiveAt, std::list<std::string> projectIdsLeft_Square_BracketRight_Square_Bracket, std::list<AuditLogEventType> eventTypesLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorIdsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorEmailsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> resourceIdsLeft_Square_BracketRight_Square_Bracket, int limit, std::string after, std::string before, 
	void(* handler)(ListAuditLogsResponse, Error, void* )
	, void* userData)
{
	return listAuditLogsHelper(accessToken,
	effectiveAt, projectIdsLeft_Square_BracketRight_Square_Bracket, eventTypesLeft_Square_BracketRight_Square_Bracket, actorIdsLeft_Square_BracketRight_Square_Bracket, actorEmailsLeft_Square_BracketRight_Square_Bracket, resourceIdsLeft_Square_BracketRight_Square_Bracket, limit, after, before, 
	handler, userData, false);
}

