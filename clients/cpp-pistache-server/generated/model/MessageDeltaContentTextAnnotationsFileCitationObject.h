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
 * MessageDeltaContentTextAnnotationsFileCitationObject.h
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
 */

#ifndef MessageDeltaContentTextAnnotationsFileCitationObject_H_
#define MessageDeltaContentTextAnnotationsFileCitationObject_H_


#include <string>
#include "MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
/// </summary>
class  MessageDeltaContentTextAnnotationsFileCitationObject
{
public:
    MessageDeltaContentTextAnnotationsFileCitationObject();
    virtual ~MessageDeltaContentTextAnnotationsFileCitationObject() = default;


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

    bool operator==(const MessageDeltaContentTextAnnotationsFileCitationObject& rhs) const;
    bool operator!=(const MessageDeltaContentTextAnnotationsFileCitationObject& rhs) const;

    /////////////////////////////////////////////
    /// MessageDeltaContentTextAnnotationsFileCitationObject members

    /// <summary>
    /// The index of the annotation in the text content part.
    /// </summary>
    int32_t getIndex() const;
    void setIndex(int32_t const value);
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
    bool textIsSet() const;
    void unsetText();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::MessageDeltaContentTextAnnotationsFileCitationObject_file_citation getFileCitation() const;
    void setFileCitation(org::openapitools::server::model::MessageDeltaContentTextAnnotationsFileCitationObject_file_citation const& value);
    bool fileCitationIsSet() const;
    void unsetFile_citation();
    /// <summary>
    /// 
    /// </summary>
    int32_t getStartIndex() const;
    void setStartIndex(int32_t const value);
    bool startIndexIsSet() const;
    void unsetStart_index();
    /// <summary>
    /// 
    /// </summary>
    int32_t getEndIndex() const;
    void setEndIndex(int32_t const value);
    bool endIndexIsSet() const;
    void unsetEnd_index();

    friend  void to_json(nlohmann::json& j, const MessageDeltaContentTextAnnotationsFileCitationObject& o);
    friend  void from_json(const nlohmann::json& j, MessageDeltaContentTextAnnotationsFileCitationObject& o);
protected:
    int32_t m_Index;

    std::string m_Type;

    std::string m_Text;
    bool m_TextIsSet;
    org::openapitools::server::model::MessageDeltaContentTextAnnotationsFileCitationObject_file_citation m_File_citation;
    bool m_File_citationIsSet;
    int32_t m_Start_index;
    bool m_Start_indexIsSet;
    int32_t m_End_index;
    bool m_End_indexIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* MessageDeltaContentTextAnnotationsFileCitationObject_H_ */
