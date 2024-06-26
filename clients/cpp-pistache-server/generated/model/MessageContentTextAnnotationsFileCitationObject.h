/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * MessageContentTextAnnotationsFileCitationObject.h
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
 */

#ifndef MessageContentTextAnnotationsFileCitationObject_H_
#define MessageContentTextAnnotationsFileCitationObject_H_


#include <string>
#include "MessageContentTextAnnotationsFileCitationObject_file_citation.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
/// </summary>
class  MessageContentTextAnnotationsFileCitationObject
{
public:
    MessageContentTextAnnotationsFileCitationObject();
    virtual ~MessageContentTextAnnotationsFileCitationObject() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const MessageContentTextAnnotationsFileCitationObject& rhs) const;
    bool operator!=(const MessageContentTextAnnotationsFileCitationObject& rhs) const;

    /////////////////////////////////////////////
    /// MessageContentTextAnnotationsFileCitationObject members

    /// <summary>
    /// Always &#x60;file_citation&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    /// <summary>
    /// The text in the message content that needs to be replaced.
    /// </summary>
    std::string getText() const;
    void setText(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::MessageContentTextAnnotationsFileCitationObject_file_citation getFileCitation() const;
    void setFileCitation(org::openapitools::server::model::MessageContentTextAnnotationsFileCitationObject_file_citation const& value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getStartIndex() const;
    void setStartIndex(int32_t const value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getEndIndex() const;
    void setEndIndex(int32_t const value);

    friend  void to_json(nlohmann::json& j, const MessageContentTextAnnotationsFileCitationObject& o);
    friend  void from_json(const nlohmann::json& j, MessageContentTextAnnotationsFileCitationObject& o);
protected:
    std::string m_Type;

    std::string m_Text;

    org::openapitools::server::model::MessageContentTextAnnotationsFileCitationObject_file_citation m_File_citation;

    int32_t m_Start_index;

    int32_t m_End_index;

    
};

} // namespace org::openapitools::server::model

#endif /* MessageContentTextAnnotationsFileCitationObject_H_ */
