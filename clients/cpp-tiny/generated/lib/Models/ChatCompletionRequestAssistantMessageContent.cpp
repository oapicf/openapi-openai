

#include "ChatCompletionRequestAssistantMessage_content.h"

using namespace Tiny;

ChatCompletionRequestAssistantMessage_content::ChatCompletionRequestAssistantMessage_content()
{
}

ChatCompletionRequestAssistantMessage_content::ChatCompletionRequestAssistantMessage_content(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestAssistantMessage_content::~ChatCompletionRequestAssistantMessage_content()
{

}

void
ChatCompletionRequestAssistantMessage_content::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChatCompletionRequestAssistantMessage_content::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



