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
 * CreateFineTuningJobRequest_integrations_inner_type.h
 *
 * The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported. 
 */

#ifndef CreateFineTuningJobRequest_integrations_inner_type_H_
#define CreateFineTuningJobRequest_integrations_inner_type_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported. 
/// </summary>
class  CreateFineTuningJobRequest_integrations_inner_type
{
public:
    CreateFineTuningJobRequest_integrations_inner_type();
    virtual ~CreateFineTuningJobRequest_integrations_inner_type() = default;


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

    bool operator==(const CreateFineTuningJobRequest_integrations_inner_type& rhs) const;
    bool operator!=(const CreateFineTuningJobRequest_integrations_inner_type& rhs) const;

    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_integrations_inner_type members


    friend  void to_json(nlohmann::json& j, const CreateFineTuningJobRequest_integrations_inner_type& o);
    friend  void from_json(const nlohmann::json& j, CreateFineTuningJobRequest_integrations_inner_type& o);
protected:
    
};

} // namespace org::openapitools::server::model

#endif /* CreateFineTuningJobRequest_integrations_inner_type_H_ */
