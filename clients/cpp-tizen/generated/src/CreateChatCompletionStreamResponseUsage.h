/*
 * CreateChatCompletionStreamResponse_usage.h
 *
 * An optional field that will only be present when you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60; in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 */

#ifndef _CreateChatCompletionStreamResponse_usage_H_
#define _CreateChatCompletionStreamResponse_usage_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionStreamResponse_usage : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionStreamResponse_usage();
	CreateChatCompletionStreamResponse_usage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionStreamResponse_usage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Number of tokens in the generated completion.
	 */
	int getCompletionTokens();

	/*! \brief Set Number of tokens in the generated completion.
	 */
	void setCompletionTokens(int  completion_tokens);
	/*! \brief Get Number of tokens in the prompt.
	 */
	int getPromptTokens();

	/*! \brief Set Number of tokens in the prompt.
	 */
	void setPromptTokens(int  prompt_tokens);
	/*! \brief Get Total number of tokens used in the request (prompt + completion).
	 */
	int getTotalTokens();

	/*! \brief Set Total number of tokens used in the request (prompt + completion).
	 */
	void setTotalTokens(int  total_tokens);

private:
	int completion_tokens;
	int prompt_tokens;
	int total_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionStreamResponse_usage_H_ */
