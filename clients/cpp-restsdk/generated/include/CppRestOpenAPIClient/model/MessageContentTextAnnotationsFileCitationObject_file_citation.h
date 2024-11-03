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

/*
 * MessageContentTextAnnotationsFileCitationObject_file_citation.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MessageContentTextAnnotationsFileCitationObject_file_citation_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MessageContentTextAnnotationsFileCitationObject_file_citation_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  MessageContentTextAnnotationsFileCitationObject_file_citation
    : public ModelBase
{
public:
    MessageContentTextAnnotationsFileCitationObject_file_citation();
    virtual ~MessageContentTextAnnotationsFileCitationObject_file_citation();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MessageContentTextAnnotationsFileCitationObject_file_citation members

    /// <summary>
    /// The ID of the specific File the citation is from.
    /// </summary>
    utility::string_t getFileId() const;
    bool fileIdIsSet() const;
    void unsetFile_id();

    void setFileId(const utility::string_t& value);

    /// <summary>
    /// The specific quote in the file.
    /// </summary>
    utility::string_t getQuote() const;
    bool quoteIsSet() const;
    void unsetQuote();

    void setQuote(const utility::string_t& value);


protected:
    utility::string_t m_File_id;
    bool m_File_idIsSet;
    utility::string_t m_Quote;
    bool m_QuoteIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MessageContentTextAnnotationsFileCitationObject_file_citation_H_ */
