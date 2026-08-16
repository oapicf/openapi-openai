

#include "RealtimeResponseCreateParams_conversation.h"

using namespace Tiny;

RealtimeResponseCreateParams_conversation::RealtimeResponseCreateParams_conversation()
{
}

RealtimeResponseCreateParams_conversation::RealtimeResponseCreateParams_conversation(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeResponseCreateParams_conversation::~RealtimeResponseCreateParams_conversation()
{

}

void
RealtimeResponseCreateParams_conversation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
RealtimeResponseCreateParams_conversation::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



