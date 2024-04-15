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
 * MessageContentTextAnnotationsFilePathObject.h
 *
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 */

#ifndef MessageContentTextAnnotationsFilePathObject_H_
#define MessageContentTextAnnotationsFilePathObject_H_


#include <string>
#include "MessageContentTextAnnotationsFilePathObject_file_path.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
/// </summary>
class  MessageContentTextAnnotationsFilePathObject
{
public:
    MessageContentTextAnnotationsFilePathObject();
    virtual ~MessageContentTextAnnotationsFilePathObject() = default;


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

    bool operator==(const MessageContentTextAnnotationsFilePathObject& rhs) const;
    bool operator!=(const MessageContentTextAnnotationsFilePathObject& rhs) const;

    /////////////////////////////////////////////
    /// MessageContentTextAnnotationsFilePathObject members

    /// <summary>
    /// Always &#x60;file_path&#x60;.
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
    org::openapitools::server::model::MessageContentTextAnnotationsFilePathObject_file_path getFilePath() const;
    void setFilePath(org::openapitools::server::model::MessageContentTextAnnotationsFilePathObject_file_path const& value);
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

    friend  void to_json(nlohmann::json& j, const MessageContentTextAnnotationsFilePathObject& o);
    friend  void from_json(const nlohmann::json& j, MessageContentTextAnnotationsFilePathObject& o);
protected:
    std::string m_Type;

    std::string m_Text;

    org::openapitools::server::model::MessageContentTextAnnotationsFilePathObject_file_path m_File_path;

    int32_t m_Start_index;

    int32_t m_End_index;

    
};

} // namespace org::openapitools::server::model

#endif /* MessageContentTextAnnotationsFilePathObject_H_ */