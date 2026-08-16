

#include "MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.h"

using namespace Tiny;

MessageDeltaContentTextAnnotationsFileCitationObject_file_citation::MessageDeltaContentTextAnnotationsFileCitationObject_file_citation()
{
	file_id = std::string();
	quote = std::string();
}

MessageDeltaContentTextAnnotationsFileCitationObject_file_citation::MessageDeltaContentTextAnnotationsFileCitationObject_file_citation(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentTextAnnotationsFileCitationObject_file_citation::~MessageDeltaContentTextAnnotationsFileCitationObject_file_citation()
{

}

void
MessageDeltaContentTextAnnotationsFileCitationObject_file_citation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *file_idKey = "file_id";

    if(object.has_key(file_idKey))
    {
        bourne::json value = object[file_idKey];



        jsonToValue(&file_id, value, "std::string");


    }

    const char *quoteKey = "quote";

    if(object.has_key(quoteKey))
    {
        bourne::json value = object[quoteKey];



        jsonToValue(&quote, value, "std::string");


    }


}

bourne::json
MessageDeltaContentTextAnnotationsFileCitationObject_file_citation::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();






    object["quote"] = getQuote();



    return object;

}

std::string
MessageDeltaContentTextAnnotationsFileCitationObject_file_citation::getFileId()
{
	return file_id;
}

void
MessageDeltaContentTextAnnotationsFileCitationObject_file_citation::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}

std::string
MessageDeltaContentTextAnnotationsFileCitationObject_file_citation::getQuote()
{
	return quote;
}

void
MessageDeltaContentTextAnnotationsFileCitationObject_file_citation::setQuote(std::string  quote)
{
	this->quote = quote;
}



