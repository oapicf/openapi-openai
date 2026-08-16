

#include "CreateChatCompletionRequest_model.h"

using namespace Tiny;

CreateChatCompletionRequest_model::CreateChatCompletionRequest_model()
{
}

CreateChatCompletionRequest_model::CreateChatCompletionRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionRequest_model::~CreateChatCompletionRequest_model()
{

}

void
CreateChatCompletionRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateChatCompletionRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



