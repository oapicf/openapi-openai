

#include "CreateChatCompletionRequest_stop.h"

using namespace Tiny;

CreateChatCompletionRequest_stop::CreateChatCompletionRequest_stop()
{
}

CreateChatCompletionRequest_stop::CreateChatCompletionRequest_stop(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionRequest_stop::~CreateChatCompletionRequest_stop()
{

}

void
CreateChatCompletionRequest_stop::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateChatCompletionRequest_stop::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



