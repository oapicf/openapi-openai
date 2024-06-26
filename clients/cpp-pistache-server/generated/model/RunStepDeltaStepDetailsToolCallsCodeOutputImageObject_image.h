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
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h
 *
 * 
 */

#ifndef RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image_H_
#define RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image
{
public:
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image();
    virtual ~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image() = default;


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

    bool operator==(const RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image& rhs) const;
    bool operator!=(const RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image& rhs) const;

    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image members

    /// <summary>
    /// The [file](/docs/api-reference/files) ID of the image.
    /// </summary>
    std::string getFileId() const;
    void setFileId(std::string const& value);
    bool fileIdIsSet() const;
    void unsetFile_id();

    friend  void to_json(nlohmann::json& j, const RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image& o);
    friend  void from_json(const nlohmann::json& j, RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image& o);
protected:
    std::string m_File_id;
    bool m_File_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image_H_ */
