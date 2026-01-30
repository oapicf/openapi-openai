/*
 * AssistantsApiResponseFormatOption.h
 *
 * Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_schema\&quot;, \&quot;json_schema\&quot;: {...} }&#x60; enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
 */

#ifndef _AssistantsApiResponseFormatOption_H_
#define _AssistantsApiResponseFormatOption_H_


#include <string>
#include "ResponseFormatJsonObject.h"
#include "ResponseFormatJsonSchema.h"
#include "ResponseFormatJsonSchema_json_schema.h"
#include "ResponseFormatText.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 *
 *  \ingroup Models
 *
 */

class AssistantsApiResponseFormatOption : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantsApiResponseFormatOption();
	AssistantsApiResponseFormatOption(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantsApiResponseFormatOption();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	ResponseFormatJsonSchema_json_schema json_schema;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantsApiResponseFormatOption_H_ */
