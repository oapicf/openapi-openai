
/*
 * CreateChatCompletionRequest_response_format.h
 *
 * An object specifying the format that the model must output.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_schema\&quot;, \&quot;json_schema\&quot;: {...} }&#x60; enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
 */

#ifndef TINY_CPP_CLIENT_CreateChatCompletionRequest_response_format_H_
#define TINY_CPP_CLIENT_CreateChatCompletionRequest_response_format_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ResponseFormatJsonObject.h"
#include "ResponseFormatJsonSchema.h"
#include "ResponseFormatJsonSchema_json_schema.h"
#include "ResponseFormatText.h"

namespace Tiny {


/*! \brief An object specifying the format that the model must output.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest_response_format{
public:

    /*! \brief Constructor.
	 */
    CreateChatCompletionRequest_response_format();
    CreateChatCompletionRequest_response_format(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatCompletionRequest_response_format();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of response format being defined: `text`
	 */
	std::string getType();

	/*! \brief Set The type of response format being defined: `text`
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ResponseFormatJsonSchema_json_schema getJsonSchema();

	/*! \brief Set 
	 */
	void setJsonSchema(ResponseFormatJsonSchema_json_schema  json_schema);


    private:
    std::string type{};
    ResponseFormatJsonSchema_json_schema json_schema;
};
}

#endif /* TINY_CPP_CLIENT_CreateChatCompletionRequest_response_format_H_ */
