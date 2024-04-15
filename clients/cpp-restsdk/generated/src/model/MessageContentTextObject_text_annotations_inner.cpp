/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/MessageContentTextObject_text_annotations_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



MessageContentTextObject_text_annotations_inner::MessageContentTextObject_text_annotations_inner()
{
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Text = utility::conversions::to_string_t("");
    m_TextIsSet = false;
    m_File_citationIsSet = false;
    m_Start_index = 0;
    m_Start_indexIsSet = false;
    m_End_index = 0;
    m_End_indexIsSet = false;
    m_File_pathIsSet = false;
}

MessageContentTextObject_text_annotations_inner::~MessageContentTextObject_text_annotations_inner()
{
}

void MessageContentTextObject_text_annotations_inner::validate()
{
    // TODO: implement validation
}

web::json::value MessageContentTextObject_text_annotations_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_TextIsSet)
    {
        val[utility::conversions::to_string_t(U("text"))] = ModelBase::toJson(m_Text);
    }
    if(m_File_citationIsSet)
    {
        val[utility::conversions::to_string_t(U("file_citation"))] = ModelBase::toJson(m_File_citation);
    }
    if(m_Start_indexIsSet)
    {
        val[utility::conversions::to_string_t(U("start_index"))] = ModelBase::toJson(m_Start_index);
    }
    if(m_End_indexIsSet)
    {
        val[utility::conversions::to_string_t(U("end_index"))] = ModelBase::toJson(m_End_index);
    }
    if(m_File_pathIsSet)
    {
        val[utility::conversions::to_string_t(U("file_path"))] = ModelBase::toJson(m_File_path);
    }

    return val;
}

bool MessageContentTextObject_text_annotations_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("text"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("text")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setText;
            ok &= ModelBase::fromJson(fieldValue, refVal_setText);
            setText(refVal_setText);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("file_citation"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("file_citation")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<MessageContentTextAnnotationsFileCitationObject_file_citation> refVal_setFileCitation;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFileCitation);
            setFileCitation(refVal_setFileCitation);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("start_index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("start_index")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setStartIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStartIndex);
            setStartIndex(refVal_setStartIndex);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("end_index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("end_index")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setEndIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEndIndex);
            setEndIndex(refVal_setEndIndex);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("file_path"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("file_path")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<MessageContentTextAnnotationsFilePathObject_file_path> refVal_setFilePath;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFilePath);
            setFilePath(refVal_setFilePath);
        }
    }
    return ok;
}

void MessageContentTextObject_text_annotations_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_TextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("text")), m_Text));
    }
    if(m_File_citationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("file_citation")), m_File_citation));
    }
    if(m_Start_indexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("start_index")), m_Start_index));
    }
    if(m_End_indexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("end_index")), m_End_index));
    }
    if(m_File_pathIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("file_path")), m_File_path));
    }
}

bool MessageContentTextObject_text_annotations_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("text"))))
    {
        utility::string_t refVal_setText;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("text"))), refVal_setText );
        setText(refVal_setText);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("file_citation"))))
    {
        std::shared_ptr<MessageContentTextAnnotationsFileCitationObject_file_citation> refVal_setFileCitation;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("file_citation"))), refVal_setFileCitation );
        setFileCitation(refVal_setFileCitation);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("start_index"))))
    {
        int32_t refVal_setStartIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("start_index"))), refVal_setStartIndex );
        setStartIndex(refVal_setStartIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("end_index"))))
    {
        int32_t refVal_setEndIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("end_index"))), refVal_setEndIndex );
        setEndIndex(refVal_setEndIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("file_path"))))
    {
        std::shared_ptr<MessageContentTextAnnotationsFilePathObject_file_path> refVal_setFilePath;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("file_path"))), refVal_setFilePath );
        setFilePath(refVal_setFilePath);
    }
    return ok;
}

utility::string_t MessageContentTextObject_text_annotations_inner::getType() const
{
    return m_Type;
}

void MessageContentTextObject_text_annotations_inner::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool MessageContentTextObject_text_annotations_inner::typeIsSet() const
{
    return m_TypeIsSet;
}

void MessageContentTextObject_text_annotations_inner::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t MessageContentTextObject_text_annotations_inner::getText() const
{
    return m_Text;
}

void MessageContentTextObject_text_annotations_inner::setText(const utility::string_t& value)
{
    m_Text = value;
    m_TextIsSet = true;
}

bool MessageContentTextObject_text_annotations_inner::textIsSet() const
{
    return m_TextIsSet;
}

void MessageContentTextObject_text_annotations_inner::unsetText()
{
    m_TextIsSet = false;
}
std::shared_ptr<MessageContentTextAnnotationsFileCitationObject_file_citation> MessageContentTextObject_text_annotations_inner::getFileCitation() const
{
    return m_File_citation;
}

void MessageContentTextObject_text_annotations_inner::setFileCitation(const std::shared_ptr<MessageContentTextAnnotationsFileCitationObject_file_citation>& value)
{
    m_File_citation = value;
    m_File_citationIsSet = true;
}

bool MessageContentTextObject_text_annotations_inner::fileCitationIsSet() const
{
    return m_File_citationIsSet;
}

void MessageContentTextObject_text_annotations_inner::unsetFile_citation()
{
    m_File_citationIsSet = false;
}
int32_t MessageContentTextObject_text_annotations_inner::getStartIndex() const
{
    return m_Start_index;
}

void MessageContentTextObject_text_annotations_inner::setStartIndex(int32_t value)
{
    m_Start_index = value;
    m_Start_indexIsSet = true;
}

bool MessageContentTextObject_text_annotations_inner::startIndexIsSet() const
{
    return m_Start_indexIsSet;
}

void MessageContentTextObject_text_annotations_inner::unsetStart_index()
{
    m_Start_indexIsSet = false;
}
int32_t MessageContentTextObject_text_annotations_inner::getEndIndex() const
{
    return m_End_index;
}

void MessageContentTextObject_text_annotations_inner::setEndIndex(int32_t value)
{
    m_End_index = value;
    m_End_indexIsSet = true;
}

bool MessageContentTextObject_text_annotations_inner::endIndexIsSet() const
{
    return m_End_indexIsSet;
}

void MessageContentTextObject_text_annotations_inner::unsetEnd_index()
{
    m_End_indexIsSet = false;
}
std::shared_ptr<MessageContentTextAnnotationsFilePathObject_file_path> MessageContentTextObject_text_annotations_inner::getFilePath() const
{
    return m_File_path;
}

void MessageContentTextObject_text_annotations_inner::setFilePath(const std::shared_ptr<MessageContentTextAnnotationsFilePathObject_file_path>& value)
{
    m_File_path = value;
    m_File_pathIsSet = true;
}

bool MessageContentTextObject_text_annotations_inner::filePathIsSet() const
{
    return m_File_pathIsSet;
}

void MessageContentTextObject_text_annotations_inner::unsetFile_path()
{
    m_File_pathIsSet = false;
}
}
}
}
}

