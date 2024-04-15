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
 * MessageDeltaContentImageFileObject_image_file.h
 *
 * 
 */

#ifndef MessageDeltaContentImageFileObject_image_file_H_
#define MessageDeltaContentImageFileObject_image_file_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  MessageDeltaContentImageFileObject_image_file
{
public:
    MessageDeltaContentImageFileObject_image_file();
    virtual ~MessageDeltaContentImageFileObject_image_file() = default;


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

    bool operator==(const MessageDeltaContentImageFileObject_image_file& rhs) const;
    bool operator!=(const MessageDeltaContentImageFileObject_image_file& rhs) const;

    /////////////////////////////////////////////
    /// MessageDeltaContentImageFileObject_image_file members

    /// <summary>
    /// The [File](/docs/api-reference/files) ID of the image in the message content.
    /// </summary>
    std::string getFileId() const;
    void setFileId(std::string const& value);
    bool fileIdIsSet() const;
    void unsetFile_id();

    friend  void to_json(nlohmann::json& j, const MessageDeltaContentImageFileObject_image_file& o);
    friend  void from_json(const nlohmann::json& j, MessageDeltaContentImageFileObject_image_file& o);
protected:
    std::string m_File_id;
    bool m_File_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* MessageDeltaContentImageFileObject_image_file_H_ */