/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/MessageContentTextAnnotationsFileCitationObject_file_citation.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



MessageContentTextAnnotationsFileCitationObject_file_citation::MessageContentTextAnnotationsFileCitationObject_file_citation()
{
    m_File_id = utility::conversions::to_string_t("");
    m_File_idIsSet = false;
    m_Quote = utility::conversions::to_string_t("");
    m_QuoteIsSet = false;
}

MessageContentTextAnnotationsFileCitationObject_file_citation::~MessageContentTextAnnotationsFileCitationObject_file_citation()
{
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::validate()
{
    // TODO: implement validation
}

web::json::value MessageContentTextAnnotationsFileCitationObject_file_citation::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_File_idIsSet)
    {
        val[utility::conversions::to_string_t(U("file_id"))] = ModelBase::toJson(m_File_id);
    }
    if(m_QuoteIsSet)
    {
        val[utility::conversions::to_string_t(U("quote"))] = ModelBase::toJson(m_Quote);
    }

    return val;
}

bool MessageContentTextAnnotationsFileCitationObject_file_citation::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("file_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("file_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFileId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFileId);
            setFileId(refVal_setFileId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("quote"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("quote")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setQuote;
            ok &= ModelBase::fromJson(fieldValue, refVal_setQuote);
            setQuote(refVal_setQuote);
        }
    }
    return ok;
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_File_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("file_id")), m_File_id));
    }
    if(m_QuoteIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("quote")), m_Quote));
    }
}

bool MessageContentTextAnnotationsFileCitationObject_file_citation::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("file_id"))))
    {
        utility::string_t refVal_setFileId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("file_id"))), refVal_setFileId );
        setFileId(refVal_setFileId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("quote"))))
    {
        utility::string_t refVal_setQuote;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("quote"))), refVal_setQuote );
        setQuote(refVal_setQuote);
    }
    return ok;
}

utility::string_t MessageContentTextAnnotationsFileCitationObject_file_citation::getFileId() const
{
    return m_File_id;
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::setFileId(const utility::string_t& value)
{
    m_File_id = value;
    m_File_idIsSet = true;
}

bool MessageContentTextAnnotationsFileCitationObject_file_citation::fileIdIsSet() const
{
    return m_File_idIsSet;
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::unsetFile_id()
{
    m_File_idIsSet = false;
}
utility::string_t MessageContentTextAnnotationsFileCitationObject_file_citation::getQuote() const
{
    return m_Quote;
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::setQuote(const utility::string_t& value)
{
    m_Quote = value;
    m_QuoteIsSet = true;
}

bool MessageContentTextAnnotationsFileCitationObject_file_citation::quoteIsSet() const
{
    return m_QuoteIsSet;
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::unsetQuote()
{
    m_QuoteIsSet = false;
}
}
}
}
}


