

#include "CreateTranslation_200_response.h"

using namespace Tiny;

CreateTranslation_200_response::CreateTranslation_200_response()
{
	text = std::string();
	language = std::string();
	duration = std::string();
	segments = std::list<TranscriptionSegment>();
}

CreateTranslation_200_response::CreateTranslation_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateTranslation_200_response::~CreateTranslation_200_response()
{

}

void
CreateTranslation_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];



        jsonToValue(&language, value, "std::string");


    }

    const char *durationKey = "duration";

    if(object.has_key(durationKey))
    {
        bourne::json value = object[durationKey];



        jsonToValue(&duration, value, "std::string");


    }

    const char *segmentsKey = "segments";

    if(object.has_key(segmentsKey))
    {
        bourne::json value = object[segmentsKey];


        std::list<TranscriptionSegment> segments_list;
        TranscriptionSegment element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            segments_list.push_back(element);
        }
        segments = segments_list;


    }


}

bourne::json
CreateTranslation_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["text"] = getText();






    object["language"] = getLanguage();






    object["duration"] = getDuration();





    std::list<TranscriptionSegment> segments_list = getSegments();
    bourne::json segments_arr = bourne::json::array();

    for(auto& var : segments_list)
    {
        TranscriptionSegment obj = var;
        segments_arr.append(obj.toJson());
    }
    object["segments"] = segments_arr;




    return object;

}

std::string
CreateTranslation_200_response::getText()
{
	return text;
}

void
CreateTranslation_200_response::setText(std::string  text)
{
	this->text = text;
}

std::string
CreateTranslation_200_response::getLanguage()
{
	return language;
}

void
CreateTranslation_200_response::setLanguage(std::string  language)
{
	this->language = language;
}

std::string
CreateTranslation_200_response::getDuration()
{
	return duration;
}

void
CreateTranslation_200_response::setDuration(std::string  duration)
{
	this->duration = duration;
}

std::list<TranscriptionSegment>
CreateTranslation_200_response::getSegments()
{
	return segments;
}

void
CreateTranslation_200_response::setSegments(std::list <TranscriptionSegment> segments)
{
	this->segments = segments;
}



