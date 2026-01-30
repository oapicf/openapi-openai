/*
 * ChatCompletionStreamOptions.h
 *
 * Options for streaming response. Only set this when you set &#x60;stream: true&#x60;. 
 */

#ifndef _ChatCompletionStreamOptions_H_
#define _ChatCompletionStreamOptions_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Options for streaming response. Only set this when you set `stream: true`. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionStreamOptions : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionStreamOptions();
	ChatCompletionStreamOptions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionStreamOptions();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
	 */
	bool getIncludeUsage();

	/*! \brief Set If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
	 */
	void setIncludeUsage(bool  include_usage);

private:
	bool include_usage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionStreamOptions_H_ */
