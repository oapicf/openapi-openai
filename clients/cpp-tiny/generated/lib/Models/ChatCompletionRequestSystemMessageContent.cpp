

#include "ChatCompletionRequestSystemMessage_content.h"

using namespace Tiny;

ChatCompletionRequestSystemMessage_content::ChatCompletionRequestSystemMessage_content()
{
}

ChatCompletionRequestSystemMessage_content::ChatCompletionRequestSystemMessage_content(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestSystemMessage_content::~ChatCompletionRequestSystemMessage_content()
{

}

void
ChatCompletionRequestSystemMessage_content::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChatCompletionRequestSystemMessage_content::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



